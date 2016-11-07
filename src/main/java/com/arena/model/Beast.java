package com.arena.model;

public class Beast {
	
	private Location location;
	private double health;
	
	public Beast(double health) {
		super();
		this.health = health;
		this.location = Arena.getRandomLocation();
	}

	public void move() {
		
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		
		location.moveDown();
		location.moveLeft();
		location.moveDown();
		location.moveLeft();
		location.moveDown();
		location.moveLeft();
		location.moveDown();
		location.moveLeft();
	}
	
	public Location initialiseLocation() {
		return Arena.getRandomLocation();
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public void shotAt(Location location, Facing facing) {
		
		int beastX = this.getLocation().getX();
		int beastY = this.getLocation().getY();
		
		int damageLocationX = location.getX();
		int damageLocationY = location.getY();
		boolean hit = false;
		boolean outArena = false;
		while(!hit && !outArena) {
			if(damageLocationX == beastX && damageLocationY == beastY) {
				hit = true;
				this.health -= Fysics.DAMAGE;
				System.out.println("BEAST GOT HIT!!!!!");
			}
			if(damageLocationX<0 || damageLocationX > Arena.MAX_X || damageLocationY < 0 || damageLocationY > Arena.MAX_Y) {
				outArena = true;
			}
			damageLocationX += facing.direction.getX();
			damageLocationY += facing.direction.getY();
		}
		
	}

}
