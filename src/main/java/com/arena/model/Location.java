package com.arena.model;

import java.util.Random;

public class Location {
	
	private int x;
	private int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void moveRandom() {
		Random rand = new Random();
		if (rand.nextBoolean()) {
			if (rand.nextBoolean()) {
				moveUp();
				moveUp();
			} else {
				moveDown();
				moveDown();
			}
		}
		if(rand.nextBoolean()) {
			if (rand.nextBoolean()) {
				moveLeft();
				moveLeft();
			} else {
				moveRight();
				moveRight();
			}
		}
		
	}
	public static double calculateDistance(Beast beast, Bot bot) {
		Location beastLocation = beast.getLocation();
		Location botLocation = bot.getLocation();
		return Math.pow( Math.pow( (beastLocation.getX() - botLocation.getX()), 2.0)  + Math.pow( (beastLocation.getY() - botLocation.getY()), 2.0) , 1.0/2.0);
	}
	public static double calculateDistance(Bot bot, Bot bot2) {
		Location bot1Location = bot.getLocation();
		Location bot2Location = bot2.getLocation();
		return Math.pow( Math.pow( (bot1Location.getX() - bot2Location.getX()), 2.0)  + Math.pow( (bot1Location.getY() - bot2Location.getY()), 2.0) , 1.0/2.0);
	}
	public static double calculateDistance(Beast beast, Location location) {
		Location beastLocation = beast.getLocation();
		
		return Math.pow( Math.pow( (beastLocation.getX() - location.getX()), 2.0)  + Math.pow( (beastLocation.getY() - location.getY()), 2.0) , 1.0/2.0);
	}
	
	
	public void moveUp() {
		if(y==0) {
			y=Arena.MAX_Y;
		} else {
			y--;
		}
		
	}
	
	public void moveDown() {
		if(y==Arena.MAX_Y) {
			y=0;
		} else {
			y++;
		}
	}
	
	public void moveLeft() {
		if(x==0){
			x=Arena.MAX_X;
		} else  {
			x--;	
		}
	}
	
	public void moveRight() {
		if(x==Arena.MAX_X){
			x=0;
		} else  {
			x++;	
		}
	}
	
	
	
}
