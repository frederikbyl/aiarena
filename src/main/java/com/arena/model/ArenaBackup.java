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

public class ArenaBackup {

	public static int MAX_X = 100;
	public static int MAX_Y = 100;

	public static int ITERATION = 1;
	public static int POPULATION_SIZE = 10;

	public static double MAX_HEALTH = 1.0;

	public static Location getRandomLocation() {
		Random rand = new Random();

		return new Location(rand.nextInt(MAX_X), rand.nextInt(MAX_Y));
	}

	public void play() throws InterruptedException {
		IplImage frame = cvCreateImage(cvSize(MAX_Y + 30, MAX_X + 30), 8, 3);
		cvNamedWindow("ARENA", CV_WINDOW_AUTOSIZE);

		for(int population_size = 1; population_size < POPULATION_SIZE; population_size++) {
			
		}
		Brain brain1 = new Brain();
		brain1.initialise();
		Brain brain2 = brain1.clone();
		brain2.mutate();
		Brain brain3 = brain2.clone();
		brain3.mutate();
		Brain brain4 = brain3.clone();
		brain4.mutate();
		Brain brain5 = brain4.clone();
		brain5.mutate();
		Brain brain6 = brain5.clone();
		brain6.mutate();
		Brain brain7 = brain6.clone();
		brain7.mutate();
		Brain brain8 = brain7.clone();
		brain8.mutate();
		Brain brain9 = brain8.clone();
		brain9.mutate();
		Brain brain10 = brain9.clone();
		brain10.mutate();
		Brain brain11 = brain10.clone();
		brain11.mutate();
		Brain brain12 = brain11.clone();
		brain12.mutate();
		Brain brain13 = brain12.clone();
		brain13.mutate();
		Brain brain14 = brain13.clone();
		brain14.mutate();
		Brain brain15 = brain14.clone();
		brain15.mutate();
		Brain brain16 = brain15.clone();
		brain16.mutate();
		Brain brain17 = brain16.clone();
		brain17.mutate();
		Brain brain18 = brain17.clone();
		brain18.mutate();
		Brain brain19 = brain18.clone();
		brain19.mutate();
		Brain brain20 = brain19.clone();
		brain20.mutate();

		for (ITERATION = 1; ITERATION < 1000000; ITERATION++) {
			System.out.println("ITERATION :" + ITERATION);
			// population 1 should attack beast 1
			// population 2 should attack beast 2
			Beast beast1 = new Beast(MAX_HEALTH);
			Beast beast2 = new Beast(MAX_HEALTH);
			Beast beast3 = new Beast(MAX_HEALTH);
			Beast beast4 = new Beast(MAX_HEALTH);
			Beast beast5 = new Beast(MAX_HEALTH);
			Beast beast6 = new Beast(MAX_HEALTH);
			Beast beast7 = new Beast(MAX_HEALTH);
			Beast beast8 = new Beast(MAX_HEALTH);
			Beast beast9 = new Beast(MAX_HEALTH);
			Beast beast10 = new Beast(MAX_HEALTH);
			Beast beast11 = new Beast(MAX_HEALTH);
			Beast beast12 = new Beast(MAX_HEALTH);
			Beast beast13 = new Beast(MAX_HEALTH);
			Beast beast14 = new Beast(MAX_HEALTH);
			Beast beast15 = new Beast(MAX_HEALTH);
			Beast beast16 = new Beast(MAX_HEALTH);
			Beast beast17 = new Beast(MAX_HEALTH);
			Beast beast18 = new Beast(MAX_HEALTH);
			Beast beast19 = new Beast(MAX_HEALTH);
			Beast beast20 = new Beast(MAX_HEALTH);
			
			BotPopulation population1 = new BotPopulation(POPULATION_SIZE, brain1);
			BotPopulation population2 = new BotPopulation(POPULATION_SIZE, brain2);
			BotPopulation population3 = new BotPopulation(POPULATION_SIZE, brain3);
			BotPopulation population4 = new BotPopulation(POPULATION_SIZE, brain4);
			BotPopulation population5 = new BotPopulation(POPULATION_SIZE, brain5);
			BotPopulation population6 = new BotPopulation(POPULATION_SIZE, brain6);
			BotPopulation population7 = new BotPopulation(POPULATION_SIZE, brain7);
			BotPopulation population8 = new BotPopulation(POPULATION_SIZE, brain8);
			BotPopulation population9 = new BotPopulation(POPULATION_SIZE, brain9);
			BotPopulation population10 = new BotPopulation(POPULATION_SIZE, brain10);
			BotPopulation population11 = new BotPopulation(POPULATION_SIZE, brain11);
			BotPopulation population12 = new BotPopulation(POPULATION_SIZE, brain12);
			BotPopulation population13 = new BotPopulation(POPULATION_SIZE, brain13);
			BotPopulation population14 = new BotPopulation(POPULATION_SIZE, brain14);
			BotPopulation population15 = new BotPopulation(POPULATION_SIZE, brain15);
			BotPopulation population16 = new BotPopulation(POPULATION_SIZE, brain16);
			BotPopulation population17 = new BotPopulation(POPULATION_SIZE, brain17);
			BotPopulation population18 = new BotPopulation(POPULATION_SIZE, brain18);
			BotPopulation population19 = new BotPopulation(POPULATION_SIZE, brain19);
			BotPopulation population20 = new BotPopulation(POPULATION_SIZE, brain20);

			while (population1.getSize() > 0 && 
					population2.getSize() > 0 &&
					population3.getSize() > 0 &&
					population4.getSize() > 0 &&
					population5.getSize() > 0 &&
					population6.getSize() > 0 &&
					population7.getSize() > 0 &&
					population8.getSize() > 0 &&
					population9.getSize() > 0 &&
					population10.getSize() > 0 &&
					population11.getSize() > 0 &&
					population12.getSize() > 0 &&
					population13.getSize() > 0 &&
					population14.getSize() > 0 &&
					population15.getSize() > 0 &&
					population16.getSize() > 0 &&
					population17.getSize() > 0 &&
					population18.getSize() > 0 &&
					population19.getSize() > 0 &&
					population20.getSize() > 0 &&
					beast1.getHealth() > 0.0 && 
					beast2.getHealth() > 0.0 &&
					beast3.getHealth() > 0.0 &&
					beast4.getHealth() > 0.0 &&
					beast5.getHealth() > 0.0 &&
					beast6.getHealth() > 0.0 &&
					beast7.getHealth() > 0.0 &&
					beast8.getHealth() > 0.0 &&
					beast9.getHealth() > 0.0 &&
					beast10.getHealth() > 0.0 &&
					beast11.getHealth() > 0.0 &&
					beast12.getHealth() > 0.0 &&
					beast13.getHealth() > 0.0 &&
					beast14.getHealth() > 0.0 &&
					beast15.getHealth() > 0.0 &&
					beast16.getHealth() > 0.0 &&
					beast17.getHealth() > 0.0 &&
					beast18.getHealth() > 0.0 &&
					beast19.getHealth() > 0.0 &&
					beast20.getHealth() > 0.0) {

				beast1.move();
				beast2.move();
				beast3.move();
				beast4.move();
				beast5.move();
				beast6.move();
				beast7.move();
				beast8.move();
				beast9.move();
				beast10.move();
				beast11.move();
				beast12.move();
				beast13.move();
				beast14.move();
				beast15.move();
				beast16.move();
				beast17.move();
				beast18.move();
				beast19.move();
				beast20.move();
				

				population1.react(beast1);
				population2.react(beast2);
				population3.react(beast3);
				population4.react(beast4);
				population5.react(beast5);
				population6.react(beast6);
				population7.react(beast7);
				population8.react(beast8);
				population9.react(beast9);
				population10.react(beast10);
				population11.react(beast11);
				population12.react(beast12);
				population13.react(beast13);
				population14.react(beast14);
				population15.react(beast15);
				population16.react(beast16);
				population17.react(beast17);
				population18.react(beast18);
				population19.react(beast19);
				population20.react(beast20);

				ArrayList<Beast> beasts = new ArrayList<Beast>();
				beasts.add(beast1);
				beasts.add(beast2);
				beasts.add(beast3);
				beasts.add(beast4);
				beasts.add(beast5);
				beasts.add(beast6);
				beasts.add(beast7);
				beasts.add(beast8);
				beasts.add(beast9);
				beasts.add(beast10);
				beasts.add(beast11);
				beasts.add(beast12);
				beasts.add(beast13);
				beasts.add(beast14);
				beasts.add(beast15);
				beasts.add(beast16);
				beasts.add(beast17);
				beasts.add(beast18);
				beasts.add(beast19);
				beasts.add(beast20);
				ArrayList<BotPopulation> bots = new ArrayList<BotPopulation>();
				bots.add(population1);
				bots.add(population2);
				bots.add(population3);
				bots.add(population4);
				bots.add(population5);
				bots.add(population6);
				bots.add(population7);
				bots.add(population8);
				bots.add(population9);
				bots.add(population10);
				bots.add(population11);
				bots.add(population12);
				bots.add(population13);
				bots.add(population14);
				bots.add(population15);
				bots.add(population16);
				bots.add(population17);
				bots.add(population18);
				bots.add(population19);
				bots.add(population20);
				draw(frame, beasts, bots);
				Thread.sleep(100);

			}
			double bot1 = calculatePerformance(population1, beast1);
			double bot2 = calculatePerformance(population2, beast2);
			double bot3 = calculatePerformance(population3, beast3);
			double bot4 = calculatePerformance(population4, beast4);
			double bot5 = calculatePerformance(population5, beast5);
			double bot6 = calculatePerformance(population6, beast6);
			double bot7 = calculatePerformance(population7, beast7);
			double bot8 = calculatePerformance(population8, beast8);
			double bot9 = calculatePerformance(population9, beast9);
			double bot10 = calculatePerformance(population10, beast10);
			double bot11 = calculatePerformance(population11, beast11);
			double bot12 = calculatePerformance(population12, beast12);
			double bot13 = calculatePerformance(population13, beast13);
			double bot14 = calculatePerformance(population14, beast14);
			double bot15 = calculatePerformance(population15, beast15);
			double bot16 = calculatePerformance(population16, beast16);
			double bot17 = calculatePerformance(population17, beast17);
			double bot18 = calculatePerformance(population18, beast18);
			double bot19 = calculatePerformance(population19, beast19);
			double bot20 = calculatePerformance(population20, beast20);
			
			if (bot1 > bot2 &&
					bot1 > bot3 &&
					bot1 > bot4 &&
					bot1 > bot5 &&
					bot1 > bot6 &&
					bot1 > bot7 &&
					bot1 > bot8 &&
					bot1 > bot9 &&
					bot1 > bot10 &&
					bot1 > bot11 &&
					bot1 > bot12 &&
					bot1 > bot13 &&
					bot1 > bot14 &&
					bot1 > bot15 &&
					bot1 > bot16 &&
					bot1 > bot17 &&
					bot1 > bot18 &&
					bot1 > bot19 &&
					bot1 > bot20) {
				
				brain1.print();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot2 > bot1 &&
					bot2 > bot3 &&
					bot2 > bot4 &&
					bot2 > bot5 &&
					bot2 > bot6 &&
					bot2 > bot7 &&
					bot2 > bot8 &&
					bot2 > bot9 &&
					bot2 > bot10 &&
					bot2 > bot11 &&
					bot2 > bot12 &&
					bot2 > bot13 &&
					bot2 > bot14 &&
					bot2 > bot15 &&
					bot2 > bot16 &&
					bot2 > bot17 &&
					bot2 > bot18 &&
					bot2 > bot19 &&
					bot2 > bot20) {
				
				brain2.print();
				brain1 = brain2.clone();
				brain1.mutate();
				brain3 = brain1.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot3 > bot2 &&
					bot3 > bot1 &&
					bot3 > bot4 &&
					bot3 > bot5 &&
					bot3 > bot6 &&
					bot3 > bot7 &&
					bot3 > bot8 &&
					bot3 > bot9 &&
					bot3 > bot10 &&
					bot3 > bot11 &&
					bot3 > bot12 &&
					bot3 > bot13 &&
					bot3 > bot14 &&
					bot3 > bot15 &&
					bot3 > bot16 &&
					bot3 > bot17 &&
					bot3 > bot18 &&
					bot3 > bot19 &&
					bot3 > bot20) {
				
				brain3.print();
				brain1=brain3.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain4 = brain2.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot4 > bot2 &&
					bot4 > bot3 &&
					bot4 > bot1 &&
					bot4 > bot5 &&
					bot4 > bot6 &&
					bot4 > bot7 &&
					bot4 > bot8 &&
					bot4 > bot9 &&
					bot4 > bot10 &&
					bot4 > bot11 &&
					bot4 > bot12 &&
					bot4 > bot13 &&
					bot4 > bot14 &&
					bot4 > bot15 &&
					bot4 > bot16 &&
					bot4 > bot17 &&
					bot4 > bot18 &&
					bot4 > bot19 &&
					bot4 > bot20) {
				
				brain4.print();
				brain1=brain4.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
//				brain4 = brain3.clone();
//				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot5 > bot2 &&
					bot5 > bot3 &&
					bot5 > bot1 &&
					bot5 > bot4 &&
					bot5 > bot6 &&
					bot5 > bot7 &&
					bot5 > bot8 &&
					bot5 > bot9 &&
					bot5 > bot10 &&
					bot5 > bot11 &&
					bot5 > bot12 &&
					bot5 > bot13 &&
					bot5 > bot14 &&
					bot5 > bot15 &&
					bot5 > bot16 &&
					bot5 > bot17 &&
					bot5 > bot18 &&
					bot5 > bot19 &&
					bot5 > bot20) {
				
				brain5.print();
				brain1=brain5.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
//				brain5 = brain4.clone();
//				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot6 > bot1 &&
					bot6 > bot2 &&
					bot6 > bot3 &&
					bot6 > bot4 &&
					bot6 > bot5 &&
					bot6 > bot7 &&
					bot6 > bot8 &&
					bot6 > bot9 &&
					bot6 > bot10 &&
					bot6 > bot11 &&
					bot6 > bot12 &&
					bot6 > bot13 &&
					bot6 > bot14 &&
					bot6 > bot15 &&
					bot6 > bot16 &&
					bot6 > bot17 &&
					bot6 > bot18 &&
					bot6 > bot19 &&
					bot6 > bot20) {
				
				brain6.print();
				brain1=brain6.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
//				brain6 = brain5.clone();
//				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot7 > bot1 &&
					bot7 > bot2 &&
					bot7 > bot3 &&
					bot7 > bot4 &&
					bot7 > bot5 &&
					bot7 > bot6 &&
					bot7 > bot8 &&
					bot7 > bot9 &&
					bot7 > bot10 &&
					bot7 > bot11 &&
					bot7 > bot12 &&
					bot7 > bot13 &&
					bot7 > bot14 &&
					bot7 > bot15 &&
					bot7 > bot16 &&
					bot7 > bot17 &&
					bot7 > bot18 &&
					bot7 > bot19 &&
					bot7 > bot20) {
				
				brain7.print();
				brain1=brain7.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
//				brain7 = brain6.clone();
//				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot8 > bot1 &&
					bot8 > bot2 &&
					bot8 > bot3 &&
					bot8 > bot4 &&
					bot8 > bot5 &&
					bot8 > bot6 &&
					bot8 > bot7 &&
					bot8 > bot9 &&
					bot8 > bot10 &&
					bot8 > bot11 &&
					bot8 > bot12 &&
					bot8 > bot13 &&
					bot8 > bot14 &&
					bot8 > bot15 &&
					bot8 > bot16 &&
					bot8 > bot17 &&
					bot8 > bot18 &&
					bot8 > bot19 &&
					bot8 > bot20) {
				
				brain8.print();
				brain1=brain8.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
//				brain8 = brain7.clone();
//				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot9 > bot1 &&
					bot9 > bot2 &&
					bot9 > bot3 &&
					bot9 > bot4 &&
					bot9 > bot5 &&
					bot9 > bot6 &&
					bot9 > bot7 &&
					bot9 > bot8 &&
					bot9 > bot10 &&
					bot9 > bot11 &&
					bot9 > bot12 &&
					bot9 > bot13 &&
					bot9 > bot14 &&
					bot9 > bot15 &&
					bot9 > bot16 &&
					bot9 > bot17 &&
					bot9 > bot18 &&
					bot9 > bot19 &&
					bot9 > bot20) {
				
				brain9.print();
				brain1=brain9.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
//				brain9 = brain8.clone();
//				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			}  else if (bot10 > bot1 &&
					bot10 > bot2 &&
					bot10 > bot3 &&
					bot10 > bot4 &&
					bot10 > bot5 &&
					bot10 > bot6 &&
					bot10 > bot7 &&
					bot10 > bot8 &&
					bot10 > bot9 &&
					bot10 > bot11 &&
					bot10 > bot12 &&
					bot10 > bot13 &&
					bot10 > bot14 &&
					bot10 > bot15 &&
					bot10 > bot16 &&
					bot10 > bot17 &&
					bot10 > bot18 &&
					bot10 > bot19 &&
					bot10 > bot20) {
				
				brain10.print();
				brain1=brain10.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
//				brain10 = brain9.clone();
//				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			}  else if (bot11 > bot1 &&
					bot11 > bot2 &&
					bot11 > bot3 &&
					bot11 > bot4 &&
					bot11 > bot5 &&
					bot11 > bot6 &&
					bot11 > bot7 &&
					bot11 > bot8 &&
					bot11 > bot9 &&
					bot11 > bot10 &&
					bot11 > bot12 &&
					bot11 > bot13 &&
					bot11 > bot14 &&
					bot11 > bot15 &&
					bot11 > bot16 &&
					bot11 > bot17 &&
					bot11 > bot18 &&
					bot11 > bot19 &&
					bot11 > bot20) {
				
				brain11.print();
				brain1=brain11.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
//				brain11 = brain10.clone();
//				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			}  else if (bot12 > bot1 &&
					bot12 > bot2 &&
					bot12 > bot3 &&
					bot12 > bot4 &&
					bot12 > bot5 &&
					bot12 > bot6 &&
					bot12 > bot7 &&
					bot12 > bot8 &&
					bot12 > bot9 &&
					bot12 > bot10 &&
					bot12 > bot11 &&
					bot12 > bot13 &&
					bot12 > bot14 &&
					bot12 > bot15 &&
					bot12 > bot16 &&
					bot12 > bot17 &&
					bot12 > bot18 &&
					bot12 > bot19 &&
					bot12 > bot20) {
				
				brain12.print();
				brain1=brain12.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
//				brain12 = brain11.clone();
//				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot13 > bot1 &&
					bot13 > bot2 &&
					bot13 > bot3 &&
					bot13 > bot4 &&
					bot13 > bot5 &&
					bot13 > bot6 &&
					bot13 > bot7 &&
					bot13 > bot8 &&
					bot13 > bot9 &&
					bot13 > bot10 &&
					bot13 > bot11 &&
					bot13 > bot12 &&
					bot13 > bot14 &&
					bot13 > bot15 &&
					bot13 > bot16 &&
					bot13 > bot17 &&
					bot13 > bot18 &&
					bot13 > bot19 &&
					bot13 > bot20) {
				
				brain13.print();
				brain1=brain13.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
//				brain13 = brain12.clone();
//				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			}  else if (bot14 > bot1 &&
					bot14 > bot2 &&
					bot14 > bot3 &&
					bot14 > bot4 &&
					bot14 > bot5 &&
					bot14 > bot6 &&
					bot14 > bot7 &&
					bot14 > bot8 &&
					bot14 > bot9 &&
					bot14 > bot10 &&
					bot14 > bot11 &&
					bot14 > bot12 &&
					bot14 > bot13 &&
					bot14 > bot15 &&
					bot14 > bot16 &&
					bot14 > bot17 &&
					bot14 > bot18 &&
					bot14 > bot19 &&
					bot14 > bot20) {
				
				brain14.print();
				brain1=brain14.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
//				brain14 = brain13.clone();
//				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot15 > bot1 &&
					bot15 > bot2 &&
					bot15 > bot3 &&
					bot15 > bot4 &&
					bot15 > bot5 &&
					bot15 > bot6 &&
					bot15 > bot7 &&
					bot15 > bot8 &&
					bot15 > bot9 &&
					bot15 > bot10 &&
					bot15 > bot11 &&
					bot15 > bot12 &&
					bot15 > bot13 &&
					bot15 > bot14 &&
					bot15 > bot16 &&
					bot15 > bot17 &&
					bot15 > bot18 &&
					bot15 > bot19 &&
					bot15 > bot20) {
				
				brain15.print();
				brain1=brain15.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
//				brain15 = brain14.clone();
//				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot16 > bot1 &&
					bot16 > bot2 &&
					bot16 > bot3 &&
					bot16 > bot4 &&
					bot16 > bot5 &&
					bot16 > bot6 &&
					bot16 > bot7 &&
					bot16 > bot8 &&
					bot16 > bot9 &&
					bot16 > bot10 &&
					bot16 > bot11 &&
					bot16 > bot12 &&
					bot16 > bot13 &&
					bot16 > bot14 &&
					bot16 > bot15 &&
					bot16 > bot17 &&
					bot16 > bot18 &&
					bot16 > bot19 &&
					bot16 > bot20) {
				
				brain16.print();
				brain1=brain16.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
//				brain16 = brain15.clone();
//				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot17 > bot1 &&
					bot17 > bot2 &&
					bot17 > bot3 &&
					bot17 > bot4 &&
					bot17 > bot5 &&
					bot17 > bot6 &&
					bot17 > bot7 &&
					bot17 > bot8 &&
					bot17 > bot9 &&
					bot17 > bot10 &&
					bot17 > bot11 &&
					bot17 > bot12 &&
					bot17 > bot13 &&
					bot17 > bot14 &&
					bot17 > bot15 &&
					bot17 > bot16 &&
					bot17 > bot18 &&
					bot17 > bot19 &&
					bot17 > bot20) {
				
				brain17.print();
				brain1=brain17.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
//				brain17 = brain16.clone();
//				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot18 > bot1 &&
					bot18 > bot2 &&
					bot18 > bot3 &&
					bot18 > bot4 &&
					bot18 > bot5 &&
					bot18 > bot6 &&
					bot18 > bot7 &&
					bot18 > bot8 &&
					bot18 > bot9 &&
					bot18 > bot10 &&
					bot18 > bot11 &&
					bot18 > bot12 &&
					bot18 > bot13 &&
					bot18 > bot14 &&
					bot18 > bot15 &&
					bot18 > bot16 &&
					bot18 > bot17 &&
					bot18 > bot19 &&
					bot18 > bot20) {
				
				brain18.print();
				brain1=brain18.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
//				brain18 = brain17.clone();
//				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot19 > bot1 &&
					bot19 > bot2 &&
					bot19 > bot3 &&
					bot19 > bot4 &&
					bot19 > bot5 &&
					bot19 > bot6 &&
					bot19 > bot7 &&
					bot19 > bot8 &&
					bot19 > bot9 &&
					bot19 > bot10 &&
					bot19 > bot11 &&
					bot19 > bot12 &&
					bot19 > bot13 &&
					bot19 > bot14 &&
					bot19 > bot15 &&
					bot19 > bot16 &&
					bot19 > bot17 &&
					bot19 > bot18 &&
					bot19 > bot20) {
				
				brain19.print();
				brain1=brain19.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
//				brain19 = brain18.clone();
//				brain19.mutate();
				brain20 = brain19.clone();
				brain20.mutate();
			} else if (bot20 > bot1 &&
					bot20 > bot2 &&
					bot20 > bot3 &&
					bot20 > bot4 &&
					bot20 > bot5 &&
					bot20 > bot6 &&
					bot20 > bot7 &&
					bot20 > bot8 &&
					bot20 > bot9 &&
					bot20 > bot10 &&
					bot20 > bot11 &&
					bot20 > bot12 &&
					bot20 > bot13 &&
					bot20 > bot14 &&
					bot20 > bot15 &&
					bot20 > bot16 &&
					bot20 > bot17 &&
					bot20 > bot18 &&
					bot20 > bot19) {
				
				brain20.print();
				brain1=brain20.clone();
				brain1.mutate();
				brain2 = brain1.clone();
				brain2.mutate();
				brain3 = brain2.clone();
				brain3.mutate();
				brain4 = brain3.clone();
				brain4.mutate();
				brain5 = brain4.clone();
				brain5.mutate();
				brain6 = brain5.clone();
				brain6.mutate();
				brain7 = brain6.clone();
				brain7.mutate();
				brain8 = brain7.clone();
				brain8.mutate();
				brain9 = brain8.clone();
				brain9.mutate();
				brain10 = brain9.clone();
				brain10.mutate();
				brain11 = brain10.clone();
				brain11.mutate();
				brain12 = brain11.clone();
				brain12.mutate();
				brain13 = brain12.clone();
				brain13.mutate();
				brain14 = brain13.clone();
				brain14.mutate();
				brain15 = brain14.clone();
				brain15.mutate();
				brain16 = brain15.clone();
				brain16.mutate();
				brain17 = brain16.clone();
				brain17.mutate();
				brain18 = brain17.clone();
				brain18.mutate();
				brain19 = brain18.clone();
				brain19.mutate();
//				brain20 = brain19.clone();
//				brain20.mutate();
			} else {
				
				brain1.mutate();
				brain2.mutate();
				brain3.mutate();
				brain4.mutate();
				brain5.mutate();
				brain6.mutate();
				brain7.mutate();
				brain8.mutate();
				brain9.mutate();
				brain10.mutate();
				brain11.mutate();
				brain12.mutate();
				brain13.mutate();
				brain14.mutate();
				brain15.mutate();
				brain16.mutate();
				brain17.mutate();
				brain18.mutate();
				brain19.mutate();
				brain20.mutate();
			}

		}
		System.out.println("THE END");
		cvvDestroyWindow("ARENA");

	}

	private double calculatePerformance(BotPopulation population, Beast beast) {
		double botlives = 0.0;
		for (Bot bot : population.getList()) {
			botlives += bot.getHealth();
		}
		if(population.getSize()>0.0) {
			botlives = botlives/((double) population.getSize());	
		}
		//System.out.println(botlives +" " + beast.getHealth() +" " + population.getSize());
		botlives = botlives - beast.getHealth();
		System.out.println("result = " + botlives );
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
		// System.out.println(beast1.getLocation().getX());
		// System.out.println(beast1.getLocation().getY());
		//
		// System.out.println(beast2.getLocation().getX());
		// System.out.println(beast2.getLocation().getY());
		int i = 0;
		for(Beast beast : beasts) {
			i++;
			if (beast.getLocation().getX() > 1 && beast.getLocation().getY() > 1 && beast.getHealth() > 0.0) {
				
				blue(sI, beast, i);
			}
	
		}
		i=0;
		for(BotPopulation population: bots) {
			
			i++;
			for (Bot bot : population.getList()) {
				if (bot.getLocation().getX() > 1 && bot.getLocation().getY() > 1) {
					
					blue(sI, bot, i);
					

				}

			}

		}
		
		cvShowImage("ARENA", matconvertor.convertToIplImage(matconvertor.convert(frameMat)));

	}

