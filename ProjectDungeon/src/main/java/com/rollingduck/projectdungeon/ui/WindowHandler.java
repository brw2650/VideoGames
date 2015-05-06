package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.GameRunner;
import com.rollingduck.projectdungeon.constants.WorldConstants;
import com.rollingduck.projectdungeon.world.Background;
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

	//Called at game start 
	public void initWorld(CurrentLevelHolder holder) throws SlickException {
		Tile[][] world = holder.getWorld();
		uiWorld = new EntityImageHolder[WorldConstants.worldXSize][WorldConstants.worldYSize];

		for (int i = 0; i < WorldConstants.worldXSize; i++) {
			for (int j = 0; j < WorldConstants.worldYSize; j++) {
				if (j % 2 == 0) {
					uiWorld[i][j] = new EntityImageHolder<Tile>(world[i][j],
							"src/main/resources/Art Assets/Tiles/Environment/Hex red.png");
				} else {
					uiWorld[i][j] = new EntityImageHolder<Tile>(world[i][j],
							"src/main/resources/Art Assets/Tiles/Environment/Hex yellow.png");
				}
			}
		}

	}

	//Called each game loop 
	public void renderWorld() throws SlickException {
		
		//The devils code
		//Fix later
		Background b = new Background();
		EntityImageHolder<Background> eih = new EntityImageHolder<Background>(b,
				"src/main/resources/Art Assets/Backgrounds/Tile 1 - Mudbaron.png");
		eih.drawAsBackground();
		
		for (int i = 0; i < WorldConstants.worldXSize; i++) {
			for (int j = 0; j < WorldConstants.worldYSize; j++) {
				if (j % 2 == 0) {
					uiWorld[i][j].draw(false);
				} else {
					uiWorld[i][j].draw(true);
				}
			}
		}
	}
	
	

}
