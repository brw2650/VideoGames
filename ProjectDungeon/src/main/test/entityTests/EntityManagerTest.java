package entityTests;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import com.rollingduck.projectdungeon.constants.CharacterConstants;
import com.rollingduck.projectdungeon.entities.EntityManager;
import com.rollingduck.projectdungeon.entities.Player;
import com.rollingduck.projectdungeon.world.Coordinates;

public class EntityManagerTest {

	@Test
	public void testAddEntity() {

		Player p = new Player(new Coordinates(0, 1), 0);
		EntityManager m = EntityManager.getInstance();
		EntityManager.addEntity(p);

		Player testPlayer = (Player) EntityManager.getEntityById(p
				.getEntityId());
		HashMap<String, Integer> moveMe = new HashMap<String, Integer>();
		moveMe.put(CharacterConstants.MOVEMENT_UP, 5);
		testPlayer.move(moveMe);

		assertTrue(testPlayer.getCoordinates().getY() == 6);

	}

}