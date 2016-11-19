package com.arena.model;

import java.util.Arrays;
import java.util.Random;

public class BrainSimple {

	private double[] weights_neuron1 = new double[7];
	private double[] weights_neuron2 = new double[7];
	private double[] weights_neuron3 = new double[7];
	
	private double[] weights_neuron4 = new double[3];
	private double[] weights_neuron5 = new double[3];
	private double[] weights_neuron6 = new double[3];
	
	private double[] weights_neuron7 = new double[3];
	private double[] weights_neuron8 = new double[3];
//	private double[] weights_neuron9 = new double[3];
	
	


	public void initialise() {

		Random rand = new Random();

		weights_neuron1[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron2[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		

		weights_neuron3[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		

		weights_neuron4[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron4[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron4[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);

		weights_neuron5[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron5[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron5[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);

		weights_neuron6[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron6[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron6[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);

		weights_neuron7[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron7[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron7[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);

		weights_neuron8[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron8[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron8[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);

//		weights_neuron9[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
//		weights_neuron9[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
//		weights_neuron9[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);


	}


	public void mutate() {
		Random rand = new Random();

		weights_neuron1[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
	
		weights_neuron2[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
	
		weights_neuron3[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
	
		weights_neuron4[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron4[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron4[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

		weights_neuron5[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron5[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron5[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

		weights_neuron6[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron6[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron6[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

		weights_neuron7[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron7[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron7[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

		weights_neuron8[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron8[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron8[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

	
	}

	public static BrainSimple procreate1(BrainSimple brain1, BrainSimple brain2) {
		BrainSimple result = new BrainSimple();
		
		result.weights_neuron1[0] = brain1.weights_neuron1[0];
		result.weights_neuron1[1] = brain2.weights_neuron1[1];
		result.weights_neuron1[2] = brain1.weights_neuron1[2];
		result.weights_neuron1[3] = brain1.weights_neuron1[3];
		result.weights_neuron1[4] = brain1.weights_neuron1[4];
		result.weights_neuron1[5] = brain1.weights_neuron1[5];
		result.weights_neuron1[6] = brain1.weights_neuron1[6];
		
		
		result.weights_neuron2[0] = brain1.weights_neuron2[0];
		result.weights_neuron2[1] = brain2.weights_neuron2[1];
		result.weights_neuron2[2] = brain1.weights_neuron2[2];
		result.weights_neuron2[3] = brain1.weights_neuron2[3];
		result.weights_neuron2[4] = brain1.weights_neuron2[4];
		result.weights_neuron2[5] = brain1.weights_neuron2[5];
		result.weights_neuron2[6] = brain1.weights_neuron2[6];
		
		result.weights_neuron3[0] = brain1.weights_neuron3[0];
		result.weights_neuron3[1] = brain2.weights_neuron3[1];
		result.weights_neuron3[2] = brain1.weights_neuron3[2];
		result.weights_neuron3[3] = brain1.weights_neuron3[3];
		result.weights_neuron3[4] = brain1.weights_neuron3[4];
		result.weights_neuron3[5] = brain1.weights_neuron3[5];
		result.weights_neuron3[6] = brain1.weights_neuron3[6];
		
		result.weights_neuron4[0] = brain1.weights_neuron4[0];
		result.weights_neuron4[1] = brain2.weights_neuron4[1];
		result.weights_neuron4[2] = brain1.weights_neuron4[2];

		result.weights_neuron5[0] = brain2.weights_neuron5[0];
		result.weights_neuron5[1] = brain1.weights_neuron5[1];
		result.weights_neuron5[2] = brain2.weights_neuron5[2];

		result.weights_neuron6[0] = brain1.weights_neuron6[0];
		result.weights_neuron6[1] = brain2.weights_neuron6[1];
		result.weights_neuron6[2] = brain1.weights_neuron6[2];

		result.weights_neuron7[0] = brain2.weights_neuron7[0];
		result.weights_neuron7[1] = brain1.weights_neuron7[1];
		result.weights_neuron7[2] = brain2.weights_neuron7[2];

		result.weights_neuron8[0] = brain1.weights_neuron8[0];
		result.weights_neuron8[1] = brain2.weights_neuron8[1];
		result.weights_neuron8[2] = brain1.weights_neuron8[2];

		return result;
	}

	
	public static BrainSimple procreate2(BrainSimple brain1, BrainSimple brain2) {
		BrainSimple result = new BrainSimple();
		
		result.weights_neuron1[0] = brain2.weights_neuron1[0];
		result.weights_neuron1[1] = brain1.weights_neuron1[1];
		result.weights_neuron1[2] = brain2.weights_neuron1[2];
		result.weights_neuron1[3] = brain2.weights_neuron1[3];
		result.weights_neuron1[4] = brain2.weights_neuron1[4];
		result.weights_neuron1[5] = brain2.weights_neuron1[5];
		result.weights_neuron1[6] = brain2.weights_neuron1[6];
	
		result.weights_neuron2[0] = brain2.weights_neuron2[0];
		result.weights_neuron2[1] = brain1.weights_neuron2[1];
		result.weights_neuron2[2] = brain2.weights_neuron2[2];
		result.weights_neuron2[3] = brain2.weights_neuron2[3];
		result.weights_neuron2[4] = brain2.weights_neuron2[4];
		result.weights_neuron2[5] = brain2.weights_neuron2[5];
		result.weights_neuron2[6] = brain2.weights_neuron2[6];
	
		result.weights_neuron3[0] = brain2.weights_neuron3[0];
		result.weights_neuron3[1] = brain1.weights_neuron3[1];
		result.weights_neuron3[2] = brain2.weights_neuron3[2];
		result.weights_neuron3[3] = brain2.weights_neuron3[3];
		result.weights_neuron3[4] = brain2.weights_neuron3[4];
		result.weights_neuron3[5] = brain2.weights_neuron3[5];
		result.weights_neuron3[6] = brain2.weights_neuron3[6];
		
	
		result.weights_neuron4[0] = brain2.weights_neuron4[0];
		result.weights_neuron4[1] = brain1.weights_neuron4[1];
		result.weights_neuron4[2] = brain2.weights_neuron4[2];
		
		result.weights_neuron5[0] = brain1.weights_neuron5[0];
		result.weights_neuron5[1] = brain2.weights_neuron5[1];
		result.weights_neuron5[2] = brain1.weights_neuron5[2];

		result.weights_neuron6[0] = brain2.weights_neuron6[0];
		result.weights_neuron6[1] = brain1.weights_neuron6[1];
		result.weights_neuron6[2] = brain2.weights_neuron6[2];

		result.weights_neuron7[0] = brain1.weights_neuron7[0];
		result.weights_neuron7[1] = brain2.weights_neuron7[1];
		result.weights_neuron7[2] = brain1.weights_neuron7[2];

		result.weights_neuron8[0] = brain2.weights_neuron8[0];
		result.weights_neuron8[1] = brain1.weights_neuron8[1];
		result.weights_neuron8[2] = brain2.weights_neuron8[2];

		return result;
	}
	
	public static BrainSimple procreate3(BrainSimple brain1, BrainSimple brain2) {
		BrainSimple result = new BrainSimple();
		
		result.weights_neuron1[0] = brain1.weights_neuron1[0];
		result.weights_neuron1[1] = brain1.weights_neuron1[1];
		result.weights_neuron1[2] = brain1.weights_neuron1[2];
		result.weights_neuron1[3] = brain1.weights_neuron1[3];
		result.weights_neuron1[4] = brain1.weights_neuron1[4];
		result.weights_neuron1[5] = brain1.weights_neuron1[5];
		result.weights_neuron1[6] = brain1.weights_neuron1[6];
	
		result.weights_neuron2[0] = brain2.weights_neuron2[0];
		result.weights_neuron2[1] = brain2.weights_neuron2[1];
		result.weights_neuron2[2] = brain2.weights_neuron2[2];
		result.weights_neuron2[3] = brain2.weights_neuron2[3];
		result.weights_neuron2[4] = brain2.weights_neuron2[4];
		result.weights_neuron2[5] = brain2.weights_neuron2[5];
		result.weights_neuron2[6] = brain2.weights_neuron2[6];
	
		result.weights_neuron3[0] = brain1.weights_neuron3[0];
		result.weights_neuron3[1] = brain1.weights_neuron3[1];
		result.weights_neuron3[2] = brain1.weights_neuron3[2];
		result.weights_neuron3[3] = brain1.weights_neuron3[3];
		result.weights_neuron3[4] = brain1.weights_neuron3[4];
		result.weights_neuron3[5] = brain1.weights_neuron3[5];
		result.weights_neuron3[6] = brain1.weights_neuron3[6];
	
		result.weights_neuron4[0] = brain2.weights_neuron4[0];
		result.weights_neuron4[1] = brain2.weights_neuron4[1];
		result.weights_neuron4[2] = brain2.weights_neuron4[2];

		result.weights_neuron5[0] = brain1.weights_neuron5[0];
		result.weights_neuron5[1] = brain1.weights_neuron5[1];
		result.weights_neuron5[2] = brain1.weights_neuron5[2];

		result.weights_neuron6[0] = brain2.weights_neuron6[0];
		result.weights_neuron6[1] = brain2.weights_neuron6[1];
		result.weights_neuron6[2] = brain2.weights_neuron6[2];

		result.weights_neuron7[0] = brain1.weights_neuron7[0];
		result.weights_neuron7[1] = brain1.weights_neuron7[1];
		result.weights_neuron7[2] = brain1.weights_neuron7[2];

		result.weights_neuron8[0] = brain2.weights_neuron8[0];
		result.weights_neuron8[1] = brain2.weights_neuron8[1];
		result.weights_neuron8[2] = brain2.weights_neuron8[2];

		return result;
	}
	public static BrainSimple procreate4(BrainSimple brain1, BrainSimple brain2) {
		BrainSimple result = new BrainSimple();
		
		result.weights_neuron1[0] = brain2.weights_neuron1[0];
		result.weights_neuron1[1] = brain2.weights_neuron1[1];
		result.weights_neuron1[2] = brain2.weights_neuron1[2];
		result.weights_neuron1[3] = brain2.weights_neuron1[3];
		result.weights_neuron1[4] = brain2.weights_neuron1[4];
		result.weights_neuron1[5] = brain2.weights_neuron1[5];
		result.weights_neuron1[6] = brain2.weights_neuron1[6];
		
		result.weights_neuron2[0] = brain1.weights_neuron2[0];
		result.weights_neuron2[1] = brain1.weights_neuron2[1];
		result.weights_neuron2[2] = brain1.weights_neuron2[2];
		result.weights_neuron2[3] = brain1.weights_neuron2[3];
		result.weights_neuron2[4] = brain1.weights_neuron2[4];
		result.weights_neuron2[5] = brain1.weights_neuron2[5];
		result.weights_neuron2[6] = brain1.weights_neuron2[6];
		
		result.weights_neuron3[0] = brain2.weights_neuron3[0];
		result.weights_neuron3[1] = brain2.weights_neuron3[1];
		result.weights_neuron3[2] = brain2.weights_neuron3[2];
		result.weights_neuron3[3] = brain2.weights_neuron3[3];
		result.weights_neuron3[4] = brain2.weights_neuron3[4];
		result.weights_neuron3[5] = brain2.weights_neuron3[5];
		result.weights_neuron3[6] = brain2.weights_neuron3[6];
		
		result.weights_neuron4[0] = brain1.weights_neuron4[0];
		result.weights_neuron4[1] = brain1.weights_neuron4[1];
		result.weights_neuron4[2] = brain1.weights_neuron4[2];

		result.weights_neuron5[0] = brain2.weights_neuron5[0];
		result.weights_neuron5[1] = brain2.weights_neuron5[1];
		result.weights_neuron5[2] = brain2.weights_neuron5[2];

		result.weights_neuron6[0] = brain1.weights_neuron6[0];
		result.weights_neuron6[1] = brain1.weights_neuron6[1];
		result.weights_neuron6[2] = brain1.weights_neuron6[2];

		result.weights_neuron7[0] = brain2.weights_neuron7[0];
		result.weights_neuron7[1] = brain2.weights_neuron7[1];
		result.weights_neuron7[2] = brain2.weights_neuron7[2];

		result.weights_neuron8[0] = brain1.weights_neuron8[0];
		result.weights_neuron8[1] = brain1.weights_neuron8[1];
		result.weights_neuron8[2] = brain1.weights_neuron8[2];

		return result;
	}
	
	public Action process(Bot bot, Beast beast) {

		// calculate output
		
		double botX = ((double) bot.getLocation().getX()) / Arena.MAX_X;
		double botY = ((double) bot.getLocation().getY()) / Arena.MAX_Y;
	
		double beastX = ((double) beast.getLocation().getX()) / Arena.MAX_X;
		double beastY = ((double) beast.getLocation().getY()) / Arena.MAX_Y;

		double facingBot = ((double) bot.getFacing().getDirection().ordinal()) / 8.0;
		

		double activation_neuron1 = weights_neuron1[0] * botX + weights_neuron1[1] * botY + weights_neuron1[2] * beastX
				+ weights_neuron1[3] * beastY 
				+ weights_neuron1[6] * facingBot;
		activation_neuron1 = activate(activation_neuron1);

		double activation_neuron2 = weights_neuron2[0] * botX + weights_neuron2[1] * botY + weights_neuron2[2] * beastX
				+ weights_neuron2[3] * beastY
				+ weights_neuron2[6] * facingBot;
		activation_neuron2 = activate(activation_neuron2);

		double activation_neuron3 = weights_neuron3[0] * botX + weights_neuron3[1] * botY + weights_neuron3[2] * beastX
				+ weights_neuron3[3] * beastY 
				+ weights_neuron3[6] * facingBot;
		activation_neuron3 = activate(activation_neuron3);

		double activation_neuron4 = activation_neuron1 * weights_neuron4[0] + activation_neuron2 * weights_neuron4[1] + activation_neuron3 * weights_neuron4[2];
		activation_neuron4 = activate(activation_neuron4);
		double activation_neuron5 = activation_neuron1 * weights_neuron5[0] + activation_neuron2 * weights_neuron5[1] + activation_neuron3 * weights_neuron5[2];
		activation_neuron5 = activate(activation_neuron5);
		double activation_neuron6 = activation_neuron1 * weights_neuron6[0] + activation_neuron2 * weights_neuron6[1] + activation_neuron3 * weights_neuron6[2];
		activation_neuron6 = activate(activation_neuron6);
		
	
		double activation_neuron7 = activation_neuron4 * weights_neuron7[0] + activation_neuron5 * weights_neuron7[1] + activation_neuron6 * weights_neuron7[2];
		activation_neuron7 = activate(activation_neuron7);
		double activation_neuron8 = activation_neuron4 * weights_neuron8[0] + activation_neuron5 * weights_neuron8[1] + activation_neuron6 * weights_neuron8[2];
		activation_neuron8 = activate(activation_neuron8);

		if(activation_neuron7 > activation_neuron8) {
			return Action.TURN_LEFT;
		} 
		if(activation_neuron8 > activation_neuron7) {
			return Action.SHOOT;
		}
		


		return Action.DO_NOTHING;

	}

	private double activate(double input) {
		double result = 1.0 / (1.0 + Math.exp(-input));
		return result;
	}

	public Action calculateNextAction(Bot bot, Beast beast) {
		// bot.location x y
		// bot.facing 1 -> 40
		// bot.health 1.0
		// beast.health 1.0
		// beast.location x y

		// return Action.SHOOT;
		// Random rand = new Random();
		// int number = rand.nextInt(8);
		//
		//

		// if(number == 1)
		// return Action.TURN_LEFT;
		// if(number == 2)
		// return Action.TURN_RIGHT;
		// if(number == 3)
		// return Action.SHOOT;
		// if(number == 4)
		// return Action.MOVE_LEFT;
		// if(number == 5)
		// return Action.MOVE_RIGHT;
		// if(number == 6)
		// return Action.MOVE_UP;
		// if(number == 7)
		// return Action.MOVE_DOWN;
		//
		// return Action.DO_NOTHING;
		return process(bot, beast);

	}

	public void print() {
		System.out.println("NETWORK");
		System.out.println("weights_neuron1 [0] = " + weights_neuron1[0] + ";");
		System.out.println("weights_neuron1 [1] = " + weights_neuron1[1] + ";");
		System.out.println("weights_neuron1 [2] = " + weights_neuron1[2] + ";");
		System.out.println("weights_neuron1 [3] = " + weights_neuron1[3] + ";");
		System.out.println("weights_neuron1 [4] = " + weights_neuron1[4] + ";");
		System.out.println("weights_neuron1 [5] = " + weights_neuron1[5] + ";");
		System.out.println("weights_neuron1 [6] = " + weights_neuron1[6] + ";");

		System.out.println("weights_neuron2 [0] = " + weights_neuron2[0] + ";");
		System.out.println("weights_neuron2 [1] = " + weights_neuron2[1] + ";");
		System.out.println("weights_neuron2 [2] = " + weights_neuron2[2] + ";");
		System.out.println("weights_neuron2 [3] = " + weights_neuron2[3] + ";");
		System.out.println("weights_neuron2 [4] = " + weights_neuron2[4] + ";");
		System.out.println("weights_neuron2 [5] = " + weights_neuron2[5] + ";");
		System.out.println("weights_neuron2 [6] = " + weights_neuron2[6] + ";");

		System.out.println("weights_neuron3 [0] = " + weights_neuron3[0] + ";");
		System.out.println("weights_neuron3 [1] = " + weights_neuron3[1] + ";");
		System.out.println("weights_neuron3 [2] = " + weights_neuron3[2] + ";");
		System.out.println("weights_neuron3 [3] = " + weights_neuron3[3] + ";");
		System.out.println("weights_neuron3 [4] = " + weights_neuron3[4] + ";");
		System.out.println("weights_neuron3 [5] = " + weights_neuron3[5] + ";");
		System.out.println("weights_neuron3 [6] = " + weights_neuron3[6] + ";");

		System.out.println("weights_neuron4 [0] = " + weights_neuron4[0] + ";");
		System.out.println("weights_neuron4 [1] = " + weights_neuron4[1] + ";");
		System.out.println("weights_neuron4 [2] = " + weights_neuron4[2] + ";");

		System.out.println("weights_neuron5 [0] = " + weights_neuron5[0] + ";");
		System.out.println("weights_neuron5 [1] = " + weights_neuron5[1] + ";");
		System.out.println("weights_neuron5 [2] = " + weights_neuron5[2] + ";");

		System.out.println("weights_neuron6 [0] = " + weights_neuron6[0] + ";");
		System.out.println("weights_neuron6 [1] = " + weights_neuron6[1] + ";");
		System.out.println("weights_neuron6 [2] = " + weights_neuron6[2] + ";");

		System.out.println("weights_neuron7 [0] = " + weights_neuron7[0] + ";");
		System.out.println("weights_neuron7 [1] = " + weights_neuron7[1] + ";");
		System.out.println("weights_neuron7 [2] = " + weights_neuron7[2] + ";");

		System.out.println("weights_neuron8 [0] = " + weights_neuron8[0] + ";");
		System.out.println("weights_neuron8 [1] = " + weights_neuron8[1] + ";");
		System.out.println("weights_neuron8 [2] = " + weights_neuron8[2] + ";");

//		System.out.println("weights_neuron9 [0] = " + weights_neuron9[0] + ";");
//		System.out.println("weights_neuron9 [1] = " + weights_neuron9[1] + ";");
//		System.out.println("weights_neuron9 [2] = " + weights_neuron9[2] + ";");

	}

	public BrainSimple clone() {
		BrainSimple result = new BrainSimple();
		result.weights_neuron1 = Arrays.copyOf(weights_neuron1, weights_neuron1.length);

		result.weights_neuron2 = Arrays.copyOf(weights_neuron2, weights_neuron2.length);
		result.weights_neuron3 = Arrays.copyOf(weights_neuron3, weights_neuron3.length);
		result.weights_neuron4 = Arrays.copyOf(weights_neuron4, weights_neuron4.length);
		result.weights_neuron5 = Arrays.copyOf(weights_neuron5, weights_neuron5.length);
		result.weights_neuron6 = Arrays.copyOf(weights_neuron6, weights_neuron6.length);
		result.weights_neuron7 = Arrays.copyOf(weights_neuron7, weights_neuron7.length);
		result.weights_neuron8 = Arrays.copyOf(weights_neuron8, weights_neuron8.length);
//		result.weights_neuron9 = Arrays.copyOf(weights_neuron9, weights_neuron9.length);
		

		return result;
	}

}
