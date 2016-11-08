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
//	public void initialise() {
//		
//		3.816721226289706 -3.3975477890661487 5.17302143995568 3.0214469841183584 -1.5896100544337843 5.4509516827403255 0.3501365597902624
//		-5.248242545847957 2.421396540323101 -1.020136984092601 -1.1563900275546914 -5.923215117876802 -9.936357862646329 2.8316498437312836
//		-3.4582103487849136 3.269238510782226 2.947274258215401 -2.3230560185986384 -1.6870518485062027 -10.21843341280902 0.5498713833904171
//		-2.374461380159218 5.699221025681567 5.498144303308753
//		2.3907682066339464 4.402103484698201 2.9978917228484843
//		4.256111718839019 -3.8320562932981934 -3.048875004473918
//		-1.3722774304864012 3.0189002641975264 -1.794043678963826
//		-0.8128633032687715 -0.00789746768263144 -5.136957375092277
//		-4.497521311336287 -3.292133919606306 1.3148387821068488
//		-2.93457792217632 7.65004038806749 3.4394866493396643
//		
//		weights_neuron1 [0] = ;
//		weights_neuron1 [1] = ;
//		weights_neuron1 [2] = ;
//		weights_neuron1 [3] = ;
//		weights_neuron1 [4] = ;
//		weights_neuron1 [5] = ;
//		weights_neuron1 [6] = ;
//		
//		weights_neuron2 [0] = ;
//		weights_neuron2 [1] = ;
//		weights_neuron2 [2] = ;
//		weights_neuron2 [3] = ;
//		weights_neuron2 [4] = ;
//		weights_neuron2 [5] = ;
//		weights_neuron2 [6] = ;
//		
//		weights_neuron3 [0] = ;
//		weights_neuron3 [1] = ;
//		weights_neuron3 [2] = ;
//		weights_neuron3 [3] = ;
//		weights_neuron3 [4] = ;
//		weights_neuron3 [5] = ;
//		weights_neuron3 [6] = ;
//	 
//		
//		weights_neuron4 [0] = -2.935542870368534;
//		weights_neuron4 [1] =  6.424353049778225;
//		weights_neuron4 [2] = 4.7551964305532115;
//		
//		weights_neuron5 [0] = 2.5186791687482764;
//		weights_neuron5 [1] = 3.9035770324699928;
//		weights_neuron5 [2] =  2.593799478139862;
//		
//		weights_neuron6 [0] = 4.132435670224667;
//		weights_neuron6 [1] = -2.505330961185882;
//		weights_neuron6 [2] = -3.2499761054597327;
//		
//		weights_neuron7 [0] = -2.374473915175377;
//		weights_neuron7 [1] = 2.741081654935961;
//		weights_neuron7 [2] =  -2.26678757151223;
//		
//		weights_neuron8 [0] = -0.28038195962441237;
//		weights_neuron8 [1] = 0.04742259586303099;
//		weights_neuron8 [2] =  -5.296668716400466;
//		
//		weights_neuron9 [0] = -4.494591457124672 ;
//		weights_neuron9 [1] = -2.8203326550641323;
//		weights_neuron9 [2] = 2.00702598733845;
//		
//		weights_neuron10 [0] = -3.8590800018577096;
//		weights_neuron10 [1] = 8.37243583165641;
//		weights_neuron10 [2] = 3.709181315882686 ;
//		
//	}
//	
	
	public void initialise() {
		
		
		Random rand = new Random();
		weights_neuron1 [0] = 0.0;
		weights_neuron1 [1] = 0.0;
		weights_neuron1 [2] = 0.0;
		weights_neuron1 [3] = 0.0;
		weights_neuron1 [4] = 0.0;
		weights_neuron1 [5] = 0.0;
		weights_neuron1 [6] = 0.0;
		
		weights_neuron2 [0] = 0.0;
		weights_neuron2 [1] = 0.0;
		weights_neuron2 [2] = 0.0;
		weights_neuron2 [3] = 0.0;
		weights_neuron2 [4] = 0.0;
		weights_neuron2 [5] = 0.0;
		weights_neuron2 [6] = 0.0;
		
		
		
		weights_neuron3 [0] = 0.0;
		weights_neuron3 [1] = 0.0;
		weights_neuron3 [2] = 0.0;
		weights_neuron3 [3] = 0.0;
		weights_neuron3 [4] = 0.0;
		weights_neuron3 [5] = 0.0;
		weights_neuron3 [6] = 0.0;
		
		weights_neuron4 [0] = 0.0;
		weights_neuron4 [1] = 0.0;
		weights_neuron4 [2] = 0.0;
		
		weights_neuron5 [0] = 0.0;
		weights_neuron5 [1] = 0.0;
		weights_neuron5 [2] = 0.0;
		
		weights_neuron6 [0] = 0.0;
		weights_neuron6 [1] = 0.0;
		weights_neuron6 [2] = 0.0;
		
		weights_neuron7 [0] = 0.0;
		weights_neuron7 [1] = 0.0;
		weights_neuron7 [2] = 0.0;
		
		weights_neuron8 [0] = 0.0;
		weights_neuron8 [1] = 0.0;
		weights_neuron8 [2] = 0.0;
		
		weights_neuron9 [0] = 0.0;
		weights_neuron9 [1] = 0.0;
		weights_neuron9 [2] = 0.0;
		
		weights_neuron10 [0] = 0.0;
		weights_neuron10 [1] = 0.0;
		weights_neuron10 [2] = 0.0;
		
	}
