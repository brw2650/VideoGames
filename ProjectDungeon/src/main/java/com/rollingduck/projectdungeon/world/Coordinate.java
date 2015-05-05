package com.rollingduck.projectdungeon.world;

import java.util.List;
import java.util.Set;

/**
 * Holds coordinates of entities on world map and a reference to the object at that coordinate
 * 
 * @author Ben
 * @param <T>
 *
 */
public class Coordinate {

	private int x;
	
	private int y;
	
	private Tile tile;
	
	// TODO should be entity interface
	private Set<Object> objectRefs;
	
	public Coordinate(int x, int y, Tile tile){
		this.x = x;
		this.y = y;
		this.tile = tile;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Tile getTile(){
		return tile;
	}

	public Set<Object> getObjectRefs() {
		return objectRefs;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}

	public void addObject(Object object) {
		objectRefs.add(object);
	}
	
	public void removeObject(Object object){
		if (objectRefs.contains(object)){
			objectRefs.remove(object);
		}
	}
	
}
