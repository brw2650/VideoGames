package com.rollingduck.projectdungeon.entities;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glTexCoord2f;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.glVertex2f;

import com.rollingduck.projectdungeon.ui.UIAsset;
import com.rollingduck.projectdungeon.world.Coordinate;

public abstract class Entity {

	private UIAsset asset;

	public abstract int getEntityId();

	public void draw(Coordinate coordinates) {
		glPushMatrix();

		asset.bind();

		glTranslatef(coordinates.getX(), coordinates.getY(), 0);

		glBegin(GL_QUADS);
		{
			glTexCoord2f(0, 0);
			glVertex2f(0, 0);

			glTexCoord2f(0, asset.getHeight());
			glVertex2f(0, asset.getHeight());

			glTexCoord2f(asset.getWidth(), asset.getHeight());
			glVertex2f(asset.getWidth(), asset.getHeight());

			glTexCoord2f(asset.getWidth(), 0);
			glVertex2f(asset.getWidth(), 0);
		}
		glEnd();

		// restore the model view matrix to prevent contamination
		glPopMatrix();
	}

}
