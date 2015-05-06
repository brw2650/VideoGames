package com.rollingduck.projectdungeon.world;

import com.rollingduck.projectdungeon.constants.WorldConstants;

public class CurrentLevelHolder {

	int tileSize = 200;

	private Tile[][] world = new Tile[WorldConstants.worldXSize][WorldConstants.worldYSize];

	public void printWorld() {
		for (int i = 0; i < WorldConstants.worldXSize; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < WorldConstants.worldYSize; j++) {
				sb.append(world[i][j].toMapString());
			}
			System.out.println(sb.toString());
		}
	}

	public void setupWorld() {
		for (int i = 0; i < WorldConstants.worldXSize; i++) {
			for (int j = 0; j < WorldConstants.worldYSize; j++) {
				if (i == 0 || j == 0 || i == WorldConstants.worldXSize - 1
						|| j == WorldConstants.worldYSize - 1) {
					world[i][j] = new Wall(new Coordinates(i, j));
				} else {
					world[i][j] = new Floor(new Coordinates(i, j));
				}
			}
		}
	}

	public Tile[][] getWorld() {
		return world;
	}
}
