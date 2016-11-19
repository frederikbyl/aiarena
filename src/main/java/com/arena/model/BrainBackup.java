package com.arena.model;

import java.util.Arrays;
import java.util.Random;

public class BrainBackup {

	private double[] weights_neuron1 = new double[7];
	private double[] weights_neuron2 = new double[7];
	private double[] weights_neuron3 = new double[7];

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
	private double[] weights_neuron16 = new double[7];
	private double[] weights_neuron17 = new double[7];
	
	

	// public void initialise() {
	//
	// weights_neuron1 [0] = 635.7340964058819;
	// weights_neuron1 [1] = -1793.6113689650876;
	// weights_neuron1 [2] = -412.39712688052936;
	// weights_neuron1 [3] = -58651.15257894648;
	// weights_neuron1 [4] = -29.667177083476073;
	// weights_neuron1 [5] = 1452.708847234584;
	// weights_neuron1 [6] = -1495.2196249404853;
	// weights_neuron2 [0] = 1412.4880914235164;
	// weights_neuron2 [1] = 258.9463216329753;
	// weights_neuron2 [2] = -1481.2613187239244;
	// weights_neuron2 [3] = -1721.87777043363;
	// weights_neuron2 [4] = -1958.3047992820646;
	// weights_neuron2 [5] = 143.95254157761082;
	// weights_neuron2 [6] = -836.9494728607365;
	// weights_neuron3 [0] = 307.8597377259815;
	// weights_neuron3 [1] = -2387.949992718034;
	// weights_neuron3 [2] = -266.2787746340928;
	// weights_neuron3 [3] = 4079.4901367189086;
	// weights_neuron3 [4] = 1048.2062503114018;
	// weights_neuron3 [5] = -751.0810011797879;
	// weights_neuron3 [6] = -1065.744369606478;
	// weights_neuron4 [0] = -2253.990866101706;
	// weights_neuron4 [1] = -6931.8118290394605;
	// weights_neuron4 [2] = 2690.7664224949312;
	// weights_neuron5 [0] = -3288.668337493888;
	// weights_neuron5 [1] = 2986.02060944136;
	// weights_neuron5 [2] = -703.176098952706;
	// weights_neuron6 [0] = 2259.8637852388265;
	// weights_neuron6 [1] = 296.8576496552159;
	// weights_neuron6 [2] = 4390.910008533943;
	// weights_neuron7 [0] = -1455.1671243656142;
	// weights_neuron7 [1] = 318.6182850137649;
	// weights_neuron7 [2] = 248.10151013488942;
	// weights_neuron8 [0] = 663.227750715933;
	// weights_neuron8 [1] = -6955.052244555066;
	// weights_neuron8 [2] = -699.4859762266005;
	// weights_neuron9 [0] = -40.33590926701843;
	// weights_neuron9 [1] = 799.4909716432151;
	// weights_neuron9 [2] = -250.86482331554967;
	// weights_neuron10 [0] = -1855.3310320505584;
	// weights_neuron10 [1] = -2941.373416996146;
	// weights_neuron10 [2] = -1336.152871296342;
	//
	// }
	//

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
		
