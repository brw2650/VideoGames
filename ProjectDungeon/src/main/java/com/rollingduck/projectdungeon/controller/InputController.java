package com.rollingduck.projectdungeon.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

import com.rollingduck.projectdungeon.audio.AudioHandler;

public class InputController {

	private static final Logger log = LogManager
			.getLogger(InputController.class);

	// TODO
	// FIXME
	// !!!
	public static void getInput(GameContainer container, AudioHandler audio) {
		Input input = container.getInput();
		if (input.isKeyDown(Input.KEY_UP)) {
			log.info("Up pressed");
			audio.onMoveSound();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (input.isKeyDown(Input.KEY_DOWN)) {
			log.info("Down pressed");
			audio.onMoveSound();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (input.isKeyDown(Input.KEY_LEFT)) {
			log.info("Left pressed");
			audio.onMoveSound();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
			log.info("Right pressed");
			audio.onMoveSound();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
