package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.GameRunner;
import com.rollingduck.projectdungeon.constants.WorldConstants;
import com.rollingduck.projectdungeon.world.CurrentLevelHolder;
import com.rollingduck.projectdungeon.world.Tile;

public class WindowHandler {
	// Need -Djava.library.path=target/natives as a vm argument

	private GameRunner runner;

	EntityImageHolder<Tile>[][] uiWorld;

	public WindowHandler(GameRunner runner) {
		this.runner = runner;
	}

	public void createWindow() {
		try {
			AppGameContainer game = new AppGameContainer(runner);
			game.setMaximumLogicUpdateInterval(60);
			// TODO move to constants
			game.setDisplayMode(600, 800, false);
			game.setTargetFrameRate(60);
			game.setAlwaysRender(true);
			game.setVSync(true);
			game.setShowFPS(true);
			game.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void initWorld(CurrentLevelHolder holder) throws SlickException {
		Tile[][] world = holder.getWorld();
		uiWorld = new EntityImageHolder[WorldConstants.worldXSize][WorldConstants.worldXSize];

		for (int i = 0; i < WorldConstants.worldXSize; i++) {
			for (int j = 0; j < WorldConstants.worldYSize; j++) {
				if (j % 2 == 0) {
					uiWorld[i][j] = new EntityImageHolder<Tile>(world[i][j],
							"tiles/wall-1.png");
				} else {
					uiWorld[i][j] = new EntityImageHolder<Tile>(world[i][j],
							"tiles/wall-2.png");
				}
			}
		}

	}

	public void renderWorld() {

		for (int i = 0; i < WorldConstants.worldXSize; i++) {
			for (int j = 0; j < WorldConstants.worldYSize; j++) {
				if (i == 0 % 2) {
					uiWorld[i][j].draw(false);
				} else {
					uiWorld[i][j].draw(true);
				}
			}
		}
	}

}
