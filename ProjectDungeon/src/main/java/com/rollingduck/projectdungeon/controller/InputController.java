package com.rollingduck.projectdungeon.controller;

import java.util.logging.Logger;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

import com.rollingduck.projectdungeon.GameRunner;

public class InputController {

	private static final Logger log = Logger.getLogger(GameRunner.class
			.getName());

	public static void getInput(GameContainer container) {
		Input input = container.getInput();
		if (input.isKeyDown(Input.KEY_UP)) {
			log.info("Up pressed");
		} else if (input.isKeyDown(Input.KEY_DOWN)) {
			log.info("Down pressed");
		} else if (input.isKeyDown(Input.KEY_LEFT)) {
			log.info("Left pressed");
		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
			log.info("Right pressed");
		}
	}
}
