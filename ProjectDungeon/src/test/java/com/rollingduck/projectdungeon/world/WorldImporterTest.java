package com.rollingduck.projectdungeon.world;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Test;

import com.rollingduck.projectdungeon.BaseTest;

public class WorldImporterTest extends BaseTest {

	@Test
	public void testImportWorldCsv() throws IOException, URISyntaxException {
		File csvFile = new File(WorldImporterTest.class.getResource(
				"/testWorld.csv").toURI());
		Tile[][] world = WorldImporter.importWorldCsv(csvFile);
		assertEquals(Floor.class, world[1][1].getClass());
	}
}
