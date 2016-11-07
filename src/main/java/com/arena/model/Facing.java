package com.arena.model;

public class Facing {
	
	Direction direction = Direction.ONE;
	
	
	public void turnLeft() {
		
		direction = direction.leftDirection();
		
	}
	
	public void turnRight() {
		direction = direction.rightDirection();
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
