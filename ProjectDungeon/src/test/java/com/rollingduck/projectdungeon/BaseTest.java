package com.rollingduck.projectdungeon;

import org.junit.Before;

import com.rollingduck.projectdungeon.entities.EntityManager;

public class BaseTest {

	@Before
	public void setup() {
		EntityManager.getInstance();
	}

}
