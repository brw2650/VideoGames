package com.rollingduck.projectdungeon.util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//Shamelessly taken from the good folks at java-gaming.org
public class SpriteSheetReader {

	BufferedImage spriteSheet = ImageIO.read(new File("src/spriteSheet.png"));

	int width;
	int height;
	int rows;
	int columns;
	BufferedImage[] sprites;

	public SpriteSheetReader(int width, int height, int rows, int columns)
			throws IOException {
		this.width = width;
		this.height = height;
		this.rows = rows;
		this.columns = columns;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sprites[(i * columns) + j] = spriteSheet.getSubimage(i * width,
						j * height, width, height);
			}
		}
	}

	public void paint(Graphics g) {
		// g.drawImage(sprites[1], 100, 100, null);
	}

}
