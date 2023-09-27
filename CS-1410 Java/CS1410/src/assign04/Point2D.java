package assign04;
/**
 * @author Hayden Walpole
 * @version Sept. 25 2023
 */
public class Point2D {
	private int xVal;
	private int yVal;
	
	public Point2D() {
		this.xVal=0;
		this.yVal=0;
	}
	public Point2D(int x, int y) {
		this.xVal=x;
		this.yVal=y;
	}
	public int getX() {
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
