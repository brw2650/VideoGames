package com.rollingduck.projectdungeon.world;

import java.util.Set;

public abstract class Tile {

	private Coordinates coordinates;

	private Set<Integer> entityRefs;

	abstract Boolean isWalkThrough();

	abstract String toMapString();

	Tile(Coordinates coordinates) {
		this.coordinates = coordinates;
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

}
