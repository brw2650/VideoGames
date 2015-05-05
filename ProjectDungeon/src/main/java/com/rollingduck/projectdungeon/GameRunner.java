package com.rollingduck.projectdungeon;

import java.util.logging.Logger;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.controller.InputController;
import com.rollingduck.projectdungeon.ui.WindowHandler;
import com.rollingduck.projectdungeon.world.CurrentLevelHolder;

public class GameRunner extends BasicGame {

	Image background;

	public GameRunner(String title) {
		super(title);
	}

	private static final Logger log = Logger.getLogger(GameRunner.class
			.getName());

	public static void main(String[] args) {
		GameRunner runner = new GameRunner("ProjectDungeon");
		runner.run();
	}

	public void run() {
		log.info("Game running.");
		CurrentLevelHolder holder = new CurrentLevelHolder();
		holder.setupWorld();
		holder.printWorld();

		WindowHandler ui = new WindowHandler(this);
		ui.createWindow();
	}

	public void render(GameContainer container, Graphics graphics)
			throws SlickException {
		background.draw(0, 0);
		background.draw(200, 0);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		background = new Image("tiles/wall.png");
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		InputController.getInput(container);

	}
}
