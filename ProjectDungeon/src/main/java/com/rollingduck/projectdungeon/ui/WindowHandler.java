package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.GameRunner;

public class WindowHandler {
	// Need -Djava.library.path=target/natives as a vm argument

	private GameRunner runner;

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
}
