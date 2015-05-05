package com.rollingduck.projectdungeon.world;

public class Wall extends Tile {

	Wall(Coordinates coordinate) {
		super(coordinate);
	}

	public Boolean isWalkThrough() {
		return false;
	}

	public String toMapString() {
		return "x";
	}

}
