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
	
	public static int MAX_X = 800;
	public static int MAX_Y = 800;
	
	public static int POPULATION_SIZE = 300;

	public static double MAX_HEALTH = 1.0;
	
	
	public static Location getRandomLocation() {
		Random rand = new Random();
		
		return new Location(rand.nextInt(MAX_X),rand.nextInt(MAX_Y));
	}
	
	public void play() throws InterruptedException {
		IplImage frame= cvCreateImage(cvSize(MAX_Y+10, MAX_X+10), 8,3);
		cvNamedWindow("ARENA", CV_WINDOW_AUTOSIZE);
		
		
	//	for(int i=0; i<1000 ; i++) {
			
			//population 1 should attack beast 1
			//population 2 should attack beast 2
			Beast beast1 = new Beast(MAX_HEALTH);
			Beast beast2 = new Beast(MAX_HEALTH);
			BotPopulation population1 = new BotPopulation(POPULATION_SIZE);
			BotPopulation population2 = new BotPopulation(POPULATION_SIZE);
			
			
			while(population1.getSize()>0 && population2.getSize() >0) {
				
				beast1.move();
				beast2.move();
				
				population1.react(beast1);
				population2.react(beast2);
				
				draw(frame, beast1,beast2, population1, population2);
				Thread.sleep(100);
				
				
			}
			if(population1.getSize() > 0 ) {
				System.out.println("POPULATION1 WON");
			}
			if(population2.getSize() > 0 ) {
				System.out.println("POPULATION2 WON");
			}
			
			
		
	//	}
		System.out.println("THE END");
		cvvDestroyWindow("ARENA");
		
	}

	private void draw(IplImage frame, Beast beast1, Beast beast2, BotPopulation population1, BotPopulation population2) {
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
//		System.out.println(beast1.getLocation().getX());
//		System.out.println(beast1.getLocation().getY());
//
//		System.out.println(beast2.getLocation().getX());
//		System.out.println(beast2.getLocation().getY());
		if(beast1.getLocation().getX() > 1 && beast1.getLocation().getY() >1 && beast1.getHealth() >0.0) {
			blue(sI, beast1.getLocation().getX(), beast1.getLocation().getY());
			blue(sI, beast1.getLocation().getX()-1, beast1.getLocation().getY()-1);
			blue(sI, beast1.getLocation().getX(), beast1.getLocation().getY()-1);
			blue(sI, beast1.getLocation().getX()-1, beast1.getLocation().getY());
			blue(sI, beast1.getLocation().getX(), beast1.getLocation().getY());
			blue(sI, beast1.getLocation().getX()+1, beast1.getLocation().getY()+1);
			blue(sI, beast1.getLocation().getX(), beast1.getLocation().getY()+1);
			blue(sI, beast1.getLocation().getX()+1, beast1.getLocation().getY());
			blue(sI, beast1.getLocation().getX()-1, beast1.getLocation().getY()+1);
			blue(sI, beast1.getLocation().getX()+1, beast1.getLocation().getY()+1);
			blue(sI, beast1.getLocation().getX()-1, beast1.getLocation().getY()+1);
			blue(sI, beast1.getLocation().getX()+1, beast1.getLocation().getY()-1);
			
			
		}
		if(beast2.getLocation().getX() > 1 && beast2.getLocation().getY() >1 && beast2.getHealth() >0.0) {

			red(sI, beast2.getLocation().getX(), beast2.getLocation().getY());
			red(sI, beast2.getLocation().getX()-1, beast2.getLocation().getY()-1);
			red(sI, beast2.getLocation().getX(), beast2.getLocation().getY()-1);
			red(sI, beast2.getLocation().getX()-1, beast2.getLocation().getY());
			red(sI, beast2.getLocation().getX(), beast2.getLocation().getY());
			red(sI, beast2.getLocation().getX()+1, beast2.getLocation().getY()+1);
			red(sI, beast2.getLocation().getX(), beast2.getLocation().getY()+1);
			red(sI, beast2.getLocation().getX()+1, beast2.getLocation().getY());
			red(sI, beast2.getLocation().getX()-1, beast2.getLocation().getY()+1);
			red(sI, beast2.getLocation().getX()+1, beast2.getLocation().getY()+1);
			red(sI, beast2.getLocation().getX()-1, beast2.getLocation().getY()+1);
			red(sI, beast2.getLocation().getX()+1, beast2.getLocation().getY()-1);
				
		}
		
		for(Bot bot : population1.getList() ) {
			if(bot.getLocation().getX() > 1 && bot.getLocation().getY() >1) {
//				System.out.println(bot.getLocation().getX() + ","+ bot.getLocation().getY());
				blue(sI,bot.getLocation().getX(), bot.getLocation().getY() );
				blue(sI,bot.getLocation().getX()-1, bot.getLocation().getY()-1 );
				blue(sI,bot.getLocation().getX(), bot.getLocation().getY() -1);
				blue(sI,bot.getLocation().getX()-1, bot.getLocation().getY() );
				
			}
		
		}
		
		for(Bot bot : population2.getList() ) {
			if(bot.getLocation().getX() > 1 && bot.getLocation().getY() >1) {
//				System.out.println(bot.getLocation().getX() + ","+ bot.getLocation().getY());
				red(sI,bot.getLocation().getX(), bot.getLocation().getY() );
				red(sI,bot.getLocation().getX()-1, bot.getLocation().getY()-1 );
				red(sI,bot.getLocation().getX(), bot.getLocation().getY() -1);
				red(sI,bot.getLocation().getX()-1, bot.getLocation().getY() );
				
			}
		
		}
		cvShowImage("ARENA", matconvertor.convertToIplImage(matconvertor.convert(frameMat)));
		
	}

	private void blue(UByteRawIndexer sI, int x, int y) {
		sI.put(x,y,0,255);
		sI.put(x,y,1,0);
		sI.put(x,y,2,0);
	}

	private void red(UByteRawIndexer sI, int x, int y) {
		sI.put(x,y,0,0);
		sI.put(x,y,1,0);
		sI.put(x,y,2,255);
	}

}
