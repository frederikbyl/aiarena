package com.arena.model;

import java.util.ArrayList;

public class BotPopulation {
	
	private ArrayList<Bot> population = new ArrayList<Bot>();

	public BotPopulation(int populationSize) {
		Brain brain = new Brain();
		brain.initialise();
		for(int i=0; i<populationSize; i++) {
			Bot bot = new Bot(brain);
			
			bot.setLocation(Arena.getRandomLocation());
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

}
