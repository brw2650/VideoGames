package com.rollingduck.projectdungeon.world;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Logger;

import com.rollingduck.projectdungeon.GameRunner;
import com.rollingduck.projectdungeon.constants.WorldConstants;

public class CurrentLevelHolder {

	int tileSize = 200;

	private Tile[][] world = new Tile[WorldConstants.worldXSize][WorldConstants.worldYSize];

	private static final Logger log = Logger.getLogger(GameRunner.class
			.getName());

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
		try {
			File csvFile = new File(CurrentLevelHolder.class.getResource(
					"/WorldCSV/modelWorld.csv").toURI());
			world = WorldImporter.importWorldCsv(csvFile);
		} catch (IOException e) {
			log.info("Failed to import CSV.");
		} catch (URISyntaxException e) {
			log.info("Couldn't parse file location.");
		}
	}

	public Tile[][] getWorld() {
		return world;
	}
}
