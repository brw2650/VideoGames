package com.rollingduck.projectdungeon.entities;

import com.rollingduck.projectdungeon.world.Coordinates;

public class Player extends Actor {

	public Player(Coordinates coordinates, int health) {
		super(coordinates, health);
	}

	public int getEntityId() {
		return this.entityID;
	}

}
