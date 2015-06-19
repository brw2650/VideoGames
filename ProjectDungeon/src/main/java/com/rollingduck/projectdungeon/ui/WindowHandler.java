package com.rollingduck.projectdungeon.ui;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.GameRunner;
import com.rollingduck.projectdungeon.constants.WorldConstants;
import com.rollingduck.projectdungeon.entities.NPC;
import com.rollingduck.projectdungeon.entities.Player;
import com.rollingduck.projectdungeon.world.Background;
import com.rollingduck.projectdungeon.world.CurrentLevelHolder;
import com.rollingduck.projectdungeon.world.Tile;

public class WindowHandler {
	// Need -Djava.library.path=target/natives as a vm argument

	private GameRunner runner;
	private AppGameContainer game;

	EntityImageHolder<Tile>[][] uiWorld;
	EntityImageHolder<Player> player;
	EntityImageHolder<NPC> enemy;

	public WindowHandler(GameRunner runner) {
		this.runner = runner;
	}

	public void createWindow() {
		try {
			game = new AppGameContainer(runner);
			game.setMaximumLogicUpdateInterval(60);
			game.setDisplayMode(WorldConstants.windowXSize,
					WorldConstants.windowYSize, false);
			game.setTargetFrameRate(60);
			game.setAlwaysRender(true);
			game.setVSync(true);
			game.setShowFPS(true);
			Display.setResizable(true);
			game.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	// Called at game start
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
		// TODO Move to entity drawing class?
		player = new EntityImageHolder<Player>(holder.getPlayer(),
				"src/main/resources/Art Assets/Tiles/NPCs/Duck L1.png");

		// TODO Move somewhere sensible
		enemy = new EntityImageHolder<NPC>(holder.getEnemy(),
				"src/main/resources/Art Assets/Tiles/NPCs/Snake L1.png");

	}

	// Called each game loop
	public void renderWorld() throws SlickException {

		WorldConstants.tileWidth = (game.getWidth() / WorldConstants.windowXSize)
				* WorldConstants.tileWidth;
		WorldConstants.windowXSize = game.getWidth();

		WorldConstants.tileHeight = (game.getHeight() / WorldConstants.windowYSize)
				* WorldConstants.tileHeight;
		WorldConstants.windowYSize = game.getHeight();

		if (Display.getWidth() != game.getWidth()
				|| Display.getHeight() != game.getHeight()) {
			try {
				game.setDisplayMode(Display.getWidth(), Display.getHeight(),
						false);
				game.reinit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// The devils code
		// Fix later
		Background b = new Background();
		EntityImageHolder<Background> eih = new EntityImageHolder<Background>(
				b,
				"src/main/resources/Art Assets/Backgrounds/Tile 1 - Mudbaron.png");
		eih.drawAsBackground();

		for (int x = 0; x < WorldConstants.worldXSize; x++) {
			for (int y = 0; y < WorldConstants.worldYSize; y++) {
				if (y % 2 == 0) {
					uiWorld[x][y].draw();
				} else {
					uiWorld[x][y].draw();
				}
			}
		}

		ImageGetter.getImageForDirection(player);
		player.draw();
		enemy.draw();
	}

}
