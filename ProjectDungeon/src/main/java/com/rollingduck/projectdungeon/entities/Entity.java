package com.rollingduck.projectdungeon.entities;

import com.rollingduck.projectdungeon.world.Coordinates;

public interface Entity {
	int getEntityId();

	// TODO move into UIEntity?
	Coordinates getCoordinates();

}
