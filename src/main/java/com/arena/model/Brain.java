package com.arena.model;

import java.util.Random;

public class Brain {
	
	
	private double [] weights_neuron1 = new double [7];
	private double [] weights_neuron2 = new double [7];
	private double [] weights_neuron3 = new double [7];
	
	private double [] weights_neuron4 = new double [3];
	private double [] weights_neuron5 = new double [3];
	private double [] weights_neuron6 = new double [3];
	private double [] weights_neuron7 = new double [3];
	private double [] weights_neuron8 = new double [3];
	private double [] weights_neuron9 = new double [3];
	private double [] weights_neuron10 = new double [3];
	
	
	public void initialise() {
		Random rand = new Random();
		weights_neuron1 [0] = rand.nextDouble()*10;
		weights_neuron1 [1] = rand.nextDouble()*(-10);
		weights_neuron1 [2] = rand.nextDouble()*10;
		weights_neuron1 [3] = rand.nextDouble()*10;
		weights_neuron1 [4] = rand.nextDouble()*10;
		weights_neuron1 [5] = rand.nextDouble()*(-10);
		weights_neuron1 [6] = rand.nextDouble()*(-10);
		
		weights_neuron2 [0] = rand.nextDouble()*10;
		weights_neuron2 [1] = rand.nextDouble();
		weights_neuron2 [2] = rand.nextDouble()*10;
		weights_neuron2 [3] = rand.nextDouble()*10;
		weights_neuron2 [4] = rand.nextDouble()*(-10);
		weights_neuron2 [5] = rand.nextDouble()*(-10);
		weights_neuron2 [6] = rand.nextDouble()*10;
		
		
		
		weights_neuron3 [0] = rand.nextDouble()*10;
		weights_neuron3 [1] = rand.nextDouble()*(-10);
		weights_neuron3 [2] = rand.nextDouble()*(-10);
		weights_neuron3 [3] = rand.nextDouble()*(-10);
		weights_neuron3 [4] = rand.nextDouble()*(-10);
		weights_neuron3 [5] = rand.nextDouble()*(-10);
		weights_neuron3 [6] = rand.nextDouble()*10;
		
		weights_neuron4 [0] = rand.nextDouble()*(-10);
		weights_neuron4 [1] = rand.nextDouble()*(-10);
		weights_neuron4 [2] = rand.nextDouble()*10;
		
		weights_neuron5 [0] = rand.nextDouble()*10;
		weights_neuron5 [1] = rand.nextDouble()*10;
		weights_neuron5 [2] = rand.nextDouble()*10;
		
		weights_neuron6 [0] = rand.nextDouble()*(-10);
		weights_neuron6 [1] = rand.nextDouble()*10;
		weights_neuron6 [2] = rand.nextDouble()*(-10);
		
		weights_neuron7 [0] = rand.nextDouble()*(-10);
		weights_neuron7 [1] = rand.nextDouble()*10;
		weights_neuron7 [2] = rand.nextDouble()*10;
		
		weights_neuron8 [0] = rand.nextDouble()*10;
		weights_neuron8 [1] = rand.nextDouble()*(-10);
		weights_neuron8 [2] = rand.nextDouble()*10;
		
		weights_neuron9 [0] = rand.nextDouble()*(-10);
		weights_neuron9 [1] = rand.nextDouble()*(-10);
		weights_neuron9 [2] = rand.nextDouble()*10;
		
		weights_neuron10 [0] = rand.nextDouble()*(-10);
		weights_neuron10 [1] = rand.nextDouble()*(-10);
		weights_neuron10 [2] = rand.nextDouble()*10;
		
	}

