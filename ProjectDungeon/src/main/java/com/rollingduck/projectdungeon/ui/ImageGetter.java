package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.entities.Player;

public class ImageGetter {

	// TODO get image by class + direction + rand number (upto amount of images
	// for that direction). Make generic.
	// How fast is changing image? would it be better to load + store all images
	// in the Entity image holder?
	public static void getImageForDirection(EntityImageHolder<Player> player)
			throws SlickException {
		String className = player.getClass().getSimpleName();

		switch (((Player) player.getEntity()).getDirection()) {
		case L:
			player.updateImage("src/main/resources/Art Assets/Tiles/NPCs/Duck L1.png");
			break;
		case R:
			player.updateImage("src/main/resources/Art Assets/Tiles/NPCs/Duck R1.png");
			break;
		case BR:
			player.updateImage("src/main/resources/Art Assets/Tiles/NPCs/Duck BR1.png");
			break;
		case BL:
			player.updateImage("src/main/resources/Art Assets/Tiles/NPCs/Duck BL1.png");
			break;
		case TL:
			player.updateImage("src/main/resources/Art Assets/Tiles/NPCs/Duck TL1.png");
			break;
		case TR:
			player.updateImage("src/main/resources/Art Assets/Tiles/NPCs/Duck TR1.png");
			break;
		}
	}

	// TODO get tile image, should be give the tile type (enum?) and return an
	// entityImageHolder containing an instance of tile with correct image +
	// properties.

}
