package com.rollingduck.projectdungeon.entities;

import java.util.HashMap;

import com.rollingduck.projectdungeon.constants.CharacterConstants;
import com.rollingduck.projectdungeon.world.Coordinates;

public abstract class Actor implements Entity {

	public Actor(Coordinates coordinates, int health) {
		super();
		this.coordinates = coordinates;
		this.health = health;

		// TODO: Check list of currently existing entities, get next available
		// ID.
		this.entityID = 1;
	}

	public Coordinates coordinates;
	public int health = -1;
	public int entityID = -1;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Actor move(HashMap<String, Integer> movementMap) {
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_RIGHT)) {
			coordinates.setX(coordinates.getX()
					+ movementMap.get(CharacterConstants.MOVEMENT_RIGHT));
		}
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_LEFT)) {
			coordinates.setX(coordinates.getX()
					- movementMap.get(CharacterConstants.MOVEMENT_LEFT));
		}
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_UP)) {
			coordinates.setY(coordinates.getY()
					+ movementMap.get(CharacterConstants.MOVEMENT_UP));
		}
		if (movementMap.containsKey(CharacterConstants.MOVEMENT_DOWN)) {
			coordinates.setY(coordinates.getY()
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
