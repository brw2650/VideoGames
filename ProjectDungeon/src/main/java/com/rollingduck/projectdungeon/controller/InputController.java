package com.rollingduck.projectdungeon.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

import com.rollingduck.projectdungeon.audio.AudioHandler;
import com.rollingduck.projectdungeon.world.CurrentLevelHolder;

public class InputController {

	private static final Logger log = LogManager
			.getLogger(InputController.class);

	// TODO check movement is possible TurnRunner class?
	public static void getInput(GameContainer container, AudioHandler audio,
			CurrentLevelHolder holder) {
		Input input = container.getInput();
		if (input.isKeyDown(Input.KEY_UP)) {
			log.info("Up pressed");
			holder.getPlayer().moveUp();
			// audio.onMoveSound();
			turnEnd();
		} else if (input.isKeyDown(Input.KEY_DOWN)) {
			log.info("Down pressed");
			holder.getPlayer().moveDown();
			// audio.onMoveSound();
			turnEnd();
		} else if (input.isKeyDown(Input.KEY_LEFT)) {
			log.info("Left pressed");
			holder.getPlayer().moveLeft();
			// audio.onMoveSound();
			turnEnd();
		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
			log.info("Right pressed");
			holder.getPlayer().moveRight();
			// audio.onMoveSound();
			turnEnd();
		}
	}

	// TODO move to TurnRunner class
	private static void turnEnd() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