	private void blue(UByteRawIndexer sI, int x, int y, int i) {
		try {
			
			if(x>=0 && y>=0 && x<=MAX_X && y<=MAX_Y) {
				sI.put(x, y, 0, (i*5)%250);
				sI.put(x, y, 1, (i*27)%250);
				sI.put(x, y, 2, (i*49)%250);
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
	
	private void blue(UByteRawIndexer sI, Beast beast, int i) {
		try {
			int x = beast.getLocation().getX();
			int y = beast.getLocation().getY();
			
			blue(sI, x+2,y+2, i);
			blue(sI, x+1,y+2, i);
			blue(sI, x,y+2, i);
			blue(sI, x-1,y+2, i);
			blue(sI, x-2,y+2, i);
			blue(sI, x-2,y+1, i);
			blue(sI, x-2,y, i);
			blue(sI, x-2,y-1, i);
			blue(sI, x-2,y-2, i);
			blue(sI, x-1,y-2, i);
			blue(sI, x,y-2, i);
			blue(sI, x+1,y-2, i);
			blue(sI, x+2,y-2, i);
			blue(sI, x+2,y-1, i);
			blue(sI, x+2,y, i);
			blue(sI, x+2,y+1, i);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX OUT OF BOUNDS: " + beast.getLocation().getX() + "," + beast.getLocation().getY());
		}
	}

	private void blue(UByteRawIndexer sI, Bot bot, int i) {
		try {
			int x = bot.getLocation().getX();
			int y = bot.getLocation().getY();
			int directionx = bot.getFacing().getDirection().getX()/2;
			int directiony = bot.getFacing().getDirection().getY()/2;
			blue(sI, x+directionx,y+directiony, i);
			blue(sI, x+directionx+directionx,y+directiony+directiony, i);
			blue(sI, x+1,y, i);
			blue(sI, x+1,y+1, i);
			blue(sI, x,y+1, i);
			blue(sI, x-1,y+1, i);
			blue(sI, x-1,y, i);
			blue(sI, x-1,y-1, i);
			blue(sI, x,y-1, i);
			blue(sI, x+1,y-1, i);
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
