package com.arena.model;

public class Bot {
	
	public boolean turned = false;
	public boolean shot = false;
	public boolean hit = false;
	public boolean moved = false;
	public boolean shooting = false;
	public boolean fullhit = false;
	private double performance = 0.0;
	private boolean bestFiringPosition = false;
	private boolean firingPosition  = false;
	
	public Bot(Brain brain) {
		super();
		this.brain = brain;
	}

	private Location location;
	private Facing facing = new Facing(); //left right up down
	private double health = 1.0;
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
		this.shooting = false;
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
		if(action.equals(Action.MOVE)) {
			location.move(this.facing.direction);
			location.move(this.facing.direction);
			location.move(this.facing.direction);
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
	
	
	public void react(Beast beast) {
		this.shooting = false;
		//standard energy cost:
		this.health -= Fysics.STANDARD_ENERGY_COST;
		
		//if distance beast1 <-> bot < 10
		if(Location.calculateDistance(beast, this) < Fysics.CRITICAL_DISTANCE ) {
			//System.out.println("BEAST PROXIMITY DAMAGE");
			this.health -= Fysics.BEAST_CLOSE_ENERGY_COST;
		}
		
		if(health <= 0.0) {
			return;
		}
		//doBotAction: move/shoot/turn
		Action action = brain.calculateNextAction(this, beast);
		performance-=10;
		if(action.equals(Action.SHOOT)) {
			
			
			this.health -= Fysics.SHOOT_ENERGY_COST;
			shot = true;
			shooting = true;
			hit = beast.shotAt(location, facing);
			if(hit && bestFiringPosition(beast)) {
				brain.learn(this, beast, Action.SHOOT);
				
				performance+=50;
				fullhit = true;
				this.health = 1.0;
			} else {
				performance -=50;
				//brain.learn(this, beast, Action.TURN_LEFT);
			}
				
		
		}
		if(action.equals(Action.MOVE)) {
			double origDistance = Location.calculateDistance(beast, this);
			
					
			if(!bestFiringPosition(beast)) {
				bestFiringPosition = false;
			}
			location.move(this.facing.direction);
			location.move(this.facing.direction);
			location.move(this.facing.direction);
			moved= true;
			
			this.health -= Fysics.MOVE_ENERGY_COST;
			
			if(!bestFiringPosition && bestFiringPosition(beast)) {
				bestFiringPosition = true;
				performance += 50;
				brain.learn(this, beast, Action.MOVE);
				this.health=1.0;
			}
			if(bestFiringPosition && !bestFiringPosition(beast)) {
				bestFiringPosition = false;
				//brain.learn(this, beast, Action.SHOOT);
				performance -=50;
			}
			
			if(origDistance <70.0 && origDistance < Location.calculateDistance(beast, this) && !hasFiringPosition(beast)) {
				performance+=50;
				brain.learn(this, beast, Action.MOVE);
			}
			
			if(origDistance <70.0 && origDistance > Location.calculateDistance(beast, this)) {
				performance-=50;
				brain.learn(this, beast, Action.TURN_LEFT);
			}
		}
		if (action.equals(Action.TURN_LEFT)) {
			
			if(!hasFiringPosition(beast)) {
				firingPosition = false;
			} else  {
				firingPosition = true;
			}
			
			facing.turnLeft();
			turned = true;
			this.health -= Fysics.TURN_ENERGY_COST;
			if(hasFiringPosition(beast) && !firingPosition) {
				performance+=50;
				firingPosition = true;
				this.health = 1.0;
				//brain.learn(this, beast, Action.TURN_LEFT);
			}
			if(!hasFiringPosition(beast) && firingPosition) {
				firingPosition = false;
				performance-=50;
				brain.learn(this, beast, Action.SHOOT);
			}
			
		}
		if (action.equals(Action.TURN_RIGHT)) {
			
			if(!hasFiringPosition(beast)) {
				firingPosition = false;
			} else  {
				firingPosition = true;
			}
			facing.turnRight();
			turned = true;
			this.health -= Fysics.TURN_ENERGY_COST;
			if(hasFiringPosition(beast) && !firingPosition) {
				performance+=50;
				//brain.learn(this, beast, Action.TURN_RIGHT);
				firingPosition = true;
				this.health = 1.0;
			}
			if(!hasFiringPosition(beast) && firingPosition) {
				firingPosition = false;
				performance-=50;
				brain.learn(this, beast, Action.SHOOT);
			}
		}
		
		
		// do the learning
		
		//if getting to close -> move
		if(Location.calculateDistance(beast, this) <70.0) {
			//if has firing position -> turn left
			if(hasFiringPosition(beast)) {
				brain.learn(this, beast, Action.TURN_LEFT);
				brain.learn(this, beast, Action.TURN_LEFT);
				brain.learn(this, beast, Action.TURN_LEFT);
			} else {
				brain.learn(this, beast, Action.MOVE);
				brain.learn(this, beast, Action.MOVE);
				brain.learn(this, beast, Action.MOVE);
				brain.learn(this, beast, Action.MOVE);
				brain.learn(this, beast, Action.MOVE);
				brain.learn(this, beast, Action.MOVE);
			}
			//if not firing position -> move
		}
			
		
		//if firing position -> fire
		if(hasFiringPosition(beast) && bestFiringPosition(beast)) {
			brain.learn(this, beast, Action.SHOOT);
		}
		
		//if not firing position 
		if(!hasFiringPosition(beast)) {
			//if not to close -> turn left
			if(Location.calculateDistance(beast, this)>70.0) {
				brain.learn(this, beast, Action.TURN_LEFT);
			}
		}
			
		
		
	}

	private boolean bestFiringPosition(Beast beast) {
		if(Location.calculateDistance(beast, this) >70.0 ) {
			return true;
		}
		return false;
	}
	


	private boolean hasFiringPosition(Beast beast) {
		return beast.shotAt(this.location, this.facing);
		
	}

	public double getPerformance() {

		return performance;
	}
}
