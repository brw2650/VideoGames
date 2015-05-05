package com.rollingduck.projectdungeon.entities;

import com.rollingduck.projectdungeon.world.Coordinates;

public class Player extends Actor {

	public Player(Coordinates coordinates, int health) {
		super(coordinates, health);
		// TODO Auto-generated constructor stub
	}

	public int getEntityId() {
		return this.entityID;
	}

}
