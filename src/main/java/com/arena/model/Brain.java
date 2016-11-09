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
		

		weights_neuron1 [0] = -0.4398354770879665;
		weights_neuron1 [1] = 0.7031462237394361;
		weights_neuron1 [2] = 0.8550627695640253;
		weights_neuron1 [3] = 0.5782404812004156;
		weights_neuron1 [4] = 1.310329688801346;
		weights_neuron1 [5] = -11.68521058115469;
		weights_neuron1 [6] = -3.2775914906725716;
		weights_neuron2 [0] = -3.2824503434185854;
		weights_neuron2 [1] = 5.195618505565062;
		weights_neuron2 [2] = 4.518142906379575;
		weights_neuron2 [3] = -5.007986489046809;
		weights_neuron2 [4] = 2.7781552636538724;
		weights_neuron2 [5] = 8.127202993384286;
		weights_neuron2 [6] = -36.663518563139014;
		weights_neuron3 [0] = -0.1716973228203986;
		weights_neuron3 [1] = 0.5978575783981261;
		weights_neuron3 [2] = -23.263649929725965;
		weights_neuron3 [3] = -0.7532638543493696;
		weights_neuron3 [4] = 8.959090875488162;
		weights_neuron3 [5] = 3.0284959789340946;
		weights_neuron3 [6] = -12.16593354445263;
		weights_neuron4 [0] = 2.5275571752902986;
		weights_neuron4 [1] = 18.14125827250929;
		weights_neuron4 [2] = 6.482887984131867;
		weights_neuron5 [0] = -4.890663267984401;
		weights_neuron5 [1] = -0.35984138043714203;
		weights_neuron5 [2] = 2.5630734707250458;
		weights_neuron6 [0] = 2.7809306602045276;
		weights_neuron6 [1] = 2.9743957580347384;
		weights_neuron6 [2] = -5.606585203558673;
		weights_neuron7 [0] = -4.873046109471385;
		weights_neuron7 [1] = -15.887967439280683;
		weights_neuron7 [2] = 12.415603824971072;
		weights_neuron8 [0] = 0.48427017612127987;
		weights_neuron8 [1] = -1.5839871415241487;
		weights_neuron8 [2] = 0.28224544614272923;
		weights_neuron9 [0] = -0.8987638323361329;
		weights_neuron9 [1] = -46.68090210551524;
		weights_neuron9 [2] = -3.181686355078933;
		weights_neuron10 [0] = 1.1564437461715045;
		weights_neuron10 [1] = -1.3848904892787912;
		weights_neuron10 [2] = 5.313291725691983;

	}
	
	
//	 public void initialise() {
//	
//	
//	 weights_neuron1 [0] = 0.0;
//	 weights_neuron1 [1] = 0.0;
//	 weights_neuron1 [2] = 0.0;
//	 weights_neuron1 [3] = 0.0;
//	 weights_neuron1 [4] = 0.0;
//	 weights_neuron1 [5] = 0.0;
//	 weights_neuron1 [6] = 0.0;
//	
//	 weights_neuron2 [0] = 0.0;
//	 weights_neuron2 [1] = 0.0;
//	 weights_neuron2 [2] = 0.0;
//	 weights_neuron2 [3] = 0.0;
//	 weights_neuron2 [4] = 0.0;
//	 weights_neuron2 [5] = 0.0;
//	 weights_neuron2 [6] = 0.0;
//	
//	
//	
//	 weights_neuron3 [0] = 0.0;
//	 weights_neuron3 [1] = 0.0;
//	 weights_neuron3 [2] = 0.0;
//	 weights_neuron3 [3] = 0.0;
//	 weights_neuron3 [4] = 0.0;
//	 weights_neuron3 [5] = 0.0;
//	 weights_neuron3 [6] = 0.0;
//	
//	 weights_neuron4 [0] = 0.0;
//	 weights_neuron4 [1] = 0.0;
//	 weights_neuron4 [2] = 0.0;
//	
//	 weights_neuron5 [0] = 0.0;
//	 weights_neuron5 [1] = 0.0;
//	 weights_neuron5 [2] = 0.0;
//	
//	 weights_neuron6 [0] = 0.0;
//	 weights_neuron6 [1] = 0.0;
//	 weights_neuron6 [2] = 0.0;
//	
//	 weights_neuron7 [0] = 0.0;
//	 weights_neuron7 [1] = 0.0;
//	 weights_neuron7 [2] = 0.0;
//	
//	 weights_neuron8 [0] = 0.0;
//	 weights_neuron8 [1] = 0.0;
//	 weights_neuron8 [2] = 0.0;
//	
//	 weights_neuron9 [0] = 0.0;
//	 weights_neuron9 [1] = 0.0;
//	 weights_neuron9 [2] = 0.0;
//	
//	 weights_neuron10 [0] = 0.0;
//	 weights_neuron10 [1] = 0.0;
//	 weights_neuron10 [2] = 0.0;
//	
//	 }
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
		System.out.println("EXAMPLE RANDOM : "+ (rand.nextDouble() -0.5)/(rand.nextDouble()*1000));
		weights_neuron1 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron1 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron1 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron1 [3]+= (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron1 [4] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron1 [5] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron1 [6] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron2 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron2 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron2 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron2 [3] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron2 [4] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron2 [5]+= (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron2 [6] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		
		
		weights_neuron3 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron3 [1]+= (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron3 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron3 [3] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron3 [4] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron3 [5] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron3 [6] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron4 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron4 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron4 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron5 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron5 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron5 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron6 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron6 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron6 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron7 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron7 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron7 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron8 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron8 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron8 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron9 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron9 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron9 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
		weights_neuron10 [0] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron10 [1] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		weights_neuron10 [2] += (rand.nextDouble() -0.5)/(rand.nextDouble()*1000);
		
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
