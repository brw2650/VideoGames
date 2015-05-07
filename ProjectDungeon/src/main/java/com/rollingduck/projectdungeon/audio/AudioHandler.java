package com.rollingduck.projectdungeon.audio;

import java.io.IOException;

import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.util.ResourceLoader;

import com.rollingduck.projectdungeon.util.NumberUtil;

public class AudioHandler {

	public void startBackgroundMusic() {
		try {
			Audio allStar = AudioLoader
					.getAudio("OGG", ResourceLoader
							.getResourceAsStream("Audio/01 All Star.ogg"));
			allStar.playAsMusic(1.0f, 1.0f, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onMoveSound() {
		Audio movementAudio;
		int number = NumberUtil.randInt(1, 2);
		try {
			if (number == 1) {
				movementAudio = AudioLoader
						.getAudio("OGG", ResourceLoader
								.getResourceAsStream("Audio/myswamp.ogg"));
			} else {
				movementAudio = AudioLoader
						.getAudio(
								"OGG",
								ResourceLoader
										.getResourceAsStream("Audio/Better Out Than In, I Always Say.OGG"));
			}
			movementAudio.playAsSoundEffect(1.0f, 1.0f, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
