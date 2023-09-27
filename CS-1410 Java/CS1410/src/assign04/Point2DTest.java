package assign04;
/**contains tests for the Point2D class
 * @author Hayden Walpole
 * @version Sept. 25 2023
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Point2DTest {
	@Test
	public void testGetX() {
		Point2D location = new Point2D(-43, 55);
		assertEquals(-43, location.getX());
	}
	@Test
	public void testGetY() {
		Point2D location = new Point2D(17, 20);
		assertEquals(20,location.getY());
	}
	
	@Test
	public void testMove() {
		Point2D zero = new Point2D();
		assertEquals(0, zero.getX());
		assertEquals(0, zero.getY());
		zero.move(100, -2);
		assertEquals(100, zero.getX());
		assertEquals(-2, zero.getY());
	}
	
	@Test
	public void testToString() {
		Point2D zero = new Point2D();
		assertEquals("(0, 0)", zero.toString());
	}
	
	@Test
	public void testEquals() {
		Point2D center = new Point2D(50, 50);
		Object obj = new Point2D(50, 50);
		assertTrue(center.equals(obj), 
				"The parameter of equals() does not correctly match the requirements.");
	}

	@Test
	public void testDistance() {
		Point2D southWest = new Point2D(3, 1);
		Point2D northEast = new Point2D(10, 12);
		
		/* This version of assertEquals has a third parameter for the error 
		 * tolerance when comparing two doubles, which is necessary since 
		 * many values with decimal points cannot be represented exactly in 
		 * a computer. 
		 */
		assertEquals(13.0384, southWest.distance(northEast), 0.0001);
	}
}