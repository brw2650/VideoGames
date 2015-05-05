package com.rollingduck.projectdungeon.entities;

import java.util.HashMap;

public class EntityManager {
	private static EntityManager instance = null;

	private HashMap<Integer, Entity> entityMap = new HashMap<Integer, Entity>();

	protected EntityManager() {

	}

	public static EntityManager getInstance() {
		if (instance == null) {
			instance = new EntityManager();
		}
		return instance;
	}

	public static int addEntity(Entity inputEntity) {
		instance.entityMap.put(inputEntity.getEntityId(), inputEntity);
		return inputEntity.getEntityId();
	}

	public static void removeEntity(int entityId) {
		instance.entityMap.remove(entityId);
	}

	public static Entity getEntityById(int entityId) {
		return (instance.entityMap.get(entityId));
	}

}
