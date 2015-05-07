package com.rollingduck.projectdungeon.audio;

import java.io.IOException;

import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.util.ResourceLoader;

public class AudioHandler {

	private Audio allStar;

	public void setup() {
		try {
			allStar = AudioLoader
					.getAudio("OGG", ResourceLoader
							.getResourceAsStream("Audio/01 All Star.ogg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		allStar.playAsMusic(1.0f, 1.0f, true);
	}
}
