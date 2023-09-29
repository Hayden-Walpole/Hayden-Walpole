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
		/**Returns the 
		 * 
		 */
		return this.xVal;
	}
	public int getY() {
		return this.yVal;
	}
	public void clear() {
		this.xVal=0;
		this.yVal=0;
	}
	public void move(int x, int y) {
		this.xVal=x;
		this.yVal=y;
	}
	public String toString() {
		return "(" + this.xVal + ", " + this.yVal + ")";
	}
	public double distance(Point2D secondPoint) {
		return Math.sqrt(Math.pow((secondPoint.getX()-this.xVal),2) + (Math.pow((secondPoint.getY()-this.yVal),2)));
	}
	public double slope(Point2D secondPoint) {
		double yDiff = secondPoint.getY() - this.yVal;
		double xDiff = secondPoint.getX() - this.xVal;
		return (double)yDiff/xDiff;
	}
	public boolean equals(Object other) {
		if (!(other instanceof Point2D))
			return false;
		Point2D otherPoint = (Point2D) other;
		return this.xVal == otherPoint.xVal && 
				this.yVal == otherPoint.yVal;
	}
}
