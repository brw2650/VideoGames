package com.rollingduck.projectdungeon.world;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rollingduck.projectdungeon.constants.WorldConstants;
import com.rollingduck.projectdungeon.controller.InputController;
import com.rollingduck.projectdungeon.entities.NPC;
import com.rollingduck.projectdungeon.entities.Player;

public class CurrentLevelHolder {

	int tileSize = 200;

	private Tile[][] world = new Tile[WorldConstants.worldXSize][WorldConstants.worldYSize];

	private Player player;

	// TODO list of enemies? Class to spawn them randomly?
	private NPC enemy;

	private static final Logger log = LogManager
			.getLogger(InputController.class);

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

			player = new Player(new Coordinates(1, 1), 10);
			enemy = new NPC(new Coordinates(2, 2), 20);
		} catch (IOException e) {
			log.error("Failed to import CSV.");
		} catch (URISyntaxException e) {
			log.error("Couldn't parse file location.");
		}
	}

	public Tile[][] getWorld() {
		return world;
	}

	public Player getPlayer() {
		return player;
	}

	public NPC getEnemy() {
		return enemy;
	}

}
