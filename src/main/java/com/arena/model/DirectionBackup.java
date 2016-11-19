package com.arena.model;

public enum DirectionBackup {
	
	NONE(0,0),
	ONE(5,0),
	TWO(5,1),
	THREE(5,2),
	FOUR(5,3),
	FIVE(5,4),
	SIX(5,5),
	SEVEN(4,5),
	EIGHT(3,5),
	NINE(2,5),
	TEN(1,5),
	ELEVEN(0,5),
	TWELVE(-1,5),
	THIRTEEN(-2,5),
	FOURTEEN(-3,5),
	FIFTEEN(-4,5),
	SIXTEEN(-5,5),
	SEVENTEEN(-5,4),
	EIGHTEEN(-5,3),
	NINETEEN(-5,2),
	TWENTY(-5,1),
	TWENTYONE(-5,0),
	TWENTYTWO(-5,-1),
	TWENTYTHREE(-5,-2),
	TWENTYFOUR(-5,-3),
	TWENTYFIVE(-5,-4),
	TWENTYSIX(-5,-5),
	TWENTYSEVEN(-4,-5),
	TWENTYEIGHT(-3,-5),
	TWENTYNINE(-2,-5),
	THIRTY(-1,-5),
	THIRTYONE(0,-5),
	THIRTYTWO(1,-5),
	THIRTYTHREE(2,-5),
	THIRTYFOUR(3,-5),
	THIRTYFIVE(4,-5),
	THIRTYSIX(5,-5),
	THIRTYSEVEN(5,-4),
	THIRTYEIGHT(5,-3),
	THIRTYNINE(5,-2),
	FOURTY(5,-1);
	
	
	private int X;
	private int Y;
	
	
	private DirectionBackup(int x, int y) {
		X = x;
		Y = y;
	}

	public int getX() {
		return X;
	}
	
	public int getY() {
		return Y;
	}

	public DirectionBackup leftDirection() {
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
        	return NINE;
        case NINE:
        	return TEN;
        case TEN:
        	return ELEVEN;
        case ELEVEN:
        	return TWELVE;
        case TWELVE:
        	return THIRTEEN;
        case THIRTEEN:
        	return FOURTEEN;
        case FOURTEEN:
        	return FIFTEEN;
        case FIFTEEN:
        	return SIXTEEN;
        case SIXTEEN:
        	return SEVENTEEN;
        case SEVENTEEN:
        	return EIGHTEEN;
        case EIGHTEEN:
        	return NINETEEN;
        case NINETEEN:
        	return TWENTY;
        case TWENTY:
        	return TWENTYONE;
        case TWENTYONE:
        	return TWENTYTWO;
        case TWENTYTWO:
        	return TWENTYTHREE;
        case TWENTYTHREE:
        	return TWENTYFOUR;
        case TWENTYFOUR:
        	return TWENTYFIVE;
        case TWENTYFIVE:
        	return TWENTYSIX;
        case TWENTYSIX:
        	return TWENTYSEVEN;
        case TWENTYSEVEN:
        	return TWENTYEIGHT;
        case TWENTYEIGHT:
        	return TWENTYNINE;
        case TWENTYNINE:
        	return THIRTY;
        case THIRTY:
        	return THIRTYONE;
        case THIRTYONE:
        	return THIRTYTWO;
        case THIRTYTWO:
        	return THIRTYTHREE;
        case THIRTYTHREE:
        	return THIRTYFOUR;
        case THIRTYFOUR:
        	return THIRTYFIVE;
        case THIRTYFIVE:
        	return THIRTYSIX;
        case THIRTYSIX:
        	return THIRTYSEVEN;
        case THIRTYSEVEN:
        	return THIRTYEIGHT;
        case THIRTYEIGHT:
        	return THIRTYNINE;
        case THIRTYNINE:
        	return FOURTY;
        case FOURTY:
        	return ONE;
        

        default:
            throw new AssertionError("Unknown operations " + this);
		}
	}


	public DirectionBackup rightDirection() {
		switch (this) {
        case ONE:
            return FOURTY;
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
        case NINE:
        	return EIGHT;
        case TEN:
        	return NINE;
        case ELEVEN:
        	return TEN;
        case TWELVE:
        	return ELEVEN;
        case THIRTEEN:
        	return TWELVE;
        case FOURTEEN:
        	return THIRTEEN;
        case FIFTEEN:
        	return FOURTEEN;
        case SIXTEEN:
        	return FIFTEEN;
        case SEVENTEEN:
        	return SIXTEEN;
        case EIGHTEEN:
        	return SEVENTEEN;
        case NINETEEN:
        	return EIGHTEEN;
        case TWENTY:
        	return NINETEEN;
        case TWENTYONE:
        	return TWENTY;
        case TWENTYTWO:
        	return TWENTYONE;
        case TWENTYTHREE:
        	return TWENTYTWO;
        case TWENTYFOUR:
        	return TWENTYTHREE;
        case TWENTYFIVE:
        	return TWENTYFOUR;
        case TWENTYSIX:
        	return TWENTYFIVE;
        case TWENTYSEVEN:
        	return TWENTYSIX;
        case TWENTYEIGHT:
        	return TWENTYSEVEN;
        case TWENTYNINE:
        	return TWENTYEIGHT;
        case THIRTY:
        	return TWENTYNINE;
        case THIRTYONE:
        	return THIRTY;
        case THIRTYTWO:
        	return THIRTYONE;
        case THIRTYTHREE:
        	return THIRTYTWO;
        case THIRTYFOUR:
        	return THIRTYTHREE;
        case THIRTYFIVE:
        	return THIRTYFOUR;
        case THIRTYSIX:
        	return THIRTYFIVE;
        case THIRTYSEVEN:
        	return THIRTYSIX;
        case THIRTYEIGHT:
        	return THIRTYSEVEN;
        case THIRTYNINE:
        	return THIRTYEIGHT;
        case FOURTY:
        	return THIRTYNINE;
        

        default:
            throw new AssertionError("Unknown operations " + this);
		}
	}
	
	

}
