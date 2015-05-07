package com.rollingduck.projectdungeon.world;

import java.io.IOException;

import org.junit.Test;

import com.rollingduck.projectdungeon.BaseTest;
import com.rollingduck.projectdungeon.world.WorldImporter;

public class WorldImporterTest extends BaseTest {

	@Test
	public void testImportWorldCsv() throws IOException {
		WorldImporter importer = new WorldImporter();
		importer.importWorldCsv();
	}

}
