package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.GameRunner;

public class WindowHandler {
	// Need -Djava.library.path=target/natives as a vm argument

	private static final int WINDOW_HEIGHT = 600;
	private static final int WINDOW_WIDTH = 800;

	private GameRunner runner;

	public WindowHandler(GameRunner runner) {
		this.runner = runner;
	}

	public void createWindow() {
		try {
			AppGameContainer game = new AppGameContainer(runner);
			game.setMaximumLogicUpdateInterval(60);
			game.setDisplayMode(800, 800, false);
			game.setTargetFrameRate(60);
			game.setAlwaysRender(true);
			game.setVSync(true);
			game.setShowFPS(false);
			game.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
