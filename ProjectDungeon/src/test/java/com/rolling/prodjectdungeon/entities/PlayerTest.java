package com.rolling.prodjectdungeon.entities;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import com.rollingduck.projectdungeon.constants.CharacterConstants;
import com.rollingduck.projectdungeon.entities.Player;
import com.rollingduck.projectdungeon.world.Coordinates;

public class PlayerTest {

	@Test
	public void testPlayer() {
		Player p = new Player(new Coordinates(1, 2), 3);
		assertTrue(p.getCoordinates().getX() == 1);
		assertTrue(p.getCoordinates().getY() == 2);
		assertTrue(p.getHealth() == 3);
	}

	@Test
	public void testMove() {
		Player p = new Player(new Coordinates(1, 1), 1);

		HashMap<String, Integer> movementMap = new HashMap<String, Integer>();
		movementMap.put(CharacterConstants.MOVEMENT_UP, 5);
		movementMap.put(CharacterConstants.MOVEMENT_RIGHT, 3);
		movementMap.put(CharacterConstants.MOVEMENT_DOWN, 1);
		movementMap.put(CharacterConstants.MOVEMENT_LEFT, 1);

		p.move(movementMap);
		assertTrue(p.getCoordinates().getX() == 3);
		assertTrue(p.getCoordinates().getY() == 5);
	}

}
