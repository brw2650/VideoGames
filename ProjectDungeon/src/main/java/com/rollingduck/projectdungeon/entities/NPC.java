package com.rollingduck.projectdungeon.entities;

import com.rollingduck.projectdungeon.world.Coordinates;

public class NPC extends Actor {

	public NPC(Coordinates coordinates, int health) {
		super(coordinates, health);
	}

	public int getEntityId() {
		return this.entityID;
	}

}