		weights_neuron16[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron16[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron16[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron16[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron16[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron16[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron16[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		
		weights_neuron17[0] = (rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron17[1] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron17[2] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron17[3] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron17[4] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron17[5] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		weights_neuron17[6] =(rand.nextDouble() - 0.5) * rand.nextInt(50);
		

	}

	// public void initialise() {
	//
	// weights_neuron1 [0] = 26.83447729155115;
	// weights_neuron1 [1] = -146.67365076396027;
	// weights_neuron1 [2] = -0.6671360844866069;
	// weights_neuron1 [3] = -213.83910355638747;
	// weights_neuron1 [4] = -270.55961709126547;
	// weights_neuron1 [5] = -74.07749445048984;
	// weights_neuron1 [6] = 272.1945612157619;
	// weights_neuron2 [0] = 81.80092921992456;
	// weights_neuron2 [1] = -120.83892912563925;
	// weights_neuron2 [2] = 69.8387279718108;
	// weights_neuron2 [3] = -152.370368287391;
	// weights_neuron2 [4] = -19.329562228020354;
	// weights_neuron2 [5] = 220.86984012945067;
	// weights_neuron2 [6] = 225.3432448705454;
	// weights_neuron3 [0] = 35.89977276012546;
	// weights_neuron3 [1] = -42.83572715569228;
	// weights_neuron3 [2] = 485.0046303585519;
	// weights_neuron3 [3] = 17.15575812948618;
	// weights_neuron3 [4] = -29.54012615629594;
	// weights_neuron3 [5] = 981.2327210521914;
	// weights_neuron3 [6] = -130.2121963975297;
	// weights_neuron4 [0] = 371.7544640685394;
	// weights_neuron4 [1] = 118.24980875076797;
	// weights_neuron4 [2] = 67.68068537293036;
	// weights_neuron5 [0] = 315.800677505687;
	// weights_neuron5 [1] = -115.7656566622186;
	// weights_neuron5 [2] = -289.5912655368677;
	// weights_neuron6 [0] = 587.3716821840475;
	// weights_neuron6 [1] = -8.063066626141646;
	// weights_neuron6 [2] = -157.74635491226422;
	// weights_neuron7 [0] = -186.62115480065458;
	// weights_neuron7 [1] = -964.5397707164881;
	// weights_neuron7 [2] = -126.27691038500717;
	// weights_neuron8 [0] = -67.9791556966177;
	// weights_neuron8 [1] = 16.185092548615486;
	// weights_neuron8 [2] = 90.86623518213602;
	// weights_neuron9 [0] = 44.655338333333795;
	// weights_neuron9 [1] = 73.29150282667848;
	// weights_neuron9 [2] = -226.9963760434831;
	// weights_neuron10 [0] = -147.42699964057059;
	// weights_neuron10 [1] = 136.1185776600403;
	// weights_neuron10 [2] = -17.584927606823353;
	// }

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
		weights_neuron3[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron3[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

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

		weights_neuron16[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron16[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron16[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron16[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron16[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron16[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron16[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		
		weights_neuron17[0] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron17[1] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron17[2] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron17[3] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron17[4] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron17[5] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);
		weights_neuron17[6] += (rand.nextDouble() - 0.5) / (rand.nextDouble() * 1000);

	}

	public static BrainBackup procreate1(BrainBackup brain1, BrainBackup brain2) {
		BrainBackup result = new BrainBackup();
		result.initialise();
		
		result.weights_neuron1[0] = brain1.weights_neuron1[0];
		result.weights_neuron1[1] = brain2.weights_neuron1[1];
		result.weights_neuron1[2] = brain1.weights_neuron1[2];
		result.weights_neuron1[3] = brain2.weights_neuron1[3];
		result.weights_neuron1[4] = brain1.weights_neuron1[4];
		result.weights_neuron1[5] = brain2.weights_neuron1[5];
		result.weights_neuron1[6] = brain1.weights_neuron1[6];

		result.weights_neuron2[0] = brain1.weights_neuron2[0];
		result.weights_neuron2[1] = brain2.weights_neuron2[1];
		result.weights_neuron2[2] = brain1.weights_neuron2[2];
		result.weights_neuron2[3] = brain2.weights_neuron2[3];
		result.weights_neuron2[4] = brain1.weights_neuron2[4];
		result.weights_neuron2[5] = brain2.weights_neuron2[5];
		result.weights_neuron2[6] = brain1.weights_neuron2[6];

		result.weights_neuron3[0] = brain1.weights_neuron3[0];
		result.weights_neuron3[1] = brain2.weights_neuron3[1];
		result.weights_neuron3[2] = brain1.weights_neuron3[2];
		result.weights_neuron3[3] = brain2.weights_neuron3[3];
		result.weights_neuron3[4] = brain1.weights_neuron3[4];
		result.weights_neuron3[5] = brain2.weights_neuron3[5];
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
		
		result.weights_neuron16[0] = brain1.weights_neuron16[0];
		result.weights_neuron16[1] = brain2.weights_neuron16[1];
		result.weights_neuron16[2] = brain1.weights_neuron16[2];
		result.weights_neuron16[3] = brain2.weights_neuron16[3];
		result.weights_neuron16[4] = brain1.weights_neuron16[4];
		result.weights_neuron16[5] = brain2.weights_neuron16[5];
		result.weights_neuron16[6] = brain1.weights_neuron16[6];
		
		result.weights_neuron17[0] = brain2.weights_neuron17[0];
		result.weights_neuron17[1] = brain1.weights_neuron17[1];
		result.weights_neuron17[2] = brain2.weights_neuron17[2];
		result.weights_neuron17[3] = brain1.weights_neuron17[3];
		result.weights_neuron17[4] = brain2.weights_neuron17[4];
		result.weights_neuron17[5] = brain1.weights_neuron17[5];
		result.weights_neuron17[6] = brain2.weights_neuron17[6];
		
		return result;
	}

	
	public static BrainBackup procreate2(BrainBackup brain1, BrainBackup brain2) {
		BrainBackup result = new BrainBackup();
		result.initialise();
		
		result.weights_neuron1[0] = brain2.weights_neuron1[0];
		result.weights_neuron1[1] = brain1.weights_neuron1[1];
		result.weights_neuron1[2] = brain2.weights_neuron1[2];
		result.weights_neuron1[3] = brain1.weights_neuron1[3];
		result.weights_neuron1[4] = brain2.weights_neuron1[4];
		result.weights_neuron1[5] = brain1.weights_neuron1[5];
		result.weights_neuron1[6] = brain2.weights_neuron1[6];

		result.weights_neuron2[0] = brain2.weights_neuron2[0];
		result.weights_neuron2[1] = brain1.weights_neuron2[1];
		result.weights_neuron2[2] = brain2.weights_neuron2[2];
		result.weights_neuron2[3] = brain1.weights_neuron2[3];
		result.weights_neuron2[4] = brain2.weights_neuron2[4];
		result.weights_neuron2[5] = brain1.weights_neuron2[5];
		result.weights_neuron2[6] = brain2.weights_neuron2[6];

		result.weights_neuron3[0] = brain2.weights_neuron3[0];
		result.weights_neuron3[1] = brain1.weights_neuron3[1];
		result.weights_neuron3[2] = brain2.weights_neuron3[2];
		result.weights_neuron3[3] = brain1.weights_neuron3[3];
		result.weights_neuron3[4] = brain2.weights_neuron3[4];
		result.weights_neuron3[5] = brain1.weights_neuron3[5];
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
		
		result.weights_neuron16[0] = brain2.weights_neuron16[0];
		result.weights_neuron16[1] = brain1.weights_neuron16[1];
		result.weights_neuron16[2] = brain2.weights_neuron16[2];
		result.weights_neuron16[3] = brain1.weights_neuron16[3];
		result.weights_neuron16[4] = brain2.weights_neuron16[4];
		result.weights_neuron16[5] = brain1.weights_neuron16[5];
		result.weights_neuron16[6] = brain2.weights_neuron16[6];
		
		result.weights_neuron17[0] = brain1.weights_neuron17[0];
		result.weights_neuron17[1] = brain2.weights_neuron17[1];
		result.weights_neuron17[2] = brain1.weights_neuron17[2];
		result.weights_neuron17[3] = brain2.weights_neuron17[3];
		result.weights_neuron17[4] = brain1.weights_neuron17[4];
		result.weights_neuron17[5] = brain2.weights_neuron17[5];
		result.weights_neuron17[6] = brain1.weights_neuron17[6];
		
		return result;
	}
	
	public static BrainBackup procreate3(BrainBackup brain1, BrainBackup brain2) {
		BrainBackup result = new BrainBackup();
		result.initialise();
		
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

		result.weights_neuron9[0] = brain1.weights_neuron9[0];
		result.weights_neuron9[1] = brain1.weights_neuron9[1];
		result.weights_neuron9[2] = brain1.weights_neuron9[2];

		result.weights_neuron10[0] = brain2.weights_neuron10[0];
		result.weights_neuron10[1] = brain2.weights_neuron10[1];
		result.weights_neuron10[2] = brain2.weights_neuron10[2];
		

//		result.weights_neuron11[0] = brain1.weights_neuron11[0];
//		result.weights_neuron11[1] = brain1.weights_neuron11[1];
//		result.weights_neuron11[2] = brain1.weights_neuron11[2];
//		result.weights_neuron11[3] = brain1.weights_neuron11[3];
//		result.weights_neuron11[4] = brain1.weights_neuron11[4];
//		result.weights_neuron11[5] = brain1.weights_neuron11[5];
//		result.weights_neuron11[6] = brain1.weights_neuron11[6];
//		
//		
//		result.weights_neuron12[0] = brain2.weights_neuron12[0];
//		result.weights_neuron12[1] = brain2.weights_neuron12[1];
//		result.weights_neuron12[2] = brain2.weights_neuron12[2];
//		result.weights_neuron12[3] = brain2.weights_neuron12[3];
//		result.weights_neuron12[4] = brain2.weights_neuron12[4];
//		result.weights_neuron12[5] = brain2.weights_neuron12[5];
//		result.weights_neuron12[6] = brain2.weights_neuron12[6];
//		
//		
//		result.weights_neuron13[0] = brain1.weights_neuron13[0];
//		result.weights_neuron13[1] = brain1.weights_neuron13[1];
//		result.weights_neuron13[2] = brain1.weights_neuron13[2];
//		result.weights_neuron13[3] = brain1.weights_neuron13[3];
//		result.weights_neuron13[4] = brain1.weights_neuron13[4];
//		result.weights_neuron13[5] = brain1.weights_neuron13[5];
//		result.weights_neuron13[6] = brain1.weights_neuron13[6];
//		
//		result.weights_neuron14[0] = brain2.weights_neuron14[0];
//		result.weights_neuron14[1] = brain2.weights_neuron14[1];
//		result.weights_neuron14[2] = brain2.weights_neuron14[2];
//		result.weights_neuron14[3] = brain2.weights_neuron14[3];
//		result.weights_neuron14[4] = brain2.weights_neuron14[4];
//		result.weights_neuron14[5] = brain2.weights_neuron14[5];
//		result.weights_neuron14[6] = brain2.weights_neuron14[6];
//		
//		result.weights_neuron15[0] = brain1.weights_neuron15[0];
//		result.weights_neuron15[1] = brain1.weights_neuron15[1];
//		result.weights_neuron15[2] = brain1.weights_neuron15[2];
//		result.weights_neuron15[3] = brain1.weights_neuron15[3];
//		result.weights_neuron15[4] = brain1.weights_neuron15[4];
//		result.weights_neuron15[5] = brain1.weights_neuron15[5];
//		result.weights_neuron15[6] = brain1.weights_neuron15[6];
//		
//		result.weights_neuron16[0] = brain2.weights_neuron16[0];
//		result.weights_neuron16[1] = brain2.weights_neuron16[1];
//		result.weights_neuron16[2] = brain2.weights_neuron16[2];
//		result.weights_neuron16[3] = brain2.weights_neuron16[3];
//		result.weights_neuron16[4] = brain2.weights_neuron16[4];
//		result.weights_neuron16[5] = brain2.weights_neuron16[5];
//		result.weights_neuron16[6] = brain2.weights_neuron16[6];
//		
//		result.weights_neuron17[0] = brain1.weights_neuron17[0];
//		result.weights_neuron17[1] = brain1.weights_neuron17[1];
//		result.weights_neuron17[2] = brain1.weights_neuron17[2];
//		result.weights_neuron17[3] = brain1.weights_neuron17[3];
//		result.weights_neuron17[4] = brain1.weights_neuron17[4];
//		result.weights_neuron17[5] = brain1.weights_neuron17[5];
//		result.weights_neuron17[6] = brain1.weights_neuron17[6];

		return result;
	}
	public static BrainBackup procreate4(BrainBackup brain1, BrainBackup brain2) {
		BrainBackup result = new BrainBackup();
		result.initialise();
		
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
		
		result.weights_neuron16[0] = brain1.weights_neuron16[0];
		result.weights_neuron16[1] = brain1.weights_neuron16[1];
		result.weights_neuron16[2] = brain1.weights_neuron16[2];
		result.weights_neuron16[3] = brain1.weights_neuron16[3];
		result.weights_neuron16[4] = brain1.weights_neuron16[4];
		result.weights_neuron16[5] = brain1.weights_neuron16[5];
		result.weights_neuron16[6] = brain1.weights_neuron16[6];
		
		result.weights_neuron17[0] = brain2.weights_neuron17[0];
		result.weights_neuron17[1] = brain2.weights_neuron17[1];
		result.weights_neuron17[2] = brain2.weights_neuron17[2];
		result.weights_neuron17[3] = brain2.weights_neuron17[3];
		result.weights_neuron17[4] = brain2.weights_neuron17[4];
		result.weights_neuron17[5] = brain2.weights_neuron17[5];
		result.weights_neuron17[6] = brain2.weights_neuron17[6];
		return result;
	}
	
	public Action process(Bot bot, Beast beast) {

		// calculate output
		double botX = ((double) bot.getLocation().getX()) / Arena.MAX_X;
		double botY = ((double) bot.getLocation().getY()) / Arena.MAX_Y;

		double beastX = ((double) beast.getLocation().getX()) / Arena.MAX_X;
		double beastY = ((double) beast.getLocation().getY()) / Arena.MAX_Y;

		double botHealth = bot.getHealth();
		double beastHealth = beast.getHealth();
		double facingBot = ((double) bot.getFacing().getDirection().ordinal()) / 40.0;

		double activation_neuron1 = weights_neuron1[0] * botX + weights_neuron1[1] * botY + weights_neuron1[2] * beastX
				+ weights_neuron1[3] * beastY + weights_neuron1[4] * botHealth + weights_neuron1[5] * beastHealth
				+ weights_neuron1[6] * facingBot;
		activation_neuron1 = activate(activation_neuron1);

		double activation_neuron2 = weights_neuron2[0] * botX + weights_neuron2[1] * botY + weights_neuron2[2] * beastX
				+ weights_neuron2[3] * beastY + weights_neuron2[4] * botHealth + weights_neuron2[5] * beastHealth
				+ weights_neuron2[6] * facingBot;
		activation_neuron2 = activate(activation_neuron2);

		double activation_neuron3 = weights_neuron3[0] * botX + weights_neuron3[1] * botY + weights_neuron3[2] * beastX
				+ weights_neuron3[3] * beastY + weights_neuron3[4] * botHealth + weights_neuron3[5] * beastHealth
				+ weights_neuron3[6] * facingBot;
		activation_neuron3 = activate(activation_neuron3);

		double activation_neuron4 = activation_neuron1 * weights_neuron4[0] + activation_neuron2 * weights_neuron4[1]
				+ activation_neuron3 * weights_neuron4[2];
		double activation_neuron5 = activation_neuron1 * weights_neuron5[0] + activation_neuron2 * weights_neuron5[1]
				+ activation_neuron3 * weights_neuron5[2];
		double activation_neuron6 = activation_neuron1 * weights_neuron6[0] + activation_neuron2 * weights_neuron6[1]
				+ activation_neuron3 * weights_neuron6[2];
		double activation_neuron7 = activation_neuron1 * weights_neuron7[0] + activation_neuron2 * weights_neuron7[1]
				+ activation_neuron3 * weights_neuron7[2];
		double activation_neuron8 = activation_neuron1 * weights_neuron8[0] + activation_neuron2 * weights_neuron8[1]
				+ activation_neuron3 * weights_neuron8[2];
		double activation_neuron9 = activation_neuron1 * weights_neuron9[0] + activation_neuron2 * weights_neuron9[1]
				+ activation_neuron3 * weights_neuron9[2];
		double activation_neuron10 = activation_neuron1 * weights_neuron10[0] + activation_neuron2 * weights_neuron10[1]
				+ activation_neuron3 * weights_neuron10[2];

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
		
		double activation_neuron16 = activation_neuron4* weights_neuron16[0] +  activation_neuron5* weights_neuron16[1] + activation_neuron6* weights_neuron16[2] + activation_neuron7* weights_neuron16[3] + activation_neuron8* weights_neuron16[4] + activation_neuron9* weights_neuron16[5] + activation_neuron10* weights_neuron16[6] ;
	
		double activation_neuron17 = activation_neuron4* weights_neuron17[0] +  activation_neuron5* weights_neuron17[1] + activation_neuron6* weights_neuron17[2] + activation_neuron7* weights_neuron17[3] + activation_neuron8* weights_neuron17[4] + activation_neuron9* weights_neuron17[5] + activation_neuron10* weights_neuron17[6] ;
		
		activation_neuron11 = activate(activation_neuron11);
		activation_neuron12 = activate(activation_neuron12);
		activation_neuron13 = activate(activation_neuron13);
		activation_neuron14 = activate(activation_neuron14);
		activation_neuron15 = activate(activation_neuron15);
		activation_neuron16 = activate(activation_neuron16);
		activation_neuron17 = activate(activation_neuron17);
		

		if (activation_neuron11 > activation_neuron12 && activation_neuron11 > activation_neuron13
				&& activation_neuron11 > activation_neuron14 && activation_neuron11 > activation_neuron15
				&& activation_neuron11 > activation_neuron16 && activation_neuron11 > activation_neuron17) {

			return Action.TURN_LEFT;

		}

		if (activation_neuron12 > activation_neuron11 && activation_neuron12 > activation_neuron13
				&& activation_neuron12 > activation_neuron14 && activation_neuron12 > activation_neuron15
				&& activation_neuron12 > activation_neuron16 && activation_neuron12 > activation_neuron17) {
			return Action.TURN_RIGHT;

		}

		if (activation_neuron13 > activation_neuron11 && activation_neuron13 > activation_neuron12
				&& activation_neuron13 > activation_neuron14 && activation_neuron13 > activation_neuron15
				&& activation_neuron13 > activation_neuron16 && activation_neuron13 > activation_neuron17) {
			return Action.SHOOT;
		}

		if (activation_neuron14 > activation_neuron11 && activation_neuron14 > activation_neuron12
				&& activation_neuron14 > activation_neuron13 && activation_neuron14 > activation_neuron15
				&& activation_neuron14 > activation_neuron16 && activation_neuron14 > activation_neuron17) {
			return Action.MOVE_LEFT;
		}

		if (activation_neuron15 > activation_neuron11 && activation_neuron15 > activation_neuron12
				&& activation_neuron15 > activation_neuron13 && activation_neuron15 > activation_neuron14
				&& activation_neuron15 > activation_neuron16 && activation_neuron15 > activation_neuron17) {
			return Action.MOVE_RIGHT;
		}

		if (activation_neuron16 >= activation_neuron11 && activation_neuron16 >= activation_neuron12
				&& activation_neuron16 >= activation_neuron13 && activation_neuron16 >= activation_neuron14
				&& activation_neuron16 >= activation_neuron15 && activation_neuron16 >= activation_neuron17) {
			return Action.MOVE_UP;
		}

		if (activation_neuron17 > activation_neuron11 && activation_neuron17 > activation_neuron12
				&& activation_neuron17 > activation_neuron13 && activation_neuron17 > activation_neuron14
				&& activation_neuron17 > activation_neuron15 && activation_neuron17 > activation_neuron16) {
			return Action.MOVE_DOWN;
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

		System.out.println("weights_neuron9 [0] = " + weights_neuron9[0] + ";");
		System.out.println("weights_neuron9 [1] = " + weights_neuron9[1] + ";");
		System.out.println("weights_neuron9 [2] = " + weights_neuron9[2] + ";");

		System.out.println("weights_neuron10 [0] = " + weights_neuron10[0] + ";");
		System.out.println("weights_neuron10 [1] = " + weights_neuron10[1] + ";");
		System.out.println("weights_neuron10 [2] = " + weights_neuron10[2] + ";");
	}

	public BrainBackup clone() {
		BrainBackup result = new BrainBackup();
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
		result.weights_neuron16 = Arrays.copyOf(weights_neuron16, weights_neuron16.length);
		result.weights_neuron17 = Arrays.copyOf(weights_neuron17, weights_neuron17.length);

		return result;
	}

}
