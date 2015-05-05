package com.rollingduck.projectdungeon.entities;

public class Player extends Actor {

	public Player(int xPosition, int yPosition, int health) {
		super(xPosition, yPosition, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getEntityId() {
		return this.entityID;
	}
	

}
