package com.rollingduck.projectdungeon.world;

import com.rollingduck.projectdungeon.constants.WorldConstants;

public class CurrentLevelHolder {

	private Coordinate[][] world = new Coordinate[WorldConstants.worldx][WorldConstants.worldy];
	
	public void printWorld(){
		for (int i=0; i< WorldConstants.worldx; i++ ){
			StringBuilder sb = new StringBuilder();
			for (int j=0; j< WorldConstants.worldy; j++ ){
				sb.append(world[i][j].getTile().toMapString());
			}
			System.out.println(sb.toString());
		}
	}

	public void setupWorld(){
		for (int i=0; i< WorldConstants.worldx; i++ ){
			for (int j=0; j< WorldConstants.worldy; j++ ){
				if (i==0 || j==0 || i==WorldConstants.worldx-1 || j==WorldConstants.worldy-1){
					world[i][j] = new Coordinate(i, j, new Wall());
				} else {
					world[i][j] = new Coordinate(i, j, new GrassFloor());
				}
			}
		}
	}
}
