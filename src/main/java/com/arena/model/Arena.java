package com.arena.model;

import static org.bytedeco.javacpp.opencv_core.cvCreateImage;
import static org.bytedeco.javacpp.opencv_core.cvSize;
import static org.bytedeco.javacpp.opencv_highgui.CV_WINDOW_AUTOSIZE;
import static org.bytedeco.javacpp.opencv_highgui.cvNamedWindow;
import static org.bytedeco.javacpp.opencv_highgui.cvShowImage;
import static org.bytedeco.javacpp.opencv_highgui.cvvDestroyWindow;

import java.util.ArrayList;
import java.util.Random;

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.indexer.UByteRawIndexer;
import org.bytedeco.javacv.OpenCVFrameConverter;

public class Arena {

	public static int MAX_X = 200;
	public static int MAX_Y = 200;

	public static int POPULATION_SIZE = 100;
	public static int POPULATIONS = 20;

	public static double MAX_HEALTH = 1.0;

	public static Location getRandomLocation() {
		Random rand = new Random();
		
		return new Location(rand.nextInt(MAX_X), rand.nextInt(MAX_Y));
	}

	public void play() throws InterruptedException {
		IplImage frame = cvCreateImage(cvSize(MAX_Y + 30, MAX_X + 30), 8, 3);
		cvNamedWindow("ARENA", CV_WINDOW_AUTOSIZE);

		
		Brain bestbrain = new Brain();
		bestbrain.initialise();
		Brain secondbestbrain = new Brain();
		secondbestbrain.initialise();
	
		for (int i = 0; i < 100000; i++) {
			//System.out.println("ITERATION :" + i);
			// population 1 should attack beast 1
			// population 2 should attack beast 2
			ArrayList<Beast> beasts = new ArrayList<Beast>();
			ArrayList<BotPopulation> populations = new ArrayList<BotPopulation>();
			ArrayList<Brain> brains = new ArrayList<Brain>();
			//two best unchanged
			brains.add(bestbrain);
			brains.add(secondbestbrain);
			//4 procreated
			brains.add(Brain.procreate1(bestbrain, secondbestbrain));
			brains.add(Brain.procreate2(bestbrain, secondbestbrain));
			brains.add(Brain.procreate3(bestbrain, secondbestbrain));
			brains.add(Brain.procreate4(bestbrain, secondbestbrain));
			//4 mingled
			brains.add(Brain.procreate1(Brain.procreate4(bestbrain, secondbestbrain), Brain.procreate3(bestbrain, secondbestbrain)));
			brains.add(Brain.procreate1(Brain.procreate3(secondbestbrain,bestbrain), Brain.procreate1(bestbrain, secondbestbrain)));
			brains.add(Brain.procreate1(Brain.procreate1(secondbestbrain,bestbrain), Brain.procreate2(bestbrain, secondbestbrain)));
			brains.add(Brain.procreate3(Brain.procreate1(bestbrain, secondbestbrain), Brain.procreate2(bestbrain, secondbestbrain)));
			
			//2 mingled with mutation
			Brain brain1 = new Brain();
			brain1.initialise();
			brains.add(Brain.procreate1(bestbrain, brain1));
			brains.add(Brain.procreate1(brain1, bestbrain));
			
			//1 mutated
			Brain brain2 = bestbrain.clone();
			brain2.mutate();
			brains.add(brain2);
			
			//1 mutated
			Brain brain3 = bestbrain.clone();
			brain3.mutate();
			brains.add(Brain.procreate3(brain3, secondbestbrain));
			Brain brain4 = bestbrain.clone();
			Brain brain5 = secondbestbrain.clone();
			brain4.mutate();
			brain5.mutate();
			brains.add(Brain.procreate3(brain4, brain5));
			
			brains.add(Brain.procreate5(bestbrain, bestbrain));
			
			for(int j = 16; j<POPULATIONS; j++) {
				Brain brain = new Brain();
				brain.initialise();
				brains.add(brain);
			}
			
			for(int j = 0; j<POPULATIONS; j++){
				Beast beast = new Beast(MAX_HEALTH);
				beasts.add(beast);
			}
			for(int j = 0; j<POPULATIONS; j++){
				BotPopulation population = new BotPopulation(POPULATION_SIZE, brains.get(j));
				populations.add(population);
			}
			
		

			for(int k=0; k<100;k++) {

				for(Beast beast : beasts) {
					beast.move();
				}
				
				for(int l=0; l<POPULATIONS; l++) {
					BotPopulation population = populations.get(l);
					population.react(beasts.get(l));
				}
				
				
				if(i>2000) {
					draw(frame, beasts, populations);
					Thread.sleep(100);
				}

			}
			//identify 2 bests, mingle and mutate
			
			
			double bestoneinthisround = -100.00;
			double bestperformance = -100.00;
			double secondbestperformance = -100.00;
		
			
			for(int l = 0; l< POPULATIONS; l++) {
				double result =calculatePerformance(populations.get(l), beasts.get(l));
				if (bestoneinthisround < result) 
					bestoneinthisround = result;
				if(bestperformance< result) {
					if(bestperformance<result && bestperformance>=secondbestperformance) {
						//System.out.println("best:"+l);
						secondbestperformance = bestperformance;
						secondbestbrain = bestbrain.clone();
						bestperformance = result;
						bestbrain = populations.get(l).getBrain().clone();
					}
					
				} else if( secondbestperformance<result){
					//System.out.println("secondbest:"+l);
					secondbestperformance = result;
					secondbestbrain = populations.get(l).getBrain().clone();
				}
				
			}
			System.out.println(i+";"+bestoneinthisround+";"+bestperformance +";"+ secondbestperformance);
			//bestbrain.print();
			//secondbestbrain.print();
			

		}
		System.out.println("THE END");
		cvvDestroyWindow("ARENA");

	}


