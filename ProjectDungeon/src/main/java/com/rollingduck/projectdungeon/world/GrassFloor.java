package com.rollingduck.projectdungeon.world;

public class GrassFloor implements Tile {

	public Boolean isWalkThrough() {
		return true;
	}

	public String toMapString() {
		return "o";
	}

}
