package com.rollingduck.projectdungeon.ui;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import com.rollingduck.projectdungeon.constants.WorldConstants;

public class WindowHandler {
//Need -Djava.library.path=target/natives as a vm argument
	
	public void createWindow(){
		//TODO move window sizes to constants
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Project Dungeon");
			Display.setInitialBackground(0.6f, 0.1f, 0.2f);
			Display.create();
			
			while (!Display.isCloseRequested()){
				Display.update();
				Display.sync(WorldConstants.targetFPS);
			}
			Display.destroy();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	
	public void displayBackgroud(){
		
		
	}
}
