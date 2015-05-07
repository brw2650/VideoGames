package com.rollingduck.projectdungeon;

import java.util.logging.Logger;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.audio.AudioHandler;
import com.rollingduck.projectdungeon.controller.InputController;
import com.rollingduck.projectdungeon.entities.EntityManager;
import com.rollingduck.projectdungeon.ui.WindowHandler;
import com.rollingduck.projectdungeon.world.CurrentLevelHolder;

public class GameRunner extends BasicGame {

	CurrentLevelHolder holder;

	WindowHandler ui;

	AudioHandler audio;

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
		log.info("Starting entity store");
		EntityManager.getInstance();
		log.info("Game running.");
		holder = new CurrentLevelHolder();
		holder.setupWorld();
		holder.printWorld();

		ui = new WindowHandler(this);
		audio = new AudioHandler();
		ui.createWindow();
	}

	public void render(GameContainer container, Graphics graphics)
			throws SlickException {
		ui.renderWorld();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		ui.initWorld(holder);
		audio.setup();
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		InputController.getInput(container);

	}
}
