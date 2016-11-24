package com.arena.model;

import java.util.ArrayList;

public class BotPopulation {

	private Brain brain; 
	
	private ArrayList<Bot> population = new ArrayList<Bot>();

	public BotPopulation(int populationSize, Brain brain) {
		
		this.brain = brain;
		for(int i=0; i<populationSize; i++) {
			Bot bot = new Bot(brain);
			
			bot.setLocation(Arena.getRandomLocation());
			bot.setLocation(new Location(Arena.MAX_X-50,50));
		
			bot.setHealth(1.0);
			population.add(bot);	
		}
	}

	public int getSize() {
		return population.size();
	}

	public void react(Beast beast1) {
		ArrayList<Bot> deadBots = new ArrayList<Bot>();
		
		for (Bot bot : population) {
			bot.initialize();
			bot.react(beast1, this);
			if(bot.getHealth()<=0.0) {
				deadBots.add(bot);
			}
		}
		
		for(Bot bot : deadBots) {
			population.remove(bot);
		}
		
		
	}

	public  ArrayList<Bot> getList() {
		return population;
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

}
