package com.rollingduck.projectdungeon.world;

public class Floor extends Tile {

	Floor(Coordinates coordinate) {
		super(coordinate);
	}

	public Boolean isWalkThrough() {
		return true;
	}

	public String toMapString() {
		return "o";
	}

}