	public Action process(Bot bot, Beast beast) {
		
		//calculate output
		double botX = ((double)bot.getLocation().getX())/Arena.MAX_X;
		double botY = ((double)bot.getLocation().getY())/Arena.MAX_Y;
		
		double beastX = ((double)beast.getLocation().getX())/Arena.MAX_X;
		double beastY = ((double)beast.getLocation().getY())/Arena.MAX_Y;
		
		double botHealth = bot.getHealth();
		double beastHealth = beast.getHealth();
		double facingBot = ((double)bot.getFacing().getDirection().ordinal())/40.0;
		
		
		double activation_neuron1 = weights_neuron1[0]*botX + weights_neuron1[1]*botY + weights_neuron1[2]*beastX + weights_neuron1[3]* beastY + weights_neuron1[4]*botHealth + weights_neuron1[5]*beastHealth +  weights_neuron1[6]* facingBot;
		activation_neuron1 = activate(activation_neuron1);
	
		double activation_neuron2 = weights_neuron2[0]*botX + weights_neuron2[1]*botY + weights_neuron2[2]*beastX + weights_neuron2[3]* beastY + weights_neuron2[4]*botHealth + weights_neuron2[5]*beastHealth +  weights_neuron2[6]* facingBot;
		activation_neuron2 = activate(activation_neuron2);
	
		double activation_neuron3 = weights_neuron3[0]*botX + weights_neuron3[1]*botY + weights_neuron3[2]*beastX + weights_neuron3[3]* beastY + weights_neuron3[4]*botHealth + weights_neuron3[5]*beastHealth +  weights_neuron3[6]* facingBot;
		activation_neuron3 = activate(activation_neuron3);
	
		
		
		double activation_neuron4 = activation_neuron1 * weights_neuron4[0] + activation_neuron2 * weights_neuron4[1]+  activation_neuron3 * weights_neuron4[2] ;
		double activation_neuron5 = activation_neuron1 * weights_neuron5[0] + activation_neuron2 * weights_neuron5[1]+  activation_neuron3 * weights_neuron5[2] ;
		double activation_neuron6 = activation_neuron1 * weights_neuron6[0] + activation_neuron2 * weights_neuron6[1]+  activation_neuron3 * weights_neuron6[2] ;
		double activation_neuron7 = activation_neuron1 * weights_neuron7[0] + activation_neuron2 * weights_neuron7[1]+  activation_neuron3 * weights_neuron7[2] ;
		double activation_neuron8 = activation_neuron1 * weights_neuron8[0] + activation_neuron2 * weights_neuron8[1]+  activation_neuron3 * weights_neuron8[2] ;
		double activation_neuron9 = activation_neuron1 * weights_neuron9[0] + activation_neuron2 * weights_neuron9[1]+  activation_neuron3 * weights_neuron9[2] ;
		double activation_neuron10 = activation_neuron1 * weights_neuron10[0] + activation_neuron2 * weights_neuron10[1]+  activation_neuron3 * weights_neuron10[2] ;
	
		activation_neuron4 = activate(activation_neuron4);
		activation_neuron5 = activate(activation_neuron5);
		activation_neuron6 = activate(activation_neuron6);
		activation_neuron7 = activate(activation_neuron7);
		activation_neuron8 = activate(activation_neuron8);
		activation_neuron9 = activate(activation_neuron9);
		activation_neuron10 = activate(activation_neuron10);
		
		if(activation_neuron4 > activation_neuron5 && 
				activation_neuron4 > activation_neuron6 &&
				activation_neuron4 > activation_neuron7 &&
				activation_neuron4 > activation_neuron8 &&
				activation_neuron4 > activation_neuron9 &&
				activation_neuron4 > activation_neuron10) {
			return Action.TURN_LEFT;
		}
		
		if(activation_neuron5 > activation_neuron4 && 
				activation_neuron5 > activation_neuron6 &&
				activation_neuron5 > activation_neuron7 &&
				activation_neuron5 > activation_neuron8 &&
				activation_neuron5 > activation_neuron9 &&
				activation_neuron5 > activation_neuron10) {
			return Action.TURN_RIGHT;
		}
		
		if(activation_neuron6 > activation_neuron4 && 
				activation_neuron6 > activation_neuron5 &&
				activation_neuron6 > activation_neuron7 &&
				activation_neuron6 > activation_neuron8 &&
				activation_neuron6 > activation_neuron9 &&
				activation_neuron6 > activation_neuron10) {
			return Action.SHOOT;
		}
		
		if(activation_neuron7 > activation_neuron4 && 
				activation_neuron7 > activation_neuron6 &&
				activation_neuron7 > activation_neuron5 &&
				activation_neuron7 > activation_neuron8 &&
				activation_neuron7 > activation_neuron9 &&
				activation_neuron7 > activation_neuron10) {
			return Action.MOVE_LEFT;
		}
		
		if(activation_neuron8 > activation_neuron4 && 
				activation_neuron8 > activation_neuron6 &&
				activation_neuron8 > activation_neuron7 &&
				activation_neuron8 > activation_neuron5 &&
				activation_neuron8 > activation_neuron9 &&
				activation_neuron8 > activation_neuron10) {
			return Action.MOVE_RIGHT;
		}
		
		if(activation_neuron9 >= activation_neuron4 && 
				activation_neuron9 >= activation_neuron6 &&
				activation_neuron9 >= activation_neuron7 &&
				activation_neuron9 >= activation_neuron8 &&
				activation_neuron9 >= activation_neuron5 &&
				activation_neuron9 >= activation_neuron10) {
			return Action.MOVE_UP;
		}
		
		if(activation_neuron10 > activation_neuron4 && 
				activation_neuron10 > activation_neuron6 &&
				activation_neuron10 > activation_neuron7 &&
				activation_neuron10 > activation_neuron8 &&
				activation_neuron10 > activation_neuron9 &&
				activation_neuron10 > activation_neuron5) {
			return Action.MOVE_DOWN;
		}
		
		return Action.DO_NOTHING;
		
		
	}
	

	
	private double activate(double input) {
		double result = 1.0/(1.0+Math.exp(-input));
		return result;
	}

	public Action calculateNextAction(Bot bot, Beast beast) {
		//bot.location x y 
		//bot.facing 1 -> 40
		//bot.health 1.0
		//beast.health 1.0
		//beast.location x y
		
		//return Action.SHOOT;
		Random rand = new Random();
		int number = rand.nextInt(8);
		
	
		
		if(number == 1)
			return Action.TURN_LEFT;
		if(number == 2)
			return Action.TURN_RIGHT;
		if(number == 3)
			return Action.SHOOT;
		if(number == 4)
			return Action.MOVE_LEFT;
		if(number == 5)
			return Action.MOVE_RIGHT;
		if(number == 6)
			return Action.MOVE_UP;
		if(number == 7)
			return Action.MOVE_DOWN;
		
		return Action.DO_NOTHING;
	//	return process(bot, beast);
		
	}

}
