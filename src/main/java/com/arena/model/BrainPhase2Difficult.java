package com.arena.model;

import java.util.Arrays;
import java.util.Random;

public class BrainPhase2Difficult {

	private double[] weights_neuron1 = new double[6];
	private double[] weights_neuron2 = new double[6];
	private double[] weights_neuron3 = new double[6];

	private double[] weights_neuron4 = new double[3];
	private double[] weights_neuron5 = new double[3];
	private double[] weights_neuron6 = new double[3];
	private double[] weights_neuron7 = new double[3];
	private double[] weights_neuron8 = new double[3];
	private double[] weights_neuron9 = new double[3];
	private double[] weights_neuron10 = new double[3];
	
	private double[] weights_neuron11 = new double[7];
	private double[] weights_neuron12 = new double[7];
	private double[] weights_neuron13 = new double[7];
	private double[] weights_neuron14 = new double[7];
	private double[] weights_neuron15 = new double[7];
	
	

	public void initialise() {

		Random rand = new Random();

		weights_neuron1[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron1[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
	
		weights_neuron2[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron2[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
	
		weights_neuron3[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron3[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
	
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

		weights_neuron9[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron9[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron9[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);

		weights_neuron10[0] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron10[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron10[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron11[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron12[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron13[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron14[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron15[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
	
		

	}


	public void mutate() {
		Random rand = new Random();

		weights_neuron1[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron1[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

		weights_neuron2[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron2[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

		weights_neuron3[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

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

		weights_neuron9[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron9[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron9[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

		weights_neuron10[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron10[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron10[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron11[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron12[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron13[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron14[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron15[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);


	}

	public static BrainPhase2Difficult procreate1(BrainPhase2Difficult brain1, BrainPhase2Difficult brain2) {
		BrainPhase2Difficult result = new BrainPhase2Difficult();
		result.initialise();
		
		result.weights_neuron1[0] = brain1.weights_neuron1[0];
		result.weights_neuron1[1] = brain2.weights_neuron1[1];
		result.weights_neuron1[2] = brain1.weights_neuron1[2];
		result.weights_neuron1[3] = brain2.weights_neuron1[3];
		result.weights_neuron1[4] = brain1.weights_neuron1[4];
		result.weights_neuron1[5] = brain2.weights_neuron1[5];
	
		result.weights_neuron2[0] = brain1.weights_neuron2[0];
		result.weights_neuron2[1] = brain2.weights_neuron2[1];
		result.weights_neuron2[2] = brain1.weights_neuron2[2];
		result.weights_neuron2[3] = brain2.weights_neuron2[3];
		result.weights_neuron2[4] = brain1.weights_neuron2[4];
		result.weights_neuron2[5] = brain2.weights_neuron2[5];
	
		result.weights_neuron3[0] = brain1.weights_neuron3[0];
		result.weights_neuron3[1] = brain2.weights_neuron3[1];
		result.weights_neuron3[2] = brain1.weights_neuron3[2];
		result.weights_neuron3[3] = brain2.weights_neuron3[3];
		result.weights_neuron3[4] = brain1.weights_neuron3[4];
		result.weights_neuron2[5] = brain2.weights_neuron2[5];
	
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

		result.weights_neuron9[0] = brain2.weights_neuron9[0];
		result.weights_neuron9[1] = brain1.weights_neuron9[1];
		result.weights_neuron9[2] = brain2.weights_neuron9[2];

		result.weights_neuron10[0] = brain1.weights_neuron10[0];
		result.weights_neuron10[1] = brain2.weights_neuron10[1];
		result.weights_neuron10[2] = brain1.weights_neuron10[2];

		result.weights_neuron11[0] = brain2.weights_neuron11[0];
		result.weights_neuron11[1] = brain1.weights_neuron11[1];
		result.weights_neuron11[2] = brain2.weights_neuron11[2];
		result.weights_neuron11[3] = brain1.weights_neuron11[3];
		result.weights_neuron11[4] = brain2.weights_neuron11[4];
		result.weights_neuron11[5] = brain1.weights_neuron11[5];
		result.weights_neuron11[6] = brain2.weights_neuron11[6];
		
		
		result.weights_neuron12[0] = brain1.weights_neuron12[0];
		result.weights_neuron12[1] = brain2.weights_neuron12[1];
		result.weights_neuron12[2] = brain1.weights_neuron12[2];
		result.weights_neuron12[3] = brain2.weights_neuron12[3];
		result.weights_neuron12[4] = brain1.weights_neuron12[4];
		result.weights_neuron12[5] = brain2.weights_neuron12[5];
		result.weights_neuron12[6] = brain1.weights_neuron12[6];
		
		
		result.weights_neuron13[0] = brain2.weights_neuron13[0];
		result.weights_neuron13[1] = brain1.weights_neuron13[1];
		result.weights_neuron13[2] = brain2.weights_neuron13[2];
		result.weights_neuron13[3] = brain1.weights_neuron13[3];
		result.weights_neuron13[4] = brain2.weights_neuron13[4];
		result.weights_neuron13[5] = brain1.weights_neuron13[5];
		result.weights_neuron13[6] = brain2.weights_neuron13[6];
		
		result.weights_neuron14[0] = brain1.weights_neuron14[0];
		result.weights_neuron14[1] = brain2.weights_neuron14[1];
		result.weights_neuron14[2] = brain1.weights_neuron14[2];
		result.weights_neuron14[3] = brain2.weights_neuron14[3];
		result.weights_neuron14[4] = brain1.weights_neuron14[4];
		result.weights_neuron14[5] = brain2.weights_neuron14[5];
		result.weights_neuron14[6] = brain1.weights_neuron14[6];
		
		result.weights_neuron15[0] = brain2.weights_neuron15[0];
		result.weights_neuron15[1] = brain1.weights_neuron15[1];
		result.weights_neuron15[2] = brain2.weights_neuron15[2];
		result.weights_neuron15[3] = brain1.weights_neuron15[3];
		result.weights_neuron15[4] = brain2.weights_neuron15[4];
		result.weights_neuron15[5] = brain1.weights_neuron15[5];
		result.weights_neuron15[6] = brain2.weights_neuron15[6];
		
		return result;
	}

	
	public static BrainPhase2Difficult procreate2(BrainPhase2Difficult brain1, BrainPhase2Difficult brain2) {
		BrainPhase2Difficult result = new BrainPhase2Difficult();
		
		result.weights_neuron1[0] = brain2.weights_neuron1[0];
		result.weights_neuron1[1] = brain1.weights_neuron1[1];
		result.weights_neuron1[2] = brain2.weights_neuron1[2];
		result.weights_neuron1[3] = brain1.weights_neuron1[3];
		result.weights_neuron1[4] = brain2.weights_neuron1[4];
		result.weights_neuron1[5] = brain1.weights_neuron1[5];		
	
		result.weights_neuron2[0] = brain2.weights_neuron2[0];
		result.weights_neuron2[1] = brain1.weights_neuron2[1];
		result.weights_neuron2[2] = brain2.weights_neuron2[2];
		result.weights_neuron2[3] = brain1.weights_neuron2[3];
		result.weights_neuron2[4] = brain2.weights_neuron2[4];
		result.weights_neuron2[5] = brain1.weights_neuron2[5];
	
		result.weights_neuron3[0] = brain2.weights_neuron3[0];
		result.weights_neuron3[1] = brain1.weights_neuron3[1];
		result.weights_neuron3[2] = brain2.weights_neuron3[2];
		result.weights_neuron3[3] = brain1.weights_neuron3[3];
		result.weights_neuron3[4] = brain2.weights_neuron3[4];
		result.weights_neuron3[5] = brain1.weights_neuron3[5];
	
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

		result.weights_neuron9[0] = brain1.weights_neuron9[0];
		result.weights_neuron9[1] = brain2.weights_neuron9[1];
		result.weights_neuron9[2] = brain1.weights_neuron9[2];

		result.weights_neuron10[0] = brain2.weights_neuron10[0];
		result.weights_neuron10[1] = brain1.weights_neuron10[1];
		result.weights_neuron10[2] = brain2.weights_neuron10[2];
		
		
		result.weights_neuron11[0] = brain1.weights_neuron11[0];
		result.weights_neuron11[1] = brain2.weights_neuron11[1];
		result.weights_neuron11[2] = brain1.weights_neuron11[2];
		result.weights_neuron11[3] = brain2.weights_neuron11[3];
		result.weights_neuron11[4] = brain1.weights_neuron11[4];
		result.weights_neuron11[5] = brain2.weights_neuron11[5];
		result.weights_neuron11[6] = brain1.weights_neuron11[6];
		
		
		result.weights_neuron12[0] = brain2.weights_neuron12[0];
		result.weights_neuron12[1] = brain1.weights_neuron12[1];
		result.weights_neuron12[2] = brain2.weights_neuron12[2];
		result.weights_neuron12[3] = brain1.weights_neuron12[3];
		result.weights_neuron12[4] = brain2.weights_neuron12[4];
		result.weights_neuron12[5] = brain1.weights_neuron12[5];
		result.weights_neuron12[6] = brain2.weights_neuron12[6];
		
		
		result.weights_neuron13[0] = brain1.weights_neuron13[0];
		result.weights_neuron13[1] = brain2.weights_neuron13[1];
		result.weights_neuron13[2] = brain1.weights_neuron13[2];
		result.weights_neuron13[3] = brain2.weights_neuron13[3];
		result.weights_neuron13[4] = brain1.weights_neuron13[4];
		result.weights_neuron13[5] = brain2.weights_neuron13[5];
		result.weights_neuron13[6] = brain1.weights_neuron13[6];
		
		result.weights_neuron14[0] = brain2.weights_neuron14[0];
		result.weights_neuron14[1] = brain1.weights_neuron14[1];
		result.weights_neuron14[2] = brain2.weights_neuron14[2];
		result.weights_neuron14[3] = brain1.weights_neuron14[3];
		result.weights_neuron14[4] = brain2.weights_neuron14[4];
		result.weights_neuron14[5] = brain1.weights_neuron14[5];
		result.weights_neuron14[6] = brain2.weights_neuron14[6];
		
		result.weights_neuron15[0] = brain1.weights_neuron15[0];
		result.weights_neuron15[1] = brain2.weights_neuron15[1];
		result.weights_neuron15[2] = brain1.weights_neuron15[2];
		result.weights_neuron15[3] = brain2.weights_neuron15[3];
		result.weights_neuron15[4] = brain1.weights_neuron15[4];
		result.weights_neuron15[5] = brain2.weights_neuron15[5];
		result.weights_neuron15[6] = brain1.weights_neuron15[6];
		
		
		return result;
	}
	
	public static BrainPhase2Difficult procreate3(BrainPhase2Difficult brain1, BrainPhase2Difficult brain2) {
		BrainPhase2Difficult result = new BrainPhase2Difficult();
		
		result.weights_neuron1[0] = brain1.weights_neuron1[0];
		result.weights_neuron1[1] = brain1.weights_neuron1[1];
		result.weights_neuron1[2] = brain1.weights_neuron1[2];
		result.weights_neuron1[3] = brain1.weights_neuron1[3];
		result.weights_neuron1[4] = brain1.weights_neuron1[4];
		result.weights_neuron1[5] = brain1.weights_neuron1[5];

		result.weights_neuron2[0] = brain2.weights_neuron2[0];
		result.weights_neuron2[1] = brain2.weights_neuron2[1];
		result.weights_neuron2[2] = brain2.weights_neuron2[2];
		result.weights_neuron2[3] = brain2.weights_neuron2[3];
		result.weights_neuron2[4] = brain2.weights_neuron2[4];
		result.weights_neuron2[5] = brain2.weights_neuron2[5];

		result.weights_neuron3[0] = brain1.weights_neuron3[0];
		result.weights_neuron3[1] = brain1.weights_neuron3[1];
		result.weights_neuron3[2] = brain1.weights_neuron3[2];
		result.weights_neuron3[3] = brain1.weights_neuron3[3];
		result.weights_neuron3[4] = brain1.weights_neuron3[4];
		result.weights_neuron3[5] = brain1.weights_neuron3[5];

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

		result.weights_neuron9[0] = brain1.weights_neuron9[0];
		result.weights_neuron9[1] = brain1.weights_neuron9[1];
		result.weights_neuron9[2] = brain1.weights_neuron9[2];

		result.weights_neuron10[0] = brain2.weights_neuron10[0];
		result.weights_neuron10[1] = brain2.weights_neuron10[1];
		result.weights_neuron10[2] = brain2.weights_neuron10[2];
		

		result.weights_neuron11[0] = brain1.weights_neuron11[0];
		result.weights_neuron11[1] = brain1.weights_neuron11[1];
		result.weights_neuron11[2] = brain1.weights_neuron11[2];
		result.weights_neuron11[3] = brain1.weights_neuron11[3];
		result.weights_neuron11[4] = brain1.weights_neuron11[4];
		result.weights_neuron11[5] = brain1.weights_neuron11[5];
		result.weights_neuron11[6] = brain1.weights_neuron11[6];
		
		
		result.weights_neuron12[0] = brain2.weights_neuron12[0];
		result.weights_neuron12[1] = brain2.weights_neuron12[1];
		result.weights_neuron12[2] = brain2.weights_neuron12[2];
		result.weights_neuron12[3] = brain2.weights_neuron12[3];
		result.weights_neuron12[4] = brain2.weights_neuron12[4];
		result.weights_neuron12[5] = brain2.weights_neuron12[5];
		result.weights_neuron12[6] = brain2.weights_neuron12[6];
		
		
		result.weights_neuron13[0] = brain1.weights_neuron13[0];
		result.weights_neuron13[1] = brain1.weights_neuron13[1];
		result.weights_neuron13[2] = brain1.weights_neuron13[2];
		result.weights_neuron13[3] = brain1.weights_neuron13[3];
		result.weights_neuron13[4] = brain1.weights_neuron13[4];
		result.weights_neuron13[5] = brain1.weights_neuron13[5];
		result.weights_neuron13[6] = brain1.weights_neuron13[6];
		
		result.weights_neuron14[0] = brain2.weights_neuron14[0];
		result.weights_neuron14[1] = brain2.weights_neuron14[1];
		result.weights_neuron14[2] = brain2.weights_neuron14[2];
		result.weights_neuron14[3] = brain2.weights_neuron14[3];
		result.weights_neuron14[4] = brain2.weights_neuron14[4];
		result.weights_neuron14[5] = brain2.weights_neuron14[5];
		result.weights_neuron14[6] = brain2.weights_neuron14[6];
		
		result.weights_neuron15[0] = brain1.weights_neuron15[0];
		result.weights_neuron15[1] = brain1.weights_neuron15[1];
		result.weights_neuron15[2] = brain1.weights_neuron15[2];
		result.weights_neuron15[3] = brain1.weights_neuron15[3];
		result.weights_neuron15[4] = brain1.weights_neuron15[4];
		result.weights_neuron15[5] = brain1.weights_neuron15[5];
		result.weights_neuron15[6] = brain1.weights_neuron15[6];
	

		return result;
	}
	public static BrainPhase2Difficult procreate4(BrainPhase2Difficult brain1, BrainPhase2Difficult brain2) {
		BrainPhase2Difficult result = new BrainPhase2Difficult();
		
		result.weights_neuron1[0] = brain2.weights_neuron1[0];
		result.weights_neuron1[1] = brain2.weights_neuron1[1];
		result.weights_neuron1[2] = brain2.weights_neuron1[2];
		result.weights_neuron1[3] = brain2.weights_neuron1[3];
		result.weights_neuron1[4] = brain2.weights_neuron1[4];
		result.weights_neuron1[5] = brain2.weights_neuron1[5];
	
		result.weights_neuron2[0] = brain1.weights_neuron2[0];
		result.weights_neuron2[1] = brain1.weights_neuron2[1];
		result.weights_neuron2[2] = brain1.weights_neuron2[2];
		result.weights_neuron2[3] = brain1.weights_neuron2[3];
		result.weights_neuron2[4] = brain1.weights_neuron2[4];
		result.weights_neuron2[5] = brain1.weights_neuron2[5];
	
		result.weights_neuron3[0] = brain2.weights_neuron3[0];
		result.weights_neuron3[1] = brain2.weights_neuron3[1];
		result.weights_neuron3[2] = brain2.weights_neuron3[2];
		result.weights_neuron3[3] = brain2.weights_neuron3[3];
		result.weights_neuron3[4] = brain2.weights_neuron3[4];
		result.weights_neuron3[5] = brain2.weights_neuron3[5];
	
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

		result.weights_neuron9[0] = brain2.weights_neuron9[0];
		result.weights_neuron9[1] = brain2.weights_neuron9[1];
		result.weights_neuron9[2] = brain2.weights_neuron9[2];

		result.weights_neuron10[0] = brain1.weights_neuron10[0];
		result.weights_neuron10[1] = brain1.weights_neuron10[1];
		result.weights_neuron10[2] = brain1.weights_neuron10[2];

		
		result.weights_neuron11[0] = brain2.weights_neuron11[0];
		result.weights_neuron11[1] = brain2.weights_neuron11[1];
		result.weights_neuron11[2] = brain2.weights_neuron11[2];
		result.weights_neuron11[3] = brain2.weights_neuron11[3];
		result.weights_neuron11[4] = brain2.weights_neuron11[4];
		result.weights_neuron11[5] = brain2.weights_neuron11[5];
		result.weights_neuron11[6] = brain2.weights_neuron11[6];
		
		
		result.weights_neuron12[0] = brain1.weights_neuron12[0];
		result.weights_neuron12[1] = brain1.weights_neuron12[1];
		result.weights_neuron12[2] = brain1.weights_neuron12[2];
		result.weights_neuron12[3] = brain1.weights_neuron12[3];
		result.weights_neuron12[4] = brain1.weights_neuron12[4];
		result.weights_neuron12[5] = brain1.weights_neuron12[5];
		result.weights_neuron12[6] = brain1.weights_neuron12[6];
		
		
		result.weights_neuron13[0] = brain2.weights_neuron13[0];
		result.weights_neuron13[1] = brain2.weights_neuron13[1];
		result.weights_neuron13[2] = brain2.weights_neuron13[2];
		result.weights_neuron13[3] = brain2.weights_neuron13[3];
		result.weights_neuron13[4] = brain2.weights_neuron13[4];
		result.weights_neuron13[5] = brain2.weights_neuron13[5];
		result.weights_neuron13[6] = brain2.weights_neuron13[6];
		
		result.weights_neuron14[0] = brain1.weights_neuron14[0];
		result.weights_neuron14[1] = brain1.weights_neuron14[1];
		result.weights_neuron14[2] = brain1.weights_neuron14[2];
		result.weights_neuron14[3] = brain1.weights_neuron14[3];
		result.weights_neuron14[4] = brain1.weights_neuron14[4];
		result.weights_neuron14[5] = brain1.weights_neuron14[5];
		result.weights_neuron14[6] = brain1.weights_neuron14[6];
		
		result.weights_neuron15[0] = brain2.weights_neuron15[0];
		result.weights_neuron15[1] = brain2.weights_neuron15[1];
		result.weights_neuron15[2] = brain2.weights_neuron15[2];
		result.weights_neuron15[3] = brain2.weights_neuron15[3];
		result.weights_neuron15[4] = brain2.weights_neuron15[4];
		result.weights_neuron15[5] = brain2.weights_neuron15[5];
		result.weights_neuron15[6] = brain2.weights_neuron15[6];
		
		return result;
	}
	
	public static BrainPhase2Difficult procreate5(BrainPhase2Difficult brain1, BrainPhase2Difficult brain2) {
		BrainPhase2Difficult result = new BrainPhase2Difficult();
		//result.initialise();
		
		result.weights_neuron1[0] = brain2.weights_neuron1[0];
		result.weights_neuron1[1] = brain2.weights_neuron1[1];
		result.weights_neuron1[2] = brain2.weights_neuron1[2];
		result.weights_neuron1[3] = brain2.weights_neuron1[3];
		result.weights_neuron1[4] = brain2.weights_neuron1[4];
		result.weights_neuron1[5] = brain2.weights_neuron1[5];
	
		result.weights_neuron2[0] = brain1.weights_neuron2[0];
		result.weights_neuron2[1] = brain1.weights_neuron2[1];
		result.weights_neuron2[2] = brain1.weights_neuron2[2];
		result.weights_neuron2[3] = brain1.weights_neuron2[3];
		result.weights_neuron2[4] = brain1.weights_neuron2[4];
		result.weights_neuron2[5] = brain1.weights_neuron2[5];
	
		result.weights_neuron3[0] = brain2.weights_neuron3[0];
		result.weights_neuron3[1] = brain2.weights_neuron3[1];
		result.weights_neuron3[2] = brain2.weights_neuron3[2];
		result.weights_neuron3[3] = brain2.weights_neuron3[3];
		result.weights_neuron3[4] = brain2.weights_neuron3[4];
		result.weights_neuron3[5] = brain2.weights_neuron3[5];
	
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

		result.weights_neuron9[0] = brain2.weights_neuron9[0];
		result.weights_neuron9[1] = brain2.weights_neuron9[1];
		result.weights_neuron9[2] = brain2.weights_neuron9[2];

		result.weights_neuron10[0] = brain1.weights_neuron10[0];
		result.weights_neuron10[1] = brain1.weights_neuron10[1];
		result.weights_neuron10[2] = brain1.weights_neuron10[2];

		
		result.weights_neuron11[0] = brain2.weights_neuron15[0];
		result.weights_neuron11[1] = brain2.weights_neuron15[1];
		result.weights_neuron11[2] = brain2.weights_neuron15[2];
		result.weights_neuron11[3] = brain2.weights_neuron15[3];
		result.weights_neuron11[4] = brain2.weights_neuron15[4];
		result.weights_neuron11[5] = brain2.weights_neuron15[5];
		result.weights_neuron11[6] = brain2.weights_neuron15[6];
		
		
		result.weights_neuron12[0] = brain1.weights_neuron13[0];
		result.weights_neuron12[1] = brain1.weights_neuron13[1];
		result.weights_neuron12[2] = brain1.weights_neuron13[2];
		result.weights_neuron12[3] = brain1.weights_neuron13[3];
		result.weights_neuron12[4] = brain1.weights_neuron13[4];
		result.weights_neuron12[5] = brain1.weights_neuron13[5];
		result.weights_neuron12[6] = brain1.weights_neuron13[6];
		
		
		result.weights_neuron13[0] = brain2.weights_neuron14[0];
		result.weights_neuron13[1] = brain2.weights_neuron14[1];
		result.weights_neuron13[2] = brain2.weights_neuron14[2];
		result.weights_neuron13[3] = brain2.weights_neuron14[3];
		result.weights_neuron13[4] = brain2.weights_neuron14[4];
		result.weights_neuron13[5] = brain2.weights_neuron14[5];
		result.weights_neuron13[6] = brain2.weights_neuron14[6];
		
		result.weights_neuron14[0] = brain1.weights_neuron11[0];
		result.weights_neuron14[1] = brain1.weights_neuron11[1];
		result.weights_neuron14[2] = brain1.weights_neuron11[2];
		result.weights_neuron14[3] = brain1.weights_neuron11[3];
		result.weights_neuron14[4] = brain1.weights_neuron11[4];
		result.weights_neuron14[5] = brain1.weights_neuron11[5];
		result.weights_neuron14[6] = brain1.weights_neuron11[6];
		
		result.weights_neuron15[0] = brain2.weights_neuron12[0];
		result.weights_neuron15[1] = brain2.weights_neuron12[1];
		result.weights_neuron15[2] = brain2.weights_neuron12[2];
		result.weights_neuron15[3] = brain2.weights_neuron12[3];
		result.weights_neuron15[4] = brain2.weights_neuron12[4];
		result.weights_neuron15[5] = brain2.weights_neuron12[5];
		result.weights_neuron15[6] = brain2.weights_neuron12[6];
		
	
		return result;
	}
	
	public Action process(Bot bot, Beast beast) {

		// calculate output
		double botX = ((double) bot.getLocation().getX()) / Arena.MAX_X;
		
		double botY = ((double) bot.getLocation().getY()) / Arena.MAX_Y;
		
		double beastX = ((double) beast.getLocation().getX()) / Arena.MAX_X;
		double beastY = ((double) beast.getLocation().getY()) / Arena.MAX_Y;

		double facingBot = ((double) bot.getFacing().getDirection().ordinal()) / 8.0;
		
		
		double activation_neuron1 = weights_neuron1[0] * botX + weights_neuron1[1] * botY + weights_neuron1[2] * beastX + weights_neuron1[3] * beastY + weights_neuron1[4] * facingBot + weights_neuron1[5];
		double activation_neuron2 = weights_neuron2[0] * botX + weights_neuron2[1] * botY + weights_neuron2[2] * beastX + weights_neuron2[3] * beastY + weights_neuron2[4] * facingBot + weights_neuron2[5];
		double activation_neuron3 = weights_neuron3[0] * botX + weights_neuron3[1] * botY + weights_neuron3[2] * beastX + weights_neuron3[3] * beastY + weights_neuron3[4] * facingBot + weights_neuron3[5];
		
		activation_neuron1 = activate(activation_neuron1);
		activation_neuron2 = activate(activation_neuron2);		
		activation_neuron3 = activate(activation_neuron3);

		double activation_neuron4 = activation_neuron1 * weights_neuron4[0] + activation_neuron2 * weights_neuron4[1] + activation_neuron3 * weights_neuron4[2];
		double activation_neuron5 = activation_neuron1 * weights_neuron5[0] + activation_neuron2 * weights_neuron5[1] + activation_neuron3 * weights_neuron5[2];
		double activation_neuron6 = activation_neuron1 * weights_neuron6[0] + activation_neuron2 * weights_neuron6[1] + activation_neuron3 * weights_neuron6[2];
		double activation_neuron7 = activation_neuron1 * weights_neuron7[0] + activation_neuron2 * weights_neuron7[1] + activation_neuron3 * weights_neuron7[2];
		double activation_neuron8 = activation_neuron1 * weights_neuron8[0] + activation_neuron2 * weights_neuron8[1] + activation_neuron3 * weights_neuron8[2];
		double activation_neuron9 = activation_neuron1 * weights_neuron9[0] + activation_neuron2 * weights_neuron9[1] + activation_neuron3 * weights_neuron9[2];
		double activation_neuron10 = activation_neuron1 * weights_neuron10[0] + activation_neuron2 * weights_neuron10[1] + activation_neuron3 * weights_neuron10[2];

		activation_neuron4 = activate(activation_neuron4);
		activation_neuron5 = activate(activation_neuron5);
		activation_neuron6 = activate(activation_neuron6);
		activation_neuron7 = activate(activation_neuron7);
		activation_neuron8 = activate(activation_neuron8);
		activation_neuron9 = activate(activation_neuron9);
		activation_neuron10 = activate(activation_neuron10);

		
		double activation_neuron11 = activation_neuron4* weights_neuron11[0] +  activation_neuron5* weights_neuron11[1] + activation_neuron6* weights_neuron11[2] + activation_neuron7* weights_neuron11[3] + activation_neuron8* weights_neuron11[4] + activation_neuron9* weights_neuron11[5] + activation_neuron10* weights_neuron11[6] ;		
		double activation_neuron12 = activation_neuron4* weights_neuron12[0] +  activation_neuron5* weights_neuron12[1] + activation_neuron6* weights_neuron12[2] + activation_neuron7* weights_neuron12[3] + activation_neuron8* weights_neuron12[4] + activation_neuron9* weights_neuron12[5] + activation_neuron10* weights_neuron12[6] ;
		double activation_neuron13 = activation_neuron4* weights_neuron13[0] +  activation_neuron5* weights_neuron13[1] + activation_neuron6* weights_neuron13[2] + activation_neuron7* weights_neuron13[3] + activation_neuron8* weights_neuron13[4] + activation_neuron9* weights_neuron13[5] + activation_neuron10* weights_neuron13[6] ;		
		double activation_neuron14 = activation_neuron4* weights_neuron14[0] +  activation_neuron5* weights_neuron14[1] + activation_neuron6* weights_neuron14[2] + activation_neuron7* weights_neuron14[3] + activation_neuron8* weights_neuron14[4] + activation_neuron9* weights_neuron14[5] + activation_neuron10* weights_neuron14[6] ;
		double activation_neuron15 = activation_neuron4* weights_neuron15[0] +  activation_neuron5* weights_neuron15[1] + activation_neuron6* weights_neuron15[2] + activation_neuron7* weights_neuron15[3] + activation_neuron8* weights_neuron15[4] + activation_neuron9* weights_neuron15[5] + activation_neuron10* weights_neuron15[6] ;
		
		activation_neuron11 = activate(activation_neuron11);
		activation_neuron12 = activate(activation_neuron12);
		activation_neuron13 = activate(activation_neuron13);
		activation_neuron14 = activate(activation_neuron14);
		activation_neuron15 = activate(activation_neuron15);
		

		if (activation_neuron11 > activation_neuron12 && activation_neuron11 > activation_neuron13
				&& activation_neuron11 > activation_neuron14 && activation_neuron11 > activation_neuron15) {

			return Action.TURN_LEFT;
		}

		if (activation_neuron12 > activation_neuron11 && activation_neuron12 > activation_neuron13
				&& activation_neuron12 > activation_neuron14 && activation_neuron12 > activation_neuron15) {
			return Action.TURN_RIGHT;
		}

		if (activation_neuron13 > activation_neuron11 && activation_neuron13 > activation_neuron12
				&& activation_neuron13 > activation_neuron14 && activation_neuron13 > activation_neuron15) {
			return Action.SHOOT;
		}

		if (activation_neuron14 > activation_neuron11 && activation_neuron14 > activation_neuron12
				&& activation_neuron14 > activation_neuron13 && activation_neuron14 > activation_neuron15) {
			return Action.MOVE;
		}
		if (activation_neuron15 > activation_neuron11 && activation_neuron15 > activation_neuron12
				&& activation_neuron15 > activation_neuron13 && activation_neuron15 > activation_neuron14) {
			return Action.DO_NOTHING;
		}
		
		return Action.DO_NOTHING;

	}

	private double activate(double input) {
		double result = 1.0 / (1.0 + Math.exp(-input));
		return result;
	}

	public Action calculateNextAction(Bot bot, Beast beast) {

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

		System.out.println("weights_neuron9 [0] = " + weights_neuron9[0] + ";");
		System.out.println("weights_neuron9 [1] = " + weights_neuron9[1] + ";");
		System.out.println("weights_neuron9 [2] = " + weights_neuron9[2] + ";");

		System.out.println("weights_neuron10 [0] = " + weights_neuron10[0] + ";");
		System.out.println("weights_neuron10 [1] = " + weights_neuron10[1] + ";");
		System.out.println("weights_neuron10 [2] = " + weights_neuron10[2] + ";");
	}

	public BrainPhase2Difficult clone() {
		BrainPhase2Difficult result = new BrainPhase2Difficult();
		result.weights_neuron1 = Arrays.copyOf(weights_neuron1, weights_neuron1.length);

		result.weights_neuron2 = Arrays.copyOf(weights_neuron2, weights_neuron2.length);
		result.weights_neuron3 = Arrays.copyOf(weights_neuron3, weights_neuron3.length);
		result.weights_neuron4 = Arrays.copyOf(weights_neuron4, weights_neuron4.length);
		result.weights_neuron5 = Arrays.copyOf(weights_neuron5, weights_neuron5.length);
		result.weights_neuron6 = Arrays.copyOf(weights_neuron6, weights_neuron6.length);
		result.weights_neuron7 = Arrays.copyOf(weights_neuron7, weights_neuron7.length);
		result.weights_neuron8 = Arrays.copyOf(weights_neuron8, weights_neuron8.length);
		result.weights_neuron9 = Arrays.copyOf(weights_neuron9, weights_neuron9.length);
		result.weights_neuron10 = Arrays.copyOf(weights_neuron10, weights_neuron10.length);
		
		result.weights_neuron11 = Arrays.copyOf(weights_neuron11, weights_neuron11.length);
		result.weights_neuron12 = Arrays.copyOf(weights_neuron12, weights_neuron12.length);
		result.weights_neuron13 = Arrays.copyOf(weights_neuron13, weights_neuron13.length);
		result.weights_neuron14 = Arrays.copyOf(weights_neuron14, weights_neuron14.length);
		result.weights_neuron15 = Arrays.copyOf(weights_neuron15, weights_neuron15.length);

		return result;
	}

}
