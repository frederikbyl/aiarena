package com.arena.model;

public class Bot {
	
	public boolean turned = false;
	public boolean shot = false;
	public boolean hit = false;
	public boolean moved = false;
	public boolean shooting = false;
	public boolean fullhit = false;
	
	
	public Bot(Brain brain) {
		super();
		this.brain = brain;
	}

	private Location location;
	private Facing facing = new Facing(); //left right up down
	private double health;
	private Brain brain = new Brain();

	public void initialize() {

		this.shooting = false;
	}
	
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
			//System.out.println("BEAST PROXIMITY DAMAGE");
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
			this.health -= Fysics.FRIEND_CLOSE_ENERGY_COST;
		}
		
	
		//doBotAction: move/shoot/turn
		Action action = brain.calculateNextAction(this, beast);
		
		if(action.equals(Action.SHOOT)) {
			this.health -= Fysics.SHOOT_ENERGY_COST;
			shot = true;
			shooting = true;
			hit = beast.shotAt(location, facing);
			if(hit) {
				fullhit = true;
				this.health = 1.0;
			}
				
		
		}
		if(action.equals(Action.MOVE_DOWN)) {
			location.moveDown();
			moved= true;
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if(action.equals(Action.MOVE_LEFT)) {
			location.moveLeft();
			moved= true;
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if(action.equals(Action.MOVE_RIGHT)) {
			location.moveRight();
			moved= true;
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if(action.equals(Action.MOVE_UP)) {
			location.moveUp();
			moved= true;
			this.health -= Fysics.MOVE_ENERGY_COST;
		}
		if (action.equals(Action.TURN_LEFT)) {
			facing.turnLeft();
			turned = true;
			this.health -= Fysics.TURN_ENERGY_COST;
		}
		if (action.equals(Action.TURN_RIGHT)) {
			facing.turnRight();
			turned = true;
			this.health -= Fysics.TURN_ENERGY_COST;
		}
		
	}
}
