package com.rollingduck.projectdungeon.ui;

import com.rollingduck.projectdungeon.entities.Entity;
import com.rollingduck.projectdungeon.world.Coordinates;

public interface UIEntity extends Entity {

	Coordinates getCoordinates();

}
