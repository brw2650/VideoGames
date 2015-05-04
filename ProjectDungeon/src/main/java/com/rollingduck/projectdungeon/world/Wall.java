package com.rollingduck.projectdungeon.world;

public class Wall implements Tile {

	public Boolean isWalkThrough() {
		return false;
	}

	public String toMapString() {
		return "x";
	}
	
	

}
