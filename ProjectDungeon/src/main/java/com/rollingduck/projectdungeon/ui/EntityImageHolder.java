package com.rollingduck.projectdungeon.ui;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.rollingduck.projectdungeon.constants.WorldConstants;
import com.rollingduck.projectdungeon.entities.Entity;

public class EntityImageHolder<T extends Entity> extends Image {

	private T entity;

	public EntityImageHolder(T entity, String imagePath) throws SlickException {
		super(imagePath);
		this.entity = entity;
	}

	@Override
	public void draw() {
		float x = entity.getCoordinates().getX() * WorldConstants.tileWidth;
		float y = entity.getCoordinates().getY() * WorldConstants.tileHeight;
		if (entity.getCoordinates().getY() % 2 != 0.0) {
			x += WorldConstants.tileWidth / 2;
		}
		super.draw(x, y);
	}

	public void drawAsBackground() {
		super.draw(0, 0, WorldConstants.windowXSize, WorldConstants.windowYSize);
	}

}
