package com.arena.model;

public enum Direction {
	
	NONE(0,0),
	ONE(1,0),
	TWO(1,1),
	THREE(0,1),
	FOUR(-1,1),
	FIVE(-1,0),
	SIX(-1,-1),
	SEVEN(0,-1),
	EIGHT(1,-1);
	
	
	private int X;
	private int Y;
	
	
	private Direction(int x, int y) {
		X = x;
		Y = y;
	}

	public int getX() {
		return X;
	}
	
	public int getY() {
		return Y;
	}

	public Direction leftDirection() {
		switch (this) {
        case ONE:
            return TWO;
        case TWO:
        	return THREE;
        case THREE:
        	return FOUR;
        case FOUR:
        	return FIVE;
        case FIVE:
        	return SIX;
        case SIX:
        	return SEVEN;
        case SEVEN: 
        	return EIGHT;
        case EIGHT:
        	return ONE;
        

        default:
            throw new AssertionError("Unknown operations " + this);
		}
	}


	public Direction rightDirection() {
		switch (this) {
        case ONE:
            return EIGHT;
        case TWO:
        	return ONE;
        case THREE:
        	return TWO;
        case FOUR:
        	return THREE;
        case FIVE:
        	return FOUR;
        case SIX:
        	return FIVE;
        case SEVEN: 
        	return SIX;
        case EIGHT:
        	return SEVEN;
        
        

        default:
            throw new AssertionError("Unknown operations " + this);
		}
	}
	
	

}
