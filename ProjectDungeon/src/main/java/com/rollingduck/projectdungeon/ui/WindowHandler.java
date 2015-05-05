package com.rollingduck.projectdungeon.ui;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class WindowHandler {
//Need -Djava.library.path=target/natives as a vm argument
	
	public void createWindow(){
		//TODO move window sizes to constants
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("ProjectDungeon");
			Display.create();
			while (!Display.isCloseRequested()){
				Display.update();
				//TODO move fps to constants
				Display.sync(60);
			}
			Display.destroy();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayBackgroud(){
		
	}
}
