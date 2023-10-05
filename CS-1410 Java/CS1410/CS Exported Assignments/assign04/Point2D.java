package assign04;
public class Point2D {
	/** this class handles objects of x,y points. 
	 * @author Hayden Walpole
	 * @version Sept. 25 2023
	 */
	private int xVal;
	private int yVal;
	
	public Point2D() {
		/**Constructor, creates a Point2D object with the point(0,0)
		 * 
		 */
		this.xVal=0;
		this.yVal=0;
	}
	public Point2D(int x, int y) {
		/**Creates a Point2D object with the specified point
		 * @param x- int value for X-value of object
		 * @param y- int value for Y-value of object
		 */
		this.xVal=x;
		this.yVal=y;
	}
	public int getX() {
		/**Returns the X value of the given Point
		 * @returns- int x value
		 */
		return this.xVal;
	}
	public int getY() {
		/**Returns the Y value of the given Point
		 * @returns- int y value
		 */
		return this.yVal;
	}
	public void clear() {
		/** sets the current ordered pair to (0,0)
		 *
		 */
		this.xVal=0;
		this.yVal=0;
	}
	public void move(int x, int y) {
		/** moves the point the specified distance in both y and x direction
		 * @param x- distance to move in x direction
		 * @param y- distance to move in y direction
		 */
		this.xVal=this.xVal + x;
		this.yVal=this.yVal + y;
	}
	public String toString() {
		/**returns the point as a string in ther format "(x,y)"
		 * 
		 */
		return "(" + this.xVal + ", " + this.yVal + ")";
	}
	public double distance(Point2D secondPoint) {
		/**Finds the shortest unit distance between two points 
		 * @param secondPoint- Point2D object to compare against current object
		 * @return double - the distance between the two 2Dpoint objects
		 */
		return Math.sqrt(Math.pow((secondPoint.getX()-this.xVal),2) + (Math.pow((secondPoint.getY()-this.yVal),2)));
	}
	public double slope(Point2D secondPoint) {
		/** finds the slope of the line between two Point2D objects
		 * @param secondPoint- the second point object to compare against
		 * @return double - slope between two points
		 */
		double yDiff = secondPoint.getY() - this.yVal;
		double xDiff = secondPoint.getX() - this.xVal;
		double diff =(double)yDiff/xDiff;
		return diff;
		
	}
	public boolean equals(Object other) {
		/**Checks if two Point2D objects are the same
		 * @param Other - Point2D object to compare current object equivalence against
		 * @return Boolean if the objects are the same
		 */
		if (!(other instanceof Point2D))
			return false;
		Point2D otherPoint = (Point2D) other;
		return this.xVal == otherPoint.xVal && 
				this.yVal == otherPoint.yVal;
	}
}
