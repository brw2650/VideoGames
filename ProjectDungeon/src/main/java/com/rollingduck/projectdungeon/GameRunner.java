package com.rollingduck.projectdungeon;

import java.util.logging.Logger;

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
    }
}
