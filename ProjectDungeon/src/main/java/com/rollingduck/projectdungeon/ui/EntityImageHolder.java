package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.constants.WorldConstants;

public class EntityImageHolder<T extends UIEntity> {

	private Image image;

	private T entity;

	public EntityImageHolder(T entity, String imagePath) throws SlickException {
		image = new Image(imagePath);
		this.entity = entity;
	}

	public void updateImage(String imagePath) throws SlickException {
		image = new Image(imagePath);
	}

	public void draw() {
		float x = entity.getCoordinates().getX() * WorldConstants.tileWidth;
		float y = entity.getCoordinates().getY() * WorldConstants.tileHeight;
		if (entity.getCoordinates().getY() % 2 != 0.0) {
			x += WorldConstants.tileWidth / 2;
		}
		image.draw(x, y);
	}

	public void drawAsBackground() {
		image.draw(0, 0, WorldConstants.windowXSize, WorldConstants.windowYSize);
	}

	public T getEntity() {
		return entity;
	}

}
