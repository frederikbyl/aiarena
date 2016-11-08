package com.arena.model;

import static org.bytedeco.javacpp.opencv_core.cvCreateImage;
import static org.bytedeco.javacpp.opencv_core.cvSize;
import static org.bytedeco.javacpp.opencv_highgui.CV_WINDOW_AUTOSIZE;
import static org.bytedeco.javacpp.opencv_highgui.cvNamedWindow;
import static org.bytedeco.javacpp.opencv_highgui.cvShowImage;

import static org.bytedeco.javacpp.opencv_highgui.cvvDestroyWindow;
import java.util.Random;

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.indexer.UByteRawIndexer;
import org.bytedeco.javacv.OpenCVFrameConverter;

public class Arena {

	public static int MAX_X = 100;
	public static int MAX_Y = 100;

	public static int POPULATION_SIZE = 100;

	public static double MAX_HEALTH = 1.0;

	public static Location getRandomLocation() {
		Random rand = new Random();

		return new Location(rand.nextInt(MAX_X), rand.nextInt(MAX_Y));
	}

	public void play() throws InterruptedException {
		IplImage frame = cvCreateImage(cvSize(MAX_Y + 30, MAX_X + 30), 8, 3);
		cvNamedWindow("ARENA", CV_WINDOW_AUTOSIZE);

		Brain brain1 = new Brain();
		brain1.initialise();
		Brain brain2 = brain1;

		for (int i = 0; i < 1000000; i++) {
			System.out.println("ITERATION :" + i);
			// population 1 should attack beast 1
			// population 2 should attack beast 2
			Beast beast1 = new Beast(MAX_HEALTH);
			Beast beast2 = new Beast(MAX_HEALTH);
			
			BotPopulation population1 = new BotPopulation(POPULATION_SIZE, brain1);

			BotPopulation population2 = new BotPopulation(POPULATION_SIZE, brain2);

			while (population1.getSize() > 0 && population2.getSize() > 0 && beast1.getHealth() > 0.0
					&& beast2.getHealth() > 0.0) {

				beast1.move();
				beast2.move();
				

				population1.react(beast1);
				population2.react(beast2);

				draw(frame, beast1, beast2, population1, population2);
				Thread.sleep(10);

			}
			if (population1.getSize() > 0 && population2.getSize() > 0 && beast1.getHealth() <= 0.0
					&& beast2.getHealth() > 0.0) {
				System.out.println("POPULATION1 WON: BEAST 1 defeated");
				brain1.print();
				brain2 = brain1;
				brain2.mutate();
			} else if (population1.getSize() > 0 && population2.getSize() > 0 && beast1.getHealth() > 0.0
					&& beast2.getHealth() <= 0.0) {
				System.out.println("POPULATION2 WON: BEAST 2 defeated");
				brain2.print();
				brain1 = brain2;
				brain1.mutate();
			} else if (population1.getSize() > 0 && population2.getSize() == 0) {
				System.out.println("POPULATION1 WON: population2 extinct");
				brain1.print();
				brain2 = brain1;
				brain2.mutate();
			} else if (population1.getSize() == 0 && population2.getSize() > 0) {
				System.out.println("POPULATION2 WON: population1 extinct");
				brain2.print();
				brain1 = brain2;
				brain1.mutate();
			} else if (population1.getSize() == 0 && population2.getSize() == 0) {
				if (beast1.getHealth() > beast2.getHealth()) {
					System.out.println("POPULATION2 WON: both extinct BEAST 2 damaged more");
					brain2.print();
					brain1 = brain2;
					brain1.mutate();
				} else if (beast1.getHealth() < beast2.getHealth()) {
					System.out.println("POPULATION1 WON: both extinct BEAST 1 damaged more");
					brain1.print();
					brain2 = brain1;
					brain2.mutate();
				} else {
					System.out.println("MUTATE BOTH");
					brain1.mutate();
					brain2.mutate();
				}
			}

		}
		System.out.println("THE END");
		cvvDestroyWindow("ARENA");

	}

