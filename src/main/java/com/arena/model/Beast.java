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
		//this.location = Arena.getRandomLocation();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
		location.moveRandom();
//		location.moveRandom();
//		location.moveRandom();
//		location.moveRandom();
//		location.moveRandom();	
//		location.moveRandom();
//		location.moveRandom();
//		location.moveRandom();
//		location.moveRandom();	location.moveRandom();
//		location.moveRandom();
//		location.moveRandom();
//		location.moveRandom();
		
//		location.moveLeft();
//		location.moveLeft();
//		location.moveLeft();
//		location.moveLeft();
//		location.moveDown();
//		location.moveDown();
//		location.moveDown();
//		location.moveDown();
//		location.moveDown();
//		location.moveRight();
//		location.moveRight();
//		location.moveRight();
//		location.moveRight();
//		location.moveDown();
//		location.moveDown();
//		location.moveDown();
//		location.moveDown();
//		location.moveDown();
		
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

	public boolean shotAt(Location location, Facing facing) {

		int beastX = this.getLocation().getX();
		int beastY = this.getLocation().getY();

		int damageLocationX = location.getX();
		int damageLocationY = location.getY();
		boolean xOk = false;
		boolean yOk = false;
		
		int resultX = beastX - damageLocationX;
		int resultY = beastY - damageLocationY;
		
		if(resultX == 0) {
			if(facing.direction.getX() == 0) {
				xOk = true;
			}
		} else{
			if(resultX*facing.direction.getX()>0) {
				xOk = true;
			}
		}
		if(resultY == 0) {
			if(facing.direction.getY() == 0) {
				yOk = true;
			}
		}else {
			if(resultY*facing.direction.getY()>0) {
				yOk = true;
			}
		}
		
		

		if(Math.abs(resultX) <20) {
			if(facing.direction.getX() == 0) {
				xOk = true;
			}
		}
		
		if(Math.abs(resultY) < 20) {
			if(facing.direction.getY() == 0) {
				yOk = true;
			}
		}
		
		if(xOk && yOk) {
		//	this.health -= Fysics.DAMAGE;
			//System.out.println("beast got hit");
			return true;
		}
		
		
		return false;

	}

}
