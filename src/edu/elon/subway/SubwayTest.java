package edu.elon.subway;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import edu.elon.subway.*;;

class SubwayTest {
Subway2 subway;
	@BeforeEach
	void setUp() throws Exception {
		subway = new Subway2();
	}

	@AfterEach
	void tearDown() throws Exception {
		subway = null;
	}

	@Test
	void testInsertCoin() {
		subway.insertCoin();
		assertTrue(subway.getState() instanceof Unlocked);
	}
	
	@Test
	void testPassUnable() {
		subway.pass();
		assertTrue(subway.getState()instanceof Locked);
	}
	@Test
	void testPassAble() {
		subway.insertCoin();
		subway.pass();
		assertTrue(subway.getState() instanceof Locked);
	}
	

}
