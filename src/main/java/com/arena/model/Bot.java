package com.arena.model;

public class Bot {
	
	public Bot(Brain brain) {
		super();
		this.brain = brain;
	}



	private Location location;
	private Facing facing = new Facing(); //left right up down
	private double health;
	private Brain brain = new Brain();

	
	public Facing getFacing() {
		return facing;
	}

	public void setFacing(Facing facing) {
		this.facing = facing;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

	
	
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}



	public void react(Beast beast, BotPopulation population) {
		//standard energy cost:
		this.health -= Fysics.STANDARD_ENERGY_COST;
		
		//if distance beast1 <-> bot < 10
		if(Location.calculateDistance(beast, this) < Fysics.CRITICAL_DISTANCE ) {
			System.out.println("BEAST PROXIMITY DAMAGE");
			this.health -= Fysics.BEAST_CLOSE_ENERGY_COST;
		}
		
		//if distance bot <-> bot < 10
		int count = 0;
		for(Bot bot: population.getList()) {

			if(Location.calculateDistance(this, bot) < Fysics.CRITICAL_DISTANCE ) {
				count++;
			}
				
		}
		if(count > 1) {
			this.health -= Fysics.BEAST_CLOSE_ENERGY_COST;
		}
		
	
		//doBotAction: move/shoot/turn
		Action action = brain.calculateNextAction(this, beast);
		
		if(action.equals(Action.SHOOT)) {
			this.health -= Fysics.SHOOT_ENERGY_COST;
			
			beast.shotAt(location, facing);
		}
		if(action.equals(Action.MOVE_DOWN)) {
			location.moveDown();
			
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if(action.equals(Action.MOVE_LEFT)) {
			location.moveLeft();
			
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if(action.equals(Action.MOVE_RIGHT)) {
			location.moveRight();
			
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if(action.equals(Action.MOVE_UP)) {
			location.moveUp();
			
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if (action.equals(Action.TURN_LEFT)) {
			facing.turnLeft();
			
			this.health -= Fysics.TURN_ENERGY_COST;
		}
		if (action.equals(Action.TURN_RIGHT)) {
			facing.turnRight();
			
			this.health -= Fysics.TURN_ENERGY_COST;
		}
	
		
		
		
	}
}