	private double calculatePerformance(BotPopulation population, Beast beast) {
		double botlives = 0.0;
		boolean turnedhit = false;
		boolean movedhit = false;
		boolean turnedmovedhit =false;
		boolean hit = false;
		boolean shotnothinghit = false;
		for (Bot bot : population.getList()) {
			if(bot.turned  && bot.hit)
			{
				turnedhit = true;
					botlives += 100;	
			}
			if(bot.moved  && bot.hit)
			{
				movedhit = true;
					botlives += 50;	
			}
			if(bot.turned  && bot.hit && bot.moved)
			{
				turnedmovedhit = true;
					botlives += 500;	
			}
			if(bot.hit) {
				hit = true;
				botlives += 10;	
			}
			if(bot.getHealth() >0.98) {
				botlives +=50;
			}
			
			if(!bot.shot) {
				shotnothinghit = true;
				botlives -=100;
			}
				
		}
		botlives = botlives - beast.getHealth();
		System.out.println("RESUlt :" + turnedhit + " " +movedhit + " " + turnedmovedhit + " "+ hit +" "+ shotnothinghit);
		return botlives;
		
	}


	private void draw(IplImage frame, ArrayList<Beast> beasts, ArrayList<BotPopulation> bots) {
	
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
	
		int i = 0;
		for(Beast beast : beasts) {
			i++;
			if (beast.getLocation().getX() > 1 && beast.getLocation().getY() > 1) { // && beast.getHealth() > 0.0
				if(i<4)
					draw(sI, beast, i);
			}
	
		}
		i=0;
		for(BotPopulation population: bots) {
			
			i++;
			for (Bot bot : population.getList()) {
				if (bot.getLocation().getX() > 1 && bot.getLocation().getY() > 1) {
					if(i<4)
						draw(sI, bot, i);
					
				}

			}

		}
		
		cvShowImage("ARENA", matconvertor.convertToIplImage(matconvertor.convert(frameMat)));

	}

	private void draw(UByteRawIndexer sI, int x, int y, int i) {
		try {
			Random rand = new Random();
			if(x>=0 && y>=0 && x<=MAX_X && y<=MAX_Y) {
				
				sI.put(x, y, 0, (i*5)%250);
				sI.put(x, y, 1, (i*27)%250);
				sI.put(x, y, 2, (i*49)%250);
			
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + x + "," + y);
		}
	}

