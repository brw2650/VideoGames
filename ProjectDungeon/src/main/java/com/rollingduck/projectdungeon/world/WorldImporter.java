package com.rollingduck.projectdungeon.world;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.rollingduck.projectdungeon.constants.WorldConstants;

public class WorldImporter {

	// TODO error if csv size doesn't match world
	public static Tile[][] importWorldCsv(File csvFile) throws IOException {
		Tile[][] world = new Tile[WorldConstants.worldXSize][WorldConstants.worldYSize];
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		int y = 0;

		br = new BufferedReader(new FileReader(csvFile));

		while ((line = br.readLine()) != null) {
			// use comma as separator
			String[] tile = line.split(cvsSplitBy);

			for (int x = 0; x < tile.length; x++) {
				int tileType = Integer.parseInt(tile[x]);
				// TODO add more tileTypes, maybe a better way of handling this.
				if (tileType == 0) {
					world[x][y] = new Floor(new Coordinates(x, y));
				} else {
					world[x][y] = new Wall(new Coordinates(x, y));
				}
			}
			y++;
		}

		br.close();
		return world;
	}
}
