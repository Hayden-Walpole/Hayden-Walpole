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
	public void testclear() {
		Point2D location = new Point2D(17, 20);
		location.clear();
		assertEquals(0,location.getX());
		assertEquals(0,location.getY());
		location = new Point2D(0, 0);
		location.clear();
		assertEquals(0,location.getX());
		assertEquals(0,location.getY());
	}
	
	@Test
	public void testMove() {
		Point2D zero = new Point2D();
		assertEquals(0, zero.getX());
		assertEquals(0, zero.getY());
		zero.move(100, -2);
		assertEquals(100, zero.getX());
		assertEquals(-2, zero.getY());
		Point2D zero2 = new Point2D(-10,-10);
		zero2.move(100, -2);
		assertEquals(90, zero2.getX());
		assertEquals(-12, zero2.getY());
	}
	
	@Test
	public void testToString() {
		Point2D zero = new Point2D();
		assertEquals("(0, 0)", zero.toString());
		zero = new Point2D(-10,-10);
		assertEquals("(-10, -10)", zero.toString());
		zero = new Point2D(20,10);
		assertEquals("(20, 10)", zero.toString());
	}
	
	@Test
	public void testslope() {
		Point2D zero = new Point2D();
		Point2D twos = new Point2D(2,2);
		assertEquals(1,zero.slope(twos));
		Point2D negative = new Point2D(-2,-4);
		assertEquals(2,zero.slope(negative));
	}
		
	@Test
	public void testEquals() {
		Point2D center = new Point2D(50, 50);
		Object obj = new Point2D(50, 50);
		assertTrue(center.equals(obj), 
				"The parameter of equals() does not correctly match the requirements.");
		Point2D twenty1 = new Point2D(-20, 20);
		Object twenty2 = new Point2D(-20, 20);
		assertTrue(twenty1.equals(twenty2), 
				"The parameter of equals() does not correctly match the requirements.");
		Point2D fiftys = new Point2D(50, 50);
		Object copyFiftys = fiftys;
		assertTrue(fiftys.equals(copyFiftys), 
				"The parameter of equals() does not correctly match the requirements.");
	}

	@Test
	public void testDistance() {
		Point2D zero = new Point2D();
		Point2D threeFour = new Point2D(3,4);
		assertEquals(5,zero.distance(threeFour));
		Point2D negative = new Point2D(-3,-4);
		assertEquals(5,zero.distance(negative));
		Point2D zero3 = new Point2D(0,0);
		assertEquals(0,zero.distance(zero3));
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