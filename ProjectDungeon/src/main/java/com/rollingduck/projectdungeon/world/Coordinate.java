package com.rollingduck.projectdungeon.world;

/**
 * Holds coordinates of entities on world map and a reference to the object at that coordinate
 * 
 * @author Ben
 * @param <T>
 *
 */
public class Coordinate<T> {

	private int x;
	
	private int y;
	
	//TODO coordinates should have a list of objects at that position + the tile?
	private T object;
	
	public Coordinate(int x, int y, T object){
		this.x = x;
		this.y = y;
		this.object = object;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public T getObject() {
		return object;
	}
	
	
}
