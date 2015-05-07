package com.rollingduck.projectdungeon.world;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.rollingduck.projectdungeon.constants.WorldConstants;

public class WorldImporter {

	// TODO error if csv size doesn't match world
	public Tile[][] importWorldCsv(File csvFile) throws IOException {
		Tile[][] world = new Tile[WorldConstants.worldXSize][WorldConstants.worldYSize];
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		int i = 0;

		br = new BufferedReader(new FileReader(csvFile));

		while ((line = br.readLine()) != null) {
			// use comma as separator
			String[] tile = line.split(cvsSplitBy);

			for (int j = 0; j < tile.length; j++) {
				int tileType = Integer.parseInt(tile[j]);
				if (tileType == 0) {
					world[i][j] = new Floor(new Coordinates(i, j));
				} else {
					world[i][j] = new Wall(new Coordinates(i, j));
				}
			}
			i++;
		}

		br.close();

		for (i = 0; i < 4; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < 4; j++) {
				sb.append(world[i][j].toMapString());
			}
			System.out.println(sb.toString());
		}
		return world;
	}
}
