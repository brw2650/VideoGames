package com.rollingduck.ProjectDungeon;

import java.util.logging.Logger;

public class GameRunner {
	
	private static final Logger log = Logger.getLogger(GameRunner.class.getName());
	
    public static void main( String[] args )
    {
        GameRunner runner = new GameRunner();
        runner.run();
    }
    
    public void run(){
    	log.info("Game running.");
    }
}
