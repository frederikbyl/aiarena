package com.arena.model;

import java.util.Arrays;
import java.util.Random;

public class Brain {

	private double[] weights_neuron1 = new double[6];
	private double[] weights_neuron2 = new double[6];
	private double[] weights_neuron3 = new double[6];


	
	private double[] weights_neuron11 = new double[4];
	private double[] weights_neuron12 = new double[4];
	private double[] weights_neuron13 = new double[4];
	private double[] weights_neuron14 = new double[4];
	private double[] weights_neuron15 = new double[4];
	
	private double[] weights_neuron21 = new double[6];
	private double[] weights_neuron22 = new double[6];
	private double[] weights_neuron23 = new double[6];
	private double[] weights_neuron24 = new double[6];
	private double[] weights_neuron25 = new double[6];
	
	private double alpha = 0.1;
	
	

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
	
		weights_neuron11[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron11[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
			
		weights_neuron12[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron12[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
			
		weights_neuron13[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron13[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron14[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron14[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
			
		weights_neuron15[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron15[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
			
		weights_neuron21[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron21[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron21[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron21[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron21[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron21[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		
		weights_neuron22[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron22[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron22[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron22[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron22[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron22[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		
		weights_neuron23[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron23[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron23[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron23[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron23[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron23[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
	
		weights_neuron24[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron24[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron24[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron24[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron24[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron24[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron25[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron25[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron25[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron25[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron25[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron25[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		

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
	
		weights_neuron11[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron11[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
				
		weights_neuron12[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron12[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
			
		weights_neuron13[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron13[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron14[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron14[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron15[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron15[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
	
		weights_neuron21[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron21[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron21[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron21[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron21[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron21[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron22[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron22[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron22[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron22[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron22[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron22[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron23[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron23[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron23[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron23[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron23[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron23[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron24[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron24[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron24[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron24[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron24[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron24[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron25[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron25[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron25[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron25[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron25[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron25[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
	}

	public static Brain procreate1(Brain brain1, Brain brain2) {
		Brain result = new Brain();
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
	
	
		result.weights_neuron11[0] = brain2.weights_neuron11[0];
		result.weights_neuron11[1] = brain1.weights_neuron11[1];
		result.weights_neuron11[2] = brain2.weights_neuron11[2];
		result.weights_neuron11[3] = brain1.weights_neuron11[3];
		
		
		result.weights_neuron12[0] = brain1.weights_neuron12[0];
		result.weights_neuron12[1] = brain2.weights_neuron12[1];
		result.weights_neuron12[2] = brain1.weights_neuron12[2];
		result.weights_neuron12[3] = brain2.weights_neuron12[3];
		
		
		result.weights_neuron13[0] = brain2.weights_neuron13[0];
		result.weights_neuron13[1] = brain1.weights_neuron13[1];
		result.weights_neuron13[2] = brain2.weights_neuron13[2];
		result.weights_neuron13[3] = brain1.weights_neuron13[3];
		
		result.weights_neuron14[0] = brain1.weights_neuron14[0];
		result.weights_neuron14[1] = brain2.weights_neuron14[1];
		result.weights_neuron14[2] = brain1.weights_neuron14[2];
		result.weights_neuron14[3] = brain2.weights_neuron14[3];
		
		result.weights_neuron15[0] = brain2.weights_neuron15[0];
		result.weights_neuron15[1] = brain1.weights_neuron15[1];
		result.weights_neuron15[2] = brain2.weights_neuron15[2];
		result.weights_neuron15[3] = brain1.weights_neuron15[3];
			
		result.weights_neuron21[0] = brain2.weights_neuron21[0];
		result.weights_neuron21[1] = brain1.weights_neuron21[1];
		result.weights_neuron21[2] = brain2.weights_neuron21[2];
		result.weights_neuron21[3] = brain1.weights_neuron21[3];
		result.weights_neuron21[4] = brain2.weights_neuron21[4];
		result.weights_neuron21[5] = brain1.weights_neuron21[5];
		
		
		result.weights_neuron22[0] = brain2.weights_neuron22[0];
		result.weights_neuron22[1] = brain1.weights_neuron22[1];
		result.weights_neuron22[2] = brain2.weights_neuron22[2];
		result.weights_neuron22[3] = brain1.weights_neuron22[3];
		result.weights_neuron22[4] = brain2.weights_neuron22[4];
		result.weights_neuron22[5] = brain1.weights_neuron22[5];
		
		
		result.weights_neuron23[0] = brain2.weights_neuron23[0];
		result.weights_neuron23[1] = brain1.weights_neuron23[1];
		result.weights_neuron23[2] = brain2.weights_neuron23[2];
		result.weights_neuron13[3] = brain1.weights_neuron23[3];
		result.weights_neuron23[4] = brain2.weights_neuron23[4];
		result.weights_neuron23[5] = brain1.weights_neuron23[5];
		
		result.weights_neuron24[0] = brain2.weights_neuron24[0];
		result.weights_neuron24[1] = brain1.weights_neuron24[1];
		result.weights_neuron24[2] = brain2.weights_neuron24[2];
		result.weights_neuron24[3] = brain1.weights_neuron24[3];
		result.weights_neuron24[4] = brain2.weights_neuron24[4];
		result.weights_neuron24[5] = brain1.weights_neuron24[5];
		
		result.weights_neuron25[0] = brain2.weights_neuron25[0];
		result.weights_neuron25[1] = brain1.weights_neuron25[1];
		result.weights_neuron25[2] = brain2.weights_neuron25[2];
		result.weights_neuron25[3] = brain1.weights_neuron25[3];
		result.weights_neuron25[4] = brain2.weights_neuron25[4];
		result.weights_neuron25[5] = brain1.weights_neuron25[5];
		
		return result;
	}

	
	public static Brain procreate2(Brain brain1, Brain brain2) {
		Brain result = new Brain();
		
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
	
		
		result.weights_neuron11[0] = brain1.weights_neuron11[0];
		result.weights_neuron11[1] = brain2.weights_neuron11[1];
		result.weights_neuron11[2] = brain1.weights_neuron11[2];
		result.weights_neuron11[3] = brain2.weights_neuron11[3];
		
		
		result.weights_neuron12[0] = brain2.weights_neuron12[0];
		result.weights_neuron12[1] = brain1.weights_neuron12[1];
		result.weights_neuron12[2] = brain2.weights_neuron12[2];
		result.weights_neuron12[3] = brain1.weights_neuron12[3];
		
		
		result.weights_neuron13[0] = brain1.weights_neuron13[0];
		result.weights_neuron13[1] = brain2.weights_neuron13[1];
		result.weights_neuron13[2] = brain1.weights_neuron13[2];
		result.weights_neuron13[3] = brain2.weights_neuron13[3];
		
		result.weights_neuron14[0] = brain2.weights_neuron14[0];
		result.weights_neuron14[1] = brain1.weights_neuron14[1];
		result.weights_neuron14[2] = brain2.weights_neuron14[2];
		result.weights_neuron14[3] = brain1.weights_neuron14[3];
		
		result.weights_neuron15[0] = brain1.weights_neuron15[0];
		result.weights_neuron15[1] = brain2.weights_neuron15[1];
		result.weights_neuron15[2] = brain1.weights_neuron15[2];
		result.weights_neuron15[3] = brain2.weights_neuron15[3];
		

		result.weights_neuron21[0] = brain1.weights_neuron21[0];
		result.weights_neuron21[1] = brain2.weights_neuron21[1];
		result.weights_neuron21[2] = brain1.weights_neuron21[2];
		result.weights_neuron21[3] = brain2.weights_neuron21[3];
		result.weights_neuron21[4] = brain1.weights_neuron21[4];
		result.weights_neuron21[5] = brain2.weights_neuron21[5];
		
		
		result.weights_neuron22[0] = brain1.weights_neuron22[0];
		result.weights_neuron22[1] = brain2.weights_neuron22[1];
		result.weights_neuron22[2] = brain1.weights_neuron22[2];
		result.weights_neuron22[3] = brain2.weights_neuron22[3];
		result.weights_neuron22[4] = brain1.weights_neuron22[4];
		result.weights_neuron22[5] = brain2.weights_neuron22[5];
		
		
		result.weights_neuron23[0] = brain1.weights_neuron23[0];
		result.weights_neuron23[1] = brain2.weights_neuron23[1];
		result.weights_neuron23[2] = brain1.weights_neuron23[2];
		result.weights_neuron13[3] = brain2.weights_neuron23[3];
		result.weights_neuron23[4] = brain1.weights_neuron23[4];
		result.weights_neuron23[5] = brain2.weights_neuron23[5];
		
		result.weights_neuron24[0] = brain1.weights_neuron24[0];
		result.weights_neuron24[1] = brain2.weights_neuron24[1];
		result.weights_neuron24[2] = brain1.weights_neuron24[2];
		result.weights_neuron24[3] = brain2.weights_neuron24[3];
		result.weights_neuron24[4] = brain1.weights_neuron24[4];
		result.weights_neuron24[5] = brain2.weights_neuron24[5];
		
		result.weights_neuron25[0] = brain1.weights_neuron25[0];
		result.weights_neuron25[1] = brain2.weights_neuron25[1];
		result.weights_neuron25[2] = brain1.weights_neuron25[2];
		result.weights_neuron25[3] = brain2.weights_neuron25[3];
		result.weights_neuron25[4] = brain1.weights_neuron25[4];
		result.weights_neuron25[5] = brain2.weights_neuron25[5];
		
		return result;
	}
	
	public static Brain procreate3(Brain brain1, Brain brain2) {
		Brain result = new Brain();
		
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

		result.weights_neuron11[0] = brain1.weights_neuron11[0];
		result.weights_neuron11[1] = brain1.weights_neuron11[1];
		result.weights_neuron11[2] = brain1.weights_neuron11[2];
		result.weights_neuron11[3] = brain1.weights_neuron11[3];
		
		
		result.weights_neuron12[0] = brain2.weights_neuron12[0];
		result.weights_neuron12[1] = brain2.weights_neuron12[1];
		result.weights_neuron12[2] = brain2.weights_neuron12[2];
		result.weights_neuron12[3] = brain2.weights_neuron12[3];
		
		
		result.weights_neuron13[0] = brain1.weights_neuron13[0];
		result.weights_neuron13[1] = brain1.weights_neuron13[1];
		result.weights_neuron13[2] = brain1.weights_neuron13[2];
		result.weights_neuron13[3] = brain1.weights_neuron13[3];
		
		result.weights_neuron14[0] = brain2.weights_neuron14[0];
		result.weights_neuron14[1] = brain2.weights_neuron14[1];
		result.weights_neuron14[2] = brain2.weights_neuron14[2];
		result.weights_neuron14[3] = brain2.weights_neuron14[3];
		
		result.weights_neuron15[0] = brain1.weights_neuron15[0];
		result.weights_neuron15[1] = brain1.weights_neuron15[1];
		result.weights_neuron15[2] = brain1.weights_neuron15[2];
		result.weights_neuron15[3] = brain1.weights_neuron15[3];
		

		result.weights_neuron21[0] = brain1.weights_neuron21[0];
		result.weights_neuron21[1] = brain1.weights_neuron21[1];
		result.weights_neuron21[2] = brain1.weights_neuron21[2];
		result.weights_neuron21[3] = brain1.weights_neuron21[3];
		result.weights_neuron21[4] = brain1.weights_neuron21[4];
		result.weights_neuron21[5] = brain1.weights_neuron21[5];
		
		
		result.weights_neuron22[0] = brain2.weights_neuron22[0];
		result.weights_neuron22[1] = brain2.weights_neuron22[1];
		result.weights_neuron22[2] = brain2.weights_neuron22[2];
		result.weights_neuron22[3] = brain2.weights_neuron22[3];
		result.weights_neuron22[4] = brain2.weights_neuron22[4];
		result.weights_neuron22[5] = brain2.weights_neuron22[5];
		
		
		result.weights_neuron23[0] = brain1.weights_neuron23[0];
		result.weights_neuron23[1] = brain1.weights_neuron23[1];
		result.weights_neuron23[2] = brain1.weights_neuron23[2];
		result.weights_neuron23[3] = brain1.weights_neuron23[3];
		result.weights_neuron23[4] = brain1.weights_neuron23[4];
		result.weights_neuron23[5] = brain1.weights_neuron23[5];
		
		result.weights_neuron24[0] = brain2.weights_neuron24[0];
		result.weights_neuron24[1] = brain2.weights_neuron24[1];
		result.weights_neuron24[2] = brain2.weights_neuron24[2];
		result.weights_neuron24[3] = brain2.weights_neuron24[3];
		result.weights_neuron24[4] = brain2.weights_neuron24[4];
		result.weights_neuron24[5] = brain2.weights_neuron24[5];
		
		result.weights_neuron25[0] = brain1.weights_neuron25[0];
		result.weights_neuron25[1] = brain1.weights_neuron25[1];
		result.weights_neuron25[2] = brain1.weights_neuron25[2];
		result.weights_neuron25[3] = brain1.weights_neuron25[3];
		result.weights_neuron25[4] = brain1.weights_neuron25[4];
		result.weights_neuron25[5] = brain1.weights_neuron25[5];
	

		return result;
	}
	public static Brain procreate4(Brain brain1, Brain brain2) {
		Brain result = new Brain();
		
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
	
		
		result.weights_neuron11[0] = brain2.weights_neuron11[0];
		result.weights_neuron11[1] = brain2.weights_neuron11[1];
		result.weights_neuron11[2] = brain2.weights_neuron11[2];
		result.weights_neuron11[3] = brain2.weights_neuron11[3];
		
		
		result.weights_neuron12[0] = brain1.weights_neuron12[0];
		result.weights_neuron12[1] = brain1.weights_neuron12[1];
		result.weights_neuron12[2] = brain1.weights_neuron12[2];
		result.weights_neuron12[3] = brain1.weights_neuron12[3];
		
		
		result.weights_neuron13[0] = brain2.weights_neuron13[0];
		result.weights_neuron13[1] = brain2.weights_neuron13[1];
		result.weights_neuron13[2] = brain2.weights_neuron13[2];
		result.weights_neuron13[3] = brain2.weights_neuron13[3];
		
		result.weights_neuron14[0] = brain1.weights_neuron14[0];
		result.weights_neuron14[1] = brain1.weights_neuron14[1];
		result.weights_neuron14[2] = brain1.weights_neuron14[2];
		result.weights_neuron14[3] = brain1.weights_neuron14[3];
		
		result.weights_neuron15[0] = brain2.weights_neuron15[0];
		result.weights_neuron15[1] = brain2.weights_neuron15[1];
		result.weights_neuron15[2] = brain2.weights_neuron15[2];
		result.weights_neuron15[3] = brain2.weights_neuron15[3];
		
		

		result.weights_neuron21[0] = brain2.weights_neuron21[0];
		result.weights_neuron21[1] = brain2.weights_neuron21[1];
		result.weights_neuron21[2] = brain2.weights_neuron21[2];
		result.weights_neuron21[3] = brain2.weights_neuron21[3];
		result.weights_neuron21[4] = brain2.weights_neuron21[4];
		result.weights_neuron21[5] = brain2.weights_neuron21[5];
		
		
		result.weights_neuron22[0] = brain1.weights_neuron22[0];
		result.weights_neuron22[1] = brain1.weights_neuron22[1];
		result.weights_neuron22[2] = brain1.weights_neuron22[2];
		result.weights_neuron22[3] = brain1.weights_neuron22[3];
		result.weights_neuron22[4] = brain1.weights_neuron22[4];
		result.weights_neuron22[5] = brain1.weights_neuron22[5];
		
		
		result.weights_neuron23[0] = brain2.weights_neuron23[0];
		result.weights_neuron23[1] = brain2.weights_neuron23[1];
		result.weights_neuron23[2] = brain2.weights_neuron23[2];
		result.weights_neuron13[3] = brain2.weights_neuron23[3];
		result.weights_neuron23[4] = brain2.weights_neuron23[4];
		result.weights_neuron23[5] = brain2.weights_neuron23[5];
		
		result.weights_neuron24[0] = brain1.weights_neuron24[0];
		result.weights_neuron24[1] = brain1.weights_neuron24[1];
		result.weights_neuron24[2] = brain1.weights_neuron24[2];
		result.weights_neuron24[3] = brain1.weights_neuron24[3];
		result.weights_neuron24[4] = brain1.weights_neuron24[4];
		result.weights_neuron24[5] = brain1.weights_neuron24[5];
		
		result.weights_neuron25[0] = brain2.weights_neuron25[0];
		result.weights_neuron25[1] = brain2.weights_neuron25[1];
		result.weights_neuron25[2] = brain2.weights_neuron25[2];
		result.weights_neuron25[3] = brain2.weights_neuron25[3];
		result.weights_neuron25[4] = brain2.weights_neuron25[4];
		result.weights_neuron25[5] = brain2.weights_neuron25[5];
		
		return result;
	}
	
	public static Brain procreate5(Brain brain1, Brain brain2) {
		Brain result = new Brain();
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
	
		
		result.weights_neuron11[0] = brain2.weights_neuron15[0];
		result.weights_neuron11[1] = brain2.weights_neuron15[1];
		result.weights_neuron11[2] = brain2.weights_neuron15[2];
		result.weights_neuron11[3] = brain2.weights_neuron15[3];
		
		
		result.weights_neuron12[0] = brain1.weights_neuron13[0];
		result.weights_neuron12[1] = brain1.weights_neuron13[1];
		result.weights_neuron12[2] = brain1.weights_neuron13[2];
		result.weights_neuron12[3] = brain1.weights_neuron13[3];
		
		
		result.weights_neuron13[0] = brain2.weights_neuron14[0];
		result.weights_neuron13[1] = brain2.weights_neuron14[1];
		result.weights_neuron13[2] = brain2.weights_neuron14[2];
		result.weights_neuron13[3] = brain2.weights_neuron14[3];
		
		result.weights_neuron14[0] = brain1.weights_neuron11[0];
		result.weights_neuron14[1] = brain1.weights_neuron11[1];
		result.weights_neuron14[2] = brain1.weights_neuron11[2];
		result.weights_neuron14[3] = brain1.weights_neuron11[3];
		
		result.weights_neuron15[0] = brain2.weights_neuron12[0];
		result.weights_neuron15[1] = brain2.weights_neuron12[1];
		result.weights_neuron15[2] = brain2.weights_neuron12[2];
		result.weights_neuron15[3] = brain2.weights_neuron12[3];
		
		
		
		
		result.weights_neuron21[0] = brain2.weights_neuron25[0];
		result.weights_neuron21[1] = brain2.weights_neuron25[1];
		result.weights_neuron21[2] = brain2.weights_neuron25[2];
		result.weights_neuron21[3] = brain2.weights_neuron25[3];
		result.weights_neuron21[4] = brain2.weights_neuron25[4];
		result.weights_neuron21[5] = brain2.weights_neuron25[5];
		
		
		result.weights_neuron22[0] = brain1.weights_neuron23[0];
		result.weights_neuron22[1] = brain1.weights_neuron23[1];
		result.weights_neuron22[2] = brain1.weights_neuron23[2];
		result.weights_neuron22[3] = brain1.weights_neuron23[3];
		result.weights_neuron22[4] = brain1.weights_neuron23[4];
		result.weights_neuron22[5] = brain1.weights_neuron23[5];
		
		
		result.weights_neuron23[0] = brain2.weights_neuron24[0];
		result.weights_neuron23[1] = brain2.weights_neuron24[1];
		result.weights_neuron23[2] = brain2.weights_neuron24[2];
		result.weights_neuron13[3] = brain2.weights_neuron24[3];
		result.weights_neuron23[4] = brain2.weights_neuron24[4];
		result.weights_neuron23[5] = brain2.weights_neuron24[5];
		
		result.weights_neuron24[0] = brain1.weights_neuron21[0];
		result.weights_neuron24[1] = brain1.weights_neuron21[1];
		result.weights_neuron24[2] = brain1.weights_neuron21[2];
		result.weights_neuron24[3] = brain1.weights_neuron21[3];
		result.weights_neuron24[4] = brain1.weights_neuron21[4];
		result.weights_neuron24[5] = brain1.weights_neuron21[5];
		
		result.weights_neuron25[0] = brain2.weights_neuron22[0];
		result.weights_neuron25[1] = brain2.weights_neuron22[1];
		result.weights_neuron25[2] = brain2.weights_neuron22[2];
		result.weights_neuron25[3] = brain2.weights_neuron22[3];
		result.weights_neuron25[4] = brain2.weights_neuron22[4];
		result.weights_neuron25[5] = brain2.weights_neuron22[5];
		
	
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

		
		
		double activation_neuron11 = activation_neuron1* weights_neuron11[0] +  activation_neuron2* weights_neuron11[1] + activation_neuron3* weights_neuron11[2] +  weights_neuron11[3];		
		double activation_neuron12 = activation_neuron1* weights_neuron12[0] +  activation_neuron2* weights_neuron12[1] + activation_neuron3* weights_neuron12[2] +  weights_neuron12[3];
		double activation_neuron13 = activation_neuron1* weights_neuron13[0] +  activation_neuron2* weights_neuron13[1] + activation_neuron3* weights_neuron13[2] +  weights_neuron13[3];		
		double activation_neuron14 = activation_neuron1* weights_neuron14[0] +  activation_neuron2* weights_neuron14[1] + activation_neuron3* weights_neuron14[2] +  weights_neuron14[3];
		double activation_neuron15 = activation_neuron1* weights_neuron15[0] +  activation_neuron2* weights_neuron15[1] + activation_neuron3* weights_neuron15[2] +  weights_neuron15[3];
		
		activation_neuron11 = activate(activation_neuron11);
		activation_neuron12 = activate(activation_neuron12);
		activation_neuron13 = activate(activation_neuron13);
		activation_neuron14 = activate(activation_neuron14);
		activation_neuron15 = activate(activation_neuron15);
		

		double activation_neuron21 = activation_neuron11* weights_neuron21[0] +  activation_neuron12* weights_neuron21[1] + activation_neuron13* weights_neuron21[2] + activation_neuron14* weights_neuron21[3] + activation_neuron15* weights_neuron21[4] + weights_neuron21[5]  ;		
		double activation_neuron22 = activation_neuron11* weights_neuron22[0] +  activation_neuron12* weights_neuron22[1] + activation_neuron13* weights_neuron22[2] + activation_neuron14* weights_neuron22[3] + activation_neuron15* weights_neuron22[4] + weights_neuron22[5] ;
		double activation_neuron23 = activation_neuron11* weights_neuron23[0] +  activation_neuron12* weights_neuron23[1] + activation_neuron13* weights_neuron23[2] + activation_neuron14* weights_neuron23[3] + activation_neuron15* weights_neuron23[4] + weights_neuron23[5] ;		
		double activation_neuron24 = activation_neuron11* weights_neuron24[0] +  activation_neuron12* weights_neuron24[1] + activation_neuron13* weights_neuron24[2] + activation_neuron14* weights_neuron24[3] + activation_neuron15* weights_neuron24[4] + weights_neuron24[5] ;
		double activation_neuron25 = activation_neuron11* weights_neuron25[0] +  activation_neuron12* weights_neuron25[1] + activation_neuron13* weights_neuron25[2] + activation_neuron14* weights_neuron25[3] + activation_neuron15* weights_neuron25[4] + weights_neuron25[5] ;
		
		activation_neuron21 = activate(activation_neuron21);
		activation_neuron22 = activate(activation_neuron22);
		activation_neuron23 = activate(activation_neuron23);
		activation_neuron24 = activate(activation_neuron24);
		activation_neuron25 = activate(activation_neuron25);
		

		if (activation_neuron21 > activation_neuron22 && activation_neuron21 > activation_neuron23
				&& activation_neuron21 > activation_neuron24 && activation_neuron21 > activation_neuron25) {

			return Action.TURN_LEFT;
		}

		if (activation_neuron22 > activation_neuron21 && activation_neuron22 > activation_neuron23
				&& activation_neuron22 > activation_neuron24 && activation_neuron22 > activation_neuron25) {
			return Action.TURN_RIGHT;
		}

		if (activation_neuron23 > activation_neuron21 && activation_neuron23 > activation_neuron22
				&& activation_neuron23 > activation_neuron24 && activation_neuron23 > activation_neuron25) {
			return Action.SHOOT;
		}

		if (activation_neuron24 > activation_neuron21 && activation_neuron24 > activation_neuron22
				&& activation_neuron24 > activation_neuron23 && activation_neuron24 > activation_neuron25) {
			return Action.MOVE;
		}
		if (activation_neuron25 > activation_neuron21 && activation_neuron25 > activation_neuron22
				&& activation_neuron25 > activation_neuron23 && activation_neuron25 > activation_neuron24) {
			return Action.DO_NOTHING;
		}
		
		return Action.DO_NOTHING;

	}

	private double activate(double input) {
		double result = 1.0 / (1.0 + Math.exp(-input));
		//double result = input;
		//double result = Math.sin(input);
		return result;
	}

	public Action calculateNextAction(Bot bot, Beast beast) {

		return process(bot, beast);

	}

	public void print() {
		
		System.out.println("weights_neuron1 [0] = " + weights_neuron1[0] + ";");
		System.out.println("weights_neuron1 [1] = " + weights_neuron1[1] + ";");
		System.out.println("weights_neuron1 [2] = " + weights_neuron1[2] + ";");
		System.out.println("weights_neuron1 [3] = " + weights_neuron1[3] + ";");
		System.out.println("weights_neuron1 [4] = " + weights_neuron1[4] + ";");
		System.out.println("weights_neuron1 [5] = " + weights_neuron1[5] + ";");

		System.out.println("weights_neuron2 [0] = " + weights_neuron2[0] + ";");
		System.out.println("weights_neuron2 [1] = " + weights_neuron2[1] + ";");
		System.out.println("weights_neuron2 [2] = " + weights_neuron2[2] + ";");
		System.out.println("weights_neuron2 [3] = " + weights_neuron2[3] + ";");
		System.out.println("weights_neuron2 [4] = " + weights_neuron2[4] + ";");
		System.out.println("weights_neuron2 [5] = " + weights_neuron2[5] + ";");

		System.out.println("weights_neuron3 [0] = " + weights_neuron3[0] + ";");
		System.out.println("weights_neuron3 [1] = " + weights_neuron3[1] + ";");
		System.out.println("weights_neuron3 [2] = " + weights_neuron3[2] + ";");
		System.out.println("weights_neuron3 [3] = " + weights_neuron3[3] + ";");
		System.out.println("weights_neuron3 [4] = " + weights_neuron3[4] + ";");
		System.out.println("weights_neuron3 [5] = " + weights_neuron3[5] + ";");

	}

	public Brain clone() {
		Brain result = new Brain();
		result.weights_neuron1 = Arrays.copyOf(weights_neuron1, weights_neuron1.length);

		result.weights_neuron2 = Arrays.copyOf(weights_neuron2, weights_neuron2.length);
		result.weights_neuron3 = Arrays.copyOf(weights_neuron3, weights_neuron3.length);
			
		result.weights_neuron11 = Arrays.copyOf(weights_neuron11, weights_neuron11.length);
		result.weights_neuron12 = Arrays.copyOf(weights_neuron12, weights_neuron12.length);
		result.weights_neuron13 = Arrays.copyOf(weights_neuron13, weights_neuron13.length);
		result.weights_neuron14 = Arrays.copyOf(weights_neuron14, weights_neuron14.length);
		result.weights_neuron15 = Arrays.copyOf(weights_neuron15, weights_neuron15.length);
		
		result.weights_neuron21 = Arrays.copyOf(weights_neuron21, weights_neuron21.length);
		result.weights_neuron22 = Arrays.copyOf(weights_neuron22, weights_neuron22.length);
		result.weights_neuron23 = Arrays.copyOf(weights_neuron23, weights_neuron23.length);
		result.weights_neuron24 = Arrays.copyOf(weights_neuron24, weights_neuron24.length);
		result.weights_neuron25 = Arrays.copyOf(weights_neuron25, weights_neuron25.length);

		return result;
	}


	public boolean differentFrom(Brain brain) {
		boolean different = false;
		for(int i=0; i< weights_neuron1.length; i++) {
			if(weights_neuron1[i] != brain.weights_neuron1[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron2.length; i++) {
			if(weights_neuron2[i] != brain.weights_neuron2[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron3.length; i++) {
			if(weights_neuron3[i] != brain.weights_neuron3[i])
				different= true;
		}
		
		
		for(int i=0; i< weights_neuron11.length; i++) {
			if(weights_neuron11[i] != brain.weights_neuron11[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron12.length; i++) {
			if(weights_neuron12[i] != brain.weights_neuron12[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron13.length; i++) {
			if(weights_neuron13[i] != brain.weights_neuron13[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron14.length; i++) {
			if(weights_neuron14[i] != brain.weights_neuron14[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron15.length; i++) {
			if(weights_neuron15[i] != brain.weights_neuron15[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron21.length; i++) {
			if(weights_neuron21[i] != brain.weights_neuron21[i])
				different= true;
		}
		
		for(int i=0; i< weights_neuron22.length; i++) {
			if(weights_neuron22[i] != brain.weights_neuron22[i])
				different= true;
		}
		return different;
	}
	
	
	public void learn(Bot bot, Beast beast, Action action) {
		
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

		
		double activation_neuron11 = activation_neuron1* weights_neuron11[0] +  activation_neuron2* weights_neuron11[1] + activation_neuron3* weights_neuron11[2] + weights_neuron11[3];		
		double activation_neuron12 = activation_neuron1* weights_neuron12[0] +  activation_neuron2* weights_neuron12[1] + activation_neuron3* weights_neuron12[2] + weights_neuron12[3];
		double activation_neuron13 = activation_neuron1* weights_neuron13[0] +  activation_neuron2* weights_neuron13[1] + activation_neuron3* weights_neuron13[2] + weights_neuron13[3];		
		double activation_neuron14 = activation_neuron1* weights_neuron14[0] +  activation_neuron2* weights_neuron14[1] + activation_neuron3* weights_neuron14[2] + weights_neuron14[3];
		double activation_neuron15 = activation_neuron1* weights_neuron15[0] +  activation_neuron2* weights_neuron15[1] + activation_neuron3* weights_neuron15[2] + weights_neuron15[3];
		
		activation_neuron11 = activate(activation_neuron11);
		activation_neuron12 = activate(activation_neuron12);
		activation_neuron13 = activate(activation_neuron13);
		activation_neuron14 = activate(activation_neuron14);
		activation_neuron15 = activate(activation_neuron15);
		

		double activation_neuron21 = activation_neuron11* weights_neuron21[0] +  activation_neuron12* weights_neuron21[1] + activation_neuron13* weights_neuron21[2] + activation_neuron14* weights_neuron21[3] + activation_neuron15* weights_neuron21[4] + weights_neuron21[5]  ;		
		double activation_neuron22 = activation_neuron11* weights_neuron22[0] +  activation_neuron12* weights_neuron22[1] + activation_neuron13* weights_neuron22[2] + activation_neuron14* weights_neuron22[3] + activation_neuron15* weights_neuron22[4] + weights_neuron22[5] ;
		double activation_neuron23 = activation_neuron11* weights_neuron23[0] +  activation_neuron12* weights_neuron23[1] + activation_neuron13* weights_neuron23[2] + activation_neuron14* weights_neuron23[3] + activation_neuron15* weights_neuron23[4] + weights_neuron23[5] ;		
		double activation_neuron24 = activation_neuron11* weights_neuron24[0] +  activation_neuron12* weights_neuron24[1] + activation_neuron13* weights_neuron24[2] + activation_neuron14* weights_neuron24[3] + activation_neuron15* weights_neuron24[4] + weights_neuron24[5] ;
		double activation_neuron25 = activation_neuron11* weights_neuron25[0] +  activation_neuron12* weights_neuron25[1] + activation_neuron13* weights_neuron25[2] + activation_neuron14* weights_neuron25[3] + activation_neuron15* weights_neuron25[4] + weights_neuron25[5] ;
		
		activation_neuron21 = activate(activation_neuron21);
		activation_neuron22 = activate(activation_neuron22);
		activation_neuron23 = activate(activation_neuron23);
		activation_neuron24 = activate(activation_neuron24);
		activation_neuron25 = activate(activation_neuron25);
		
		
	
		
		double error_neuron21 = 0.0;
		double error_neuron22 = 0.0;
		double error_neuron23 = 0.0;
		double error_neuron24 = 0.0;
		double error_neuron25 = 0.0;
	
		if(action.equals(Action.TURN_LEFT)){

			error_neuron21 = activation_neuron21 - 1.0;
			error_neuron22 = activation_neuron22;
			error_neuron23 = activation_neuron23;
			error_neuron24 = activation_neuron24;
			error_neuron25 = activation_neuron25;
		} else if(action.equals(Action.TURN_RIGHT)) {
			error_neuron21 = activation_neuron21;
			error_neuron22 = activation_neuron22- 1.0;
			error_neuron23 = activation_neuron23;
			error_neuron24 = activation_neuron24 ;
			error_neuron25 = activation_neuron25;
		} else if(action.equals(Action.MOVE)) {
			error_neuron21 = activation_neuron21;
			error_neuron22 = activation_neuron22;
			error_neuron23 = activation_neuron23;
			error_neuron24 = activation_neuron24 - 1.0;
			error_neuron25 = activation_neuron25;
		} else if(action.equals(Action.SHOOT)) {
			error_neuron21 = activation_neuron21;
			error_neuron22 = activation_neuron22;
			error_neuron23 = activation_neuron23-1.0;
			error_neuron24 = activation_neuron24;
			error_neuron25 = activation_neuron25;
		}
		
		double error_neuron11 = (error_neuron21*weights_neuron21[0] + error_neuron22*weights_neuron22[0]+ error_neuron23*weights_neuron23[0] + error_neuron24*weights_neuron24[0] + error_neuron25*weights_neuron25[0])* derivative(activation_neuron11);
		double error_neuron12 = (error_neuron21*weights_neuron21[1] + error_neuron22*weights_neuron22[1]+ error_neuron23*weights_neuron23[1] + error_neuron24*weights_neuron24[1] + error_neuron25*weights_neuron25[1])* derivative(activation_neuron12);
		double error_neuron13 = (error_neuron21*weights_neuron21[2] + error_neuron22*weights_neuron22[2]+ error_neuron23*weights_neuron23[2] + error_neuron24*weights_neuron24[2] + error_neuron25*weights_neuron25[2])*derivative(activation_neuron13);
		double error_neuron14 = (error_neuron21*weights_neuron21[3] + error_neuron22*weights_neuron22[3]+ error_neuron23*weights_neuron23[3] + error_neuron24*weights_neuron24[3] + error_neuron25*weights_neuron25[3])* derivative(activation_neuron14);
		double error_neuron15 = (error_neuron21*weights_neuron21[4] + error_neuron22*weights_neuron22[4]+ error_neuron23*weights_neuron23[4] + error_neuron24*weights_neuron24[4] + error_neuron25*weights_neuron25[4])*derivative(activation_neuron15);
	
	
		double error_neuron1= (error_neuron11*weights_neuron11[0]+ error_neuron12*weights_neuron12[0] + error_neuron13*weights_neuron13[0] + error_neuron14*weights_neuron14[0]+error_neuron15*weights_neuron15[0])* derivative(activation_neuron1);
		double error_neuron2= (error_neuron11*weights_neuron11[1]+ error_neuron12*weights_neuron12[1] + error_neuron13*weights_neuron13[1] + error_neuron14*weights_neuron14[1]+error_neuron15*weights_neuron15[1])* derivative(activation_neuron2);
		double error_neuron3= (error_neuron11*weights_neuron11[2]+ error_neuron12*weights_neuron12[2] + error_neuron13*weights_neuron13[2] + error_neuron14*weights_neuron14[2]+error_neuron15*weights_neuron15[2])* derivative(activation_neuron3);
	
		
		//calculate delta's
		double[] delta_neuron1 = new double[6];
		double[] delta_neuron2 = new double[6];
		double[] delta_neuron3 = new double[6];

		
		
		double[] delta_neuron11 = new double[4];
		double[] delta_neuron12 = new double[4];
		double[] delta_neuron13 = new double[4];
		double[] delta_neuron14 = new double[4];
		double[] delta_neuron15 = new double[4];
		
		double[] delta_neuron21 = new double[6];
		double[] delta_neuron22 = new double[6];
		double[] delta_neuron23 = new double[6];
		double[] delta_neuron24 = new double[6];
		double[] delta_neuron25 = new double[6];
		
		delta_neuron1[0] =  error_neuron1*botX;
		delta_neuron1[1] =  error_neuron1*botY;
		delta_neuron1[2] =  error_neuron1*beastX;
		delta_neuron1[3] =  error_neuron1*beastY;
		delta_neuron1[4] =  error_neuron1*facingBot;
		delta_neuron1[5] =  error_neuron1;
		
		delta_neuron2[0] =  error_neuron2*botX;
		delta_neuron2[1] =  error_neuron2*botY;
		delta_neuron2[2] =  error_neuron2*beastX;
		delta_neuron2[3] =  error_neuron2*beastY;
		delta_neuron2[4] =  error_neuron2*facingBot;
		delta_neuron2[5] =  error_neuron2;
		
		delta_neuron3[0] =  error_neuron3*botX;
		delta_neuron3[1] =  error_neuron3*botY;
		delta_neuron3[2] =  error_neuron3*beastX;
		delta_neuron3[3] =  error_neuron3*beastY;
		delta_neuron3[4] =  error_neuron3*facingBot;
		delta_neuron3[5] =  error_neuron3;
		
		
		delta_neuron11[0] = error_neuron11*activation_neuron1;
		delta_neuron11[1] = error_neuron11*activation_neuron2;
		delta_neuron11[2] = error_neuron11*activation_neuron3;
		delta_neuron11[3] = error_neuron11;

		delta_neuron12[0] = error_neuron12*activation_neuron1;
		delta_neuron12[1] = error_neuron12*activation_neuron2;
		delta_neuron12[2] = error_neuron12*activation_neuron3;
		delta_neuron12[3] = error_neuron12;

		delta_neuron13[0] = error_neuron13*activation_neuron1;
		delta_neuron13[1] = error_neuron13*activation_neuron2;
		delta_neuron13[2] = error_neuron13*activation_neuron3;
		delta_neuron13[3] = error_neuron13;

		delta_neuron14[0] = error_neuron14*activation_neuron1;
		delta_neuron14[1] = error_neuron14*activation_neuron2;
		delta_neuron14[2] = error_neuron14*activation_neuron3;
		delta_neuron14[3] = error_neuron14;

		delta_neuron15[0] = error_neuron15*activation_neuron1;
		delta_neuron15[1] = error_neuron15*activation_neuron2;
		delta_neuron15[2] = error_neuron15*activation_neuron3;
		delta_neuron15[3] = error_neuron15;

		delta_neuron21[0] = error_neuron21*activation_neuron11;
		delta_neuron21[1] = error_neuron21*activation_neuron12;
		delta_neuron21[2] = error_neuron21*activation_neuron13;
		delta_neuron21[3] = error_neuron21*activation_neuron14;
		delta_neuron21[4] = error_neuron21*activation_neuron15;
		delta_neuron21[5] = error_neuron21;
		
		delta_neuron22[0] = error_neuron22*activation_neuron11;
		delta_neuron22[1] = error_neuron22*activation_neuron12;
		delta_neuron22[2] = error_neuron22*activation_neuron13;
		delta_neuron22[3] = error_neuron22*activation_neuron14;
		delta_neuron22[4] = error_neuron22*activation_neuron15;
		delta_neuron22[5] = error_neuron22;
		
		delta_neuron23[0] = error_neuron23*activation_neuron11;
		delta_neuron23[1] = error_neuron23*activation_neuron12;
		delta_neuron23[2] = error_neuron23*activation_neuron13;
		delta_neuron23[3] = error_neuron23*activation_neuron14;
		delta_neuron23[4] = error_neuron23*activation_neuron15;
		delta_neuron23[5] = error_neuron23;
		
		delta_neuron24[0] = error_neuron24*activation_neuron11;
		delta_neuron24[1] = error_neuron24*activation_neuron12;
		delta_neuron24[2] = error_neuron24*activation_neuron13;
		delta_neuron24[3] = error_neuron24*activation_neuron14;
		delta_neuron24[4] = error_neuron24*activation_neuron15;
		delta_neuron24[5] = error_neuron24;
		
		delta_neuron25[0] = error_neuron25*activation_neuron11;
		delta_neuron25[1] = error_neuron25*activation_neuron12;
		delta_neuron25[2] = error_neuron25*activation_neuron13;
		delta_neuron25[3] = error_neuron25*activation_neuron14;
		delta_neuron25[4] = error_neuron25*activation_neuron15;
		delta_neuron25[5] = error_neuron25;
		

		weights_neuron1[0] -= alpha*delta_neuron1[0];
		weights_neuron1[1] -= alpha*delta_neuron1[1];
		weights_neuron1[2] -= alpha*delta_neuron1[2];
		weights_neuron1[3] -= alpha*delta_neuron1[3];
		weights_neuron1[4] -= alpha*delta_neuron1[4];
		weights_neuron1[5] -= alpha*delta_neuron1[5];
	
		weights_neuron2[0] -= alpha*delta_neuron2[0];
		weights_neuron2[1] -= alpha*delta_neuron2[1];
		weights_neuron2[2] -= alpha*delta_neuron2[2];
		weights_neuron2[3] -= alpha*delta_neuron2[3];
		weights_neuron2[4] -= alpha*delta_neuron2[4];
		weights_neuron2[5] -= alpha*delta_neuron2[5];
	
		weights_neuron3[0] -= alpha*delta_neuron3[0];
		weights_neuron3[1] -= alpha*delta_neuron3[1];
		weights_neuron3[2] -= alpha*delta_neuron3[2];
		weights_neuron3[3] -= alpha*delta_neuron3[3];
		weights_neuron3[4] -= alpha*delta_neuron3[4];
		weights_neuron3[5] -= alpha*delta_neuron3[5];
	
		
		weights_neuron11[0] -= alpha*delta_neuron11[0];
		weights_neuron11[1] -= alpha*delta_neuron11[1];
		weights_neuron11[2] -= alpha*delta_neuron11[2];
		weights_neuron11[3] -= alpha*delta_neuron11[3];
		
		
		weights_neuron12[0] -= alpha*delta_neuron12[0];
		weights_neuron12[1] -= alpha*delta_neuron12[1];
		weights_neuron12[2] -= alpha*delta_neuron12[2];
		weights_neuron12[3] -= alpha*delta_neuron12[3];
		
		weights_neuron13[0] -= alpha*delta_neuron13[0];
		weights_neuron13[1] -= alpha*delta_neuron13[1];
		weights_neuron13[2] -= alpha*delta_neuron13[2];
		weights_neuron13[3] -= alpha*delta_neuron13[3];
		
		weights_neuron14[0] -= alpha*delta_neuron14[0];
		weights_neuron14[1] -= alpha*delta_neuron14[1];
		weights_neuron14[2] -= alpha*delta_neuron14[2];
		weights_neuron14[3] -= alpha*delta_neuron14[3];
		
		weights_neuron15[0] -= alpha*delta_neuron15[0];
		weights_neuron15[1] -= alpha*delta_neuron15[1];
		weights_neuron15[2] -= alpha*delta_neuron15[2];
		weights_neuron15[3] -= alpha*delta_neuron15[3];
		
		weights_neuron21[0] -= alpha*delta_neuron21[0];
		weights_neuron21[1] -= alpha*delta_neuron21[1];
		weights_neuron21[2] -= alpha*delta_neuron21[2];
		weights_neuron21[3] -= alpha*delta_neuron21[3];
		weights_neuron21[4] -= alpha*delta_neuron21[4];
		weights_neuron21[5] -= alpha*delta_neuron21[5];
		
		
		weights_neuron22[0] -= alpha*delta_neuron22[0];
		weights_neuron22[1] -= alpha*delta_neuron22[1];
		weights_neuron22[2] -= alpha*delta_neuron22[2];
		weights_neuron22[3] -= alpha*delta_neuron22[3];
		weights_neuron22[4] -= alpha*delta_neuron22[4];
		weights_neuron22[5] -= alpha*delta_neuron22[5];
		
		
		weights_neuron23[0] -= alpha*delta_neuron23[0];
		weights_neuron23[1] -= alpha*delta_neuron23[1];
		weights_neuron23[2] -= alpha*delta_neuron23[2];
		weights_neuron23[3] -= alpha*delta_neuron23[3];
		weights_neuron23[4] -= alpha*delta_neuron23[4];
		weights_neuron23[5] -= alpha*delta_neuron23[5];
	
		weights_neuron24[0] -= alpha*delta_neuron24[0];
		weights_neuron24[1] -= alpha*delta_neuron24[1];
		weights_neuron24[2] -= alpha*delta_neuron24[2];
		weights_neuron24[3] -= alpha*delta_neuron24[3];
		weights_neuron24[4] -= alpha*delta_neuron24[4];
		weights_neuron24[5] -= alpha*delta_neuron24[5];
		
		weights_neuron25[0] -= alpha*delta_neuron25[0];
		weights_neuron25[1] -= alpha*delta_neuron25[1];
		weights_neuron25[2] -= alpha*delta_neuron25[2];
		weights_neuron25[3] -= alpha*delta_neuron25[3];
		weights_neuron25[4] -= alpha*delta_neuron25[4];
		weights_neuron25[5] -= alpha*delta_neuron25[5];
		
	//	System.out.println("LEARNED");
	}
	
	private double derivative(double activation) {
		return activation*(1-activation);
		//return 1.0/(Math.pow(1.0 + Math.abs(activation), 2.0));
		//return 1;
	}

}