	private void drawBlack(UByteRawIndexer sI, int x, int y) {
		try {
			
			if(x>=0 && y>=0 && x<=MAX_X && y<=MAX_Y) {
					sI.put(x, y, 0, 0);
					sI.put(x, y, 1, 0);
					sI.put(x, y, 2, 0);
			
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + x + "," + y);
		}
	}
	
	private void drawRed(UByteRawIndexer sI, int x, int y) {
		try {
			
			if(x>=0 && y>=0 && x<=MAX_X && y<=MAX_Y) {
					sI.put(x, y, 0, 0);
					sI.put(x, y, 1, 255);
					sI.put(x, y, 2, 0);
			
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + x + "," + y);
		}
	}
	
	private void draw(UByteRawIndexer sI, Beast beast, int i) {
		try {
			int x = beast.getLocation().getX();
			x+=10;
			int y = beast.getLocation().getY();
			y+=10;
			draw(sI, x,y, i);
			draw(sI, x+2,y+2, i);
			draw(sI, x+1,y+2, i);
			draw(sI, x,y+2, i);
			draw(sI, x-1,y+2, i);
			draw(sI, x-2,y+2, i);
			draw(sI, x-2,y+1, i);
			draw(sI, x-2,y, i);
			draw(sI, x-2,y-1, i);
			draw(sI, x-2,y-2, i);
			draw(sI, x-1,y-2, i);
			draw(sI, x,y-2, i);
			draw(sI, x+1,y-2, i);
			draw(sI, x+2,y-2, i);
			draw(sI, x+2,y-1, i);
			draw(sI, x+2,y, i);
			draw(sI, x+2,y+1, i);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + beast.getLocation().getX() + "," + beast.getLocation().getY());
		}
	}

	private void draw(UByteRawIndexer sI, Bot bot, int i) {
		try {
			int x = bot.getLocation().getX();
			x+=10;
			int y = bot.getLocation().getY();
			y+=10;
			int directionx = bot.getFacing().getDirection().getX();
			int directiony = bot.getFacing().getDirection().getY();
			draw(sI, x+directionx,y+directiony, i);
			draw(sI, x+directionx+directionx,y+directiony+directiony, i);
			draw(sI, x+directionx+directionx+directionx,y+directiony+directiony+directiony, i);
			draw(sI, x+directionx+directionx+directionx+directionx,y+directiony+directiony+directiony+directiony, i);
			draw(sI, x+1,y, i);
			draw(sI, x+1,y+1, i);
			draw(sI, x,y+1, i);
			draw(sI, x-1,y+1, i);
			draw(sI, x-1,y, i);
			draw(sI, x-1,y-1, i);
			draw(sI, x,y-1, i);
			draw(sI, x+1,y-1, i);
			if(bot.shooting) {
				drawBlack(sI, x+directionx+directionx+directionx+directionx+directionx+directionx,y+directiony+directiony+directiony+directiony+directiony+directiony);
				drawBlack(sI, x+directionx+directionx+directionx+directionx+directionx+directionx+directionx+directionx+directionx,y+directiony+directiony+directiony+directiony+directiony+directiony+directiony+directiony+directiony);
				
			}
			if(bot.shooting && bot.hit) {
				drawRed(sI, x+directionx+directionx+directionx+directionx+directionx+directionx,y+directiony+directiony+directiony+directiony+directiony+directiony);
				drawRed(sI, x+directionx+directionx+directionx+directionx+directionx+directionx+directionx+directionx+directionx,y+directiony+directiony+directiony+directiony+directiony+directiony+directiony+directiony+directiony);
				drawRed(sI, x+directionx+directionx+directionx+directionx+directionx+directionx+directionx+directionx+directionx+directionx,y+directiony+directiony+directiony+directiony+directiony+directiony+directiony+directiony+directiony+directiony);	
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + bot.getLocation().getX() + "," + bot.getLocation().getY());
		}
	}

	
	

}
	

