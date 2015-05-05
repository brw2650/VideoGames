package com.rollingduck.projectdungeon;

import java.util.HashMap;
import java.util.logging.Logger;

import com.rollingduck.projectdungeon.constants.CharacterConstants;
import com.rollingduck.projectdungeon.entities.Entity;
import com.rollingduck.projectdungeon.entities.EntityManager;
import com.rollingduck.projectdungeon.entities.Player;
import com.rollingduck.projectdungeon.ui.WindowHandler;
import com.rollingduck.projectdungeon.world.CurrentLevelHolder;

public class GameRunner {
	
	private static final Logger log = Logger.getLogger(GameRunner.class.getName());
	
    public static void main( String[] args )
    {
        GameRunner runner = new GameRunner();
        runner.run();
    }
    
    public void run(){
    	log.info("Game running.");
    	CurrentLevelHolder holder = new CurrentLevelHolder();
    	holder.setupWorld();
    	holder.printWorld();
    	
    	WindowHandler ui = new WindowHandler();
    	ui.createWindow();
    }
}
