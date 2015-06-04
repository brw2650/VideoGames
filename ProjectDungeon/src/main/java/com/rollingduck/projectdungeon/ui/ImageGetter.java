package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.entities.Player;

public class ImageGetter {

	// TODO get image by class + direction + rand number (upto amount of images
	// for that direction). Make generic
	public static void getImageForDirection(EntityImageHolder<Player> player)
			throws SlickException {
		String className = player.getClass().getSimpleName();

		switch (((Player) player.getEntity()).getDirection()) {
		case L:
			player.updateImage("src/main/resources/Art Assets/Tiles/Player character/Player L1.png");
			break;
		case R:
			player.updateImage("src/main/resources/Art Assets/Tiles/Player character/Player R1.png");
			break;
		case BR:
			player.updateImage("src/main/resources/Art Assets/Tiles/Player character/Player BR1.png");
			break;
		case BL:
			player.updateImage("src/main/resources/Art Assets/Tiles/Player character/Player BL1.png");
			break;
		case TL:
			player.updateImage("src/main/resources/Art Assets/Tiles/Player character/Player TL1.png");
			break;
		case TR:
			player.updateImage("src/main/resources/Art Assets/Tiles/Player character/Player TR1.png");
			break;
		}
	}

}