//	
//	public void initialise() {
//		Random rand = new Random();
//		weights_neuron1 [0] = rand.nextDouble()*10;
//		weights_neuron1 [1] = rand.nextDouble()*(-10);
//		weights_neuron1 [2] = rand.nextDouble()*10;
//		weights_neuron1 [3] = rand.nextDouble()*10;
//		weights_neuron1 [4] = rand.nextDouble()*10;
//		weights_neuron1 [5] = rand.nextDouble()*(-10);
//		weights_neuron1 [6] = rand.nextDouble()*(-10);
//		
//		weights_neuron2 [0] = rand.nextDouble()*10;
//		weights_neuron2 [1] = rand.nextDouble();
//		weights_neuron2 [2] = rand.nextDouble()*10;
//		weights_neuron2 [3] = rand.nextDouble()*10;
//		weights_neuron2 [4] = rand.nextDouble()*(-10);
//		weights_neuron2 [5] = rand.nextDouble()*(-10);
//		weights_neuron2 [6] = rand.nextDouble()*10;
//		
//		
//		
//		weights_neuron3 [0] = rand.nextDouble()*10;
//		weights_neuron3 [1] = rand.nextDouble()*(-10);
//		weights_neuron3 [2] = rand.nextDouble()*(-10);
//		weights_neuron3 [3] = rand.nextDouble()*(-10);
//		weights_neuron3 [4] = rand.nextDouble()*(-10);
//		weights_neuron3 [5] = rand.nextDouble()*(-10);
//		weights_neuron3 [6] = rand.nextDouble()*10;
//		
//		weights_neuron4 [0] = rand.nextDouble()*(-10);
//		weights_neuron4 [1] = rand.nextDouble()*(-10);
//		weights_neuron4 [2] = rand.nextDouble()*10;
//		
//		weights_neuron5 [0] = rand.nextDouble()*10;
//		weights_neuron5 [1] = rand.nextDouble()*10;
//		weights_neuron5 [2] = rand.nextDouble()*10;
//		
//		weights_neuron6 [0] = rand.nextDouble()*(-10);
//		weights_neuron6 [1] = rand.nextDouble()*10;
//		weights_neuron6 [2] = rand.nextDouble()*(-10);
//		
//		weights_neuron7 [0] = rand.nextDouble()*(-10);
//		weights_neuron7 [1] = rand.nextDouble()*10;
//		weights_neuron7 [2] = rand.nextDouble()*10;
//		
//		weights_neuron8 [0] = rand.nextDouble()*10;
//		weights_neuron8 [1] = rand.nextDouble()*(-10);
//		weights_neuron8 [2] = rand.nextDouble()*10;
//		
//		weights_neuron9 [0] = rand.nextDouble()*(-10);
//		weights_neuron9 [1] = rand.nextDouble()*(-10);
//		weights_neuron9 [2] = rand.nextDouble()*10;
//		
//		weights_neuron10 [0] = rand.nextDouble()*(-10);
//		weights_neuron10 [1] = rand.nextDouble()*(-10);
//		weights_neuron10 [2] = rand.nextDouble()*10;
//		
//	}
	
	public void mutate() {
		Random rand = new Random();
		weights_neuron1 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron1 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron1 [2] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron1 [3]+= (rand.nextDouble() -0.5)/10.0;
		weights_neuron1 [4] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron1 [5] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron1 [6] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron2 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron2 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron2 [2] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron2 [3] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron2 [4] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron2 [5]+= (rand.nextDouble() -0.5)/10.0;
		weights_neuron2 [6] += (rand.nextDouble() -0.5)/10.0;
		
		
		
		weights_neuron3 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron3 [1]+= (rand.nextDouble() -0.5)/10.0;
		weights_neuron3 [2] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron3 [3] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron3 [4] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron3 [5] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron3 [6] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron4 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron4 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron4 [2] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron5 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron5 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron5 [2] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron6 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron6 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron6 [2] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron7 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron7 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron7 [2] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron8 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron8 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron8 [2] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron9 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron9 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron9 [2] += (rand.nextDouble() -0.5)/10.0;
		
		weights_neuron10 [0] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron10 [1] += (rand.nextDouble() -0.5)/10.0;
		weights_neuron10 [2] += (rand.nextDouble() -0.5)/10.0;
		
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
		
	
		
//		if(number == 1)
//			return Action.TURN_LEFT;
//		if(number == 2)
//			return Action.TURN_RIGHT;
//		if(number == 3)
//			return Action.SHOOT;
//		if(number == 4)
//			return Action.MOVE_LEFT;
//		if(number == 5)
//			return Action.MOVE_RIGHT;
//		if(number == 6)
//			return Action.MOVE_UP;
//		if(number == 7)
//			return Action.MOVE_DOWN;
//		
//		return Action.DO_NOTHING;
		return process(bot, beast);
		
	}
	
	
	public void print() {
		System.out.println("NETWORK");
		System.out.println("weights_neuron1 [0] = "+weights_neuron1 [0] +";");
		System.out.println("weights_neuron1 [1] = "+weights_neuron1 [1] +";");
		System.out.println("weights_neuron1 [2] = "+weights_neuron1 [2] +";");
		System.out.println("weights_neuron1 [3] = "+weights_neuron1 [3] +";");
		System.out.println("weights_neuron1 [4] = "+weights_neuron1 [4] +";");
		System.out.println("weights_neuron1 [5] = "+weights_neuron1 [5] +";");
		System.out.println("weights_neuron1 [6] = "+weights_neuron1 [6] +";");
		
		System.out.println("weights_neuron2 [0] = "+weights_neuron2 [0] +";");
		System.out.println("weights_neuron2 [1] = "+weights_neuron2 [1] +";");
		System.out.println("weights_neuron2 [2] = "+weights_neuron2 [2] +";");
		System.out.println("weights_neuron2 [3] = "+weights_neuron2 [3] +";");
		System.out.println("weights_neuron2 [4] = "+weights_neuron2 [4] +";");
		System.out.println("weights_neuron2 [5] = "+weights_neuron2 [5] +";");
		System.out.println("weights_neuron2 [6] = "+weights_neuron2 [6] +";");
		
		System.out.println("weights_neuron3 [0] = "+weights_neuron3 [0] +";");
		System.out.println("weights_neuron3 [1] = "+weights_neuron3 [1] +";");
		System.out.println("weights_neuron3 [2] = "+weights_neuron3 [2] +";");
		System.out.println("weights_neuron3 [3] = "+weights_neuron3 [3] +";");
		System.out.println("weights_neuron3 [4] = "+weights_neuron3 [4] +";");
		System.out.println("weights_neuron3 [5] = "+weights_neuron3 [5] +";");
		System.out.println("weights_neuron3 [6] = "+weights_neuron3 [6] +";");
		
		
		System.out.println("weights_neuron4 [0] = "+weights_neuron4 [0] +";");
		System.out.println("weights_neuron4 [1] = "+weights_neuron4 [1] +";");
		System.out.println("weights_neuron4 [2] = "+weights_neuron4 [2] +";");
		
		System.out.println("weights_neuron5 [0] = "+weights_neuron5 [0] +";");
		System.out.println("weights_neuron5 [1] = "+weights_neuron5 [1] +";");
		System.out.println("weights_neuron5 [2] = "+weights_neuron5 [2] +";");
		
		System.out.println("weights_neuron6 [0] = "+weights_neuron6 [0] +";");
		System.out.println("weights_neuron6 [1] = "+weights_neuron6 [1] +";");
		System.out.println("weights_neuron6 [2] = "+weights_neuron6 [2] +";");
		
		System.out.println("weights_neuron7 [0] = "+weights_neuron7 [0] +";");
		System.out.println("weights_neuron7 [1] = "+weights_neuron7 [1] +";");
		System.out.println("weights_neuron7 [2] = "+weights_neuron7 [2] +";");
		
		System.out.println("weights_neuron8 [0] = "+weights_neuron8 [0] +";");
		System.out.println("weights_neuron8 [1] = "+weights_neuron8 [1] +";");
		System.out.println("weights_neuron8 [2] = "+weights_neuron8 [2] +";");
		
		System.out.println("weights_neuron9 [0] = "+weights_neuron9 [0] +";");
		System.out.println("weights_neuron9 [1] = "+weights_neuron9 [1] +";");
		System.out.println("weights_neuron9 [2] = "+weights_neuron9 [2] +";");
		
		System.out.println("weights_neuron10 [0] = "+weights_neuron10 [0] +";");
		System.out.println("weights_neuron10 [1] = "+weights_neuron10 [1] +";");
		System.out.println("weights_neuron10 [2] = "+weights_neuron10 [2] +";");
	}

}
