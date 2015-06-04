package com.rollingduck.projectdungeon.world;

import java.util.Set;

import com.rollingduck.projectdungeon.entities.Entity;
import com.rollingduck.projectdungeon.entities.EntityManager;

// TODO theres probably a better way of doing different tile types, I think it should be an enum. Too much repeated code currently.
public abstract class Tile implements Entity {

	private Coordinates coordinates;

	private Set<Integer> entityRefs;

	private int entityId;

	abstract Boolean isWalkThrough();

	abstract String toMapString();

	Tile(Coordinates coordinates) {
		this.coordinates = coordinates;
		this.entityId = EntityManager.getNextId();
	}

	public Set<Integer> getEntityRefs() {
		return entityRefs;
	}

	public void addEntityRef(Integer entityRef) {
		entityRefs.add(entityRef);
	}

	public void removeEntityRef(Integer entityRef) {
		if (entityRefs.contains(entityRef)) {
			entityRefs.remove(entityRef);
		}
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public int getEntityId() {
		return entityId;
	}

	public String toString() {
		return "Tile at: " + coordinates.getX() + "," + coordinates.getY();

	}

}
