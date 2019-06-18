package ÉúÃüÓÎÏ·;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class lifegameTest {

	private lifegame game = new lifegame();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout=1000)
	public void testMain() {
		game.main(null);
	}

}
