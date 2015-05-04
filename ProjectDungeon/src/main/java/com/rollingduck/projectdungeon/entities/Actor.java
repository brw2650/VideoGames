package com.rollingduck.projectdungeon.entities;

import java.util.HashMap;

import com.rollingduck.projectdungeon.constants.CharacterConstants;

public abstract class Actor {

	public Actor(int xPosition, int yPosition, int health) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.health = health;

		// TODO: Check list of currently existing entities, get next available
		// ID.
		this.entityID = 1;
	}

	public int xPosition = -1;
	public int yPosition = -1;
	public int health = -1;
	public int entityID = -1;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public Actor move(HashMap<String, Integer> movementMap) {
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_RIGHT)) {
			this.setxPosition(this.getxPosition()
					+ movementMap.get(CharacterConstants.MOVEMENT_RIGHT));
		}
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_LEFT)) {
			this.setxPosition(this.getxPosition()
					- movementMap.get(CharacterConstants.MOVEMENT_LEFT));
		}
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_UP)) {
			this.setyPosition(this.getyPosition()
					+ movementMap.get(CharacterConstants.MOVEMENT_UP));
		}
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_DOWN)) {
			this.setyPosition(this.getyPosition()
					- movementMap.get(CharacterConstants.MOVEMENT_DOWN));
		}

		// Return the Actor so we can then investiage where its moved to, if
		// need be
		return this;
	}

	public int live() {

		// TODO: Should return ID of created entity
		return 0;

	}

	public int kill(int entityID) {

		// TODO: Return ID of all removed entities as a result of kill
		return 0;
	}

}