	private void draw(IplImage frame, Beast beast1, Beast beast2, BotPopulation population1,
			BotPopulation population2) {
		Mat frameMat = new Mat(frame);
		OpenCVFrameConverter.ToIplImage matconvertor = new OpenCVFrameConverter.ToIplImage();
		UByteRawIndexer sI = frameMat.createIndexer();
		for (int x = 0; x < frameMat.rows(); x++) {

			for (int y = 0; y < frameMat.cols(); y++) {
				sI.put(x, y, 0, 255);
				sI.put(x, y, 1, 255);
				sI.put(x, y, 2, 255);

			}
		}
		// System.out.println(beast1.getLocation().getX());
		// System.out.println(beast1.getLocation().getY());
		//
		// System.out.println(beast2.getLocation().getX());
		// System.out.println(beast2.getLocation().getY());
		if (beast1.getLocation().getX() > 1 && beast1.getLocation().getY() > 1 && beast1.getHealth() > 0.0) {
			
			blue(sI, beast1);
		}
		if (beast2.getLocation().getX() > 1 && beast2.getLocation().getY() > 1 && beast2.getHealth() > 0.0) {
			red(sI, beast2);

		}

		for (Bot bot : population1.getList()) {
			if (bot.getLocation().getX() > 1 && bot.getLocation().getY() > 1) {
				
				blue(sI, bot);
				

			}

		}

		for (Bot bot : population2.getList()) {
			if (bot.getLocation().getX() > 1 && bot.getLocation().getY() > 1) {
				
				red(sI, bot);
				
			}

		}
		cvShowImage("ARENA", matconvertor.convertToIplImage(matconvertor.convert(frameMat)));

	}

	private void blue(UByteRawIndexer sI, int x, int y) {
		try {
			if(x>=0 && y>=0 && x<=MAX_X && y<=MAX_Y) {
				sI.put(x, y, 0, 255);
				sI.put(x, y, 1, 0);
				sI.put(x, y, 2, 0);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + x + "," + y);
		}
	}

	private void red(UByteRawIndexer sI, int x, int y) {
		try {
			if(x>=0 && y>=0 && x<=MAX_X && y<=MAX_Y) {
				sI.put(x, y, 0, 0);
				sI.put(x, y, 1, 0);
				sI.put(x, y, 2, 255);	
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + x + "," + y);
		}
	}
	
	private void blue(UByteRawIndexer sI, Beast beast) {
		try {
			int x = beast.getLocation().getX();
			int y = beast.getLocation().getY();
			
			blue(sI, x+2,y+2);
			blue(sI, x+1,y+2);
			blue(sI, x,y+2);
			blue(sI, x-1,y+2);
			blue(sI, x-2,y+2);
			blue(sI, x-2,y+1);
			blue(sI, x-2,y);
			blue(sI, x-2,y-1);
			blue(sI, x-2,y-2);
			blue(sI, x-1,y-2);
			blue(sI, x,y-2);
			blue(sI, x+1,y-2);
			blue(sI, x+2,y-2);
			blue(sI, x+2,y-1);
			blue(sI, x+2,y);
			blue(sI, x+2,y+1);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + beast.getLocation().getX() + "," + beast.getLocation().getY());
		}
	}

	private void blue(UByteRawIndexer sI, Bot bot) {
		try {
			int x = bot.getLocation().getX();
			int y = bot.getLocation().getY();
			int directionx = bot.getFacing().getDirection().getX()/2;
			int directiony = bot.getFacing().getDirection().getY()/2;
			blue(sI, x+directionx,y+directiony);
			blue(sI, x+directionx+directionx,y+directiony+directiony);
			blue(sI, x+1,y);
			blue(sI, x+1,y+1);
			blue(sI, x,y+1);
			blue(sI, x-1,y+1);
			blue(sI, x-1,y);
			blue(sI, x-1,y-1);
			blue(sI, x,y-1);
			blue(sI, x+1,y-1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + bot.getLocation().getX() + "," + bot.getLocation().getY());
		}
	}
	
	private void red(UByteRawIndexer sI,  Bot bot) {
		try {
			
			int x = bot.getLocation().getX();
			int y = bot.getLocation().getY();
			
			int directionx = bot.getFacing().getDirection().getX()/2;
			int directiony = bot.getFacing().getDirection().getY()/2;
			red(sI, x+directionx,y+directiony);
			red(sI, x+directionx+directionx,y+directiony+directiony);
			red(sI, x+1,y);
			red(sI, x+1,y+1);
			red(sI, x,y+1);
			red(sI, x-1,y+1);
			red(sI, x-1,y);
			red(sI, x-1,y-1);
			red(sI, x,y-1);
			red(sI, x+1,y-1);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + bot.getLocation().getX() + "," + bot.getLocation().getY());
		}
	}
	
	private void red(UByteRawIndexer sI,  Beast beast) {
		try {
			
			int x = beast.getLocation().getX();
			int y = beast.getLocation().getY();
			red(sI, x+2,y+2);
			red(sI, x+1,y+2);
			red(sI, x,y+2);
			red(sI, x-1,y+2);
			red(sI, x-2,y+2);
			red(sI, x-2,y+1);
			red(sI, x-2,y);
			red(sI, x-2,y-1);
			red(sI, x-2,y-2);
			red(sI, x-1,y-2);
			red(sI, x,y-2);
			red(sI, x+1,y-2);
			red(sI, x+2,y-2);
			red(sI, x+2,y-1);
			red(sI, x+2,y);
			red(sI, x+2,y+1);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + beast.getLocation().getX() + "," + beast.getLocation().getY());
		}
	}
	
}
