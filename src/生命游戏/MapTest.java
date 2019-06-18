package …˙√¸”Œœ∑;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MapTest {

	private Map map = new Map();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCircleCount() {
		assertEquals(0,map.circleCount(0, 0));
		assertEquals(0,map.circleCount(0, 30));
		assertEquals(0,map.circleCount(30, 25));

		assertEquals(5,map.circleCount(20, 20));
		assertEquals(3,map.circleCount(21, 0));

		assertEquals(3,map.circleCount(22, 20));
		assertEquals(2,map.circleCount(22, 0));
	}

	@Test
	public void testChangeState() {
		map.changeState();
		assertEquals(0,map.nextstate[0][0]);
		assertEquals(0,map.nextstate[10][10]);
		
		assertEquals(0,map.nextstate[20][20]);
		assertEquals(1,map.nextstate[20][0]);
		
		assertEquals(1,map.nextstate[22][10]);
		assertEquals(0,map.nextstate[22][39]);
	}

	@Test
	public void testRepaintMap() {
		map.changeState();
		map.repaintMap();
		assertEquals(map.panel.getBackground(),map.textfield[0][39].getBackground());
		assertEquals(map.panel.getBackground(),map.textfield[20][20].getBackground());
		assertEquals(Color.black,map.textfield[22][20].getBackground());
		assertEquals(map.panel.getBackground(),map.textfield[19][39].getBackground());
	}

}

