package lab05;

/**
 * This class represents a fraction; e.g., 1/2.
 * 
 * @author Prof. Martin
 * @version Lab 5
 */
public class Fraction {

	private int numerator;
	private int denominator;

	/**
	 * This constructor builds a "default" Fraction object 0/1.
	 */
	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}
	/**
	 * This constructor builds Fraction object over 1 (num/1)
	 */
	public Fraction(int num) {
		this.numerator = num;
		this.denominator = 1;
	}

	/**
	 * This constructor builds a Fraction object, given a numerator and denominator.
	 * 
	 * @param numerator - value for initializing the numerator
	 * @param denominator - value for initializing the denominator
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * Getter method for accessing the numerator of this Fraction object.
	 * 
	 * @return the numerator
	 */
	public int getNumerator() {
		return this.numerator;
	}

	/**
	 * Getter method for accessing the denominator of this Fraction object.
	 * 
	 * @return the denominator
	 */
	public int getDenominator() {
		return this.denominator;
	}

	/**
	 * This method calculates the decimal-point equivalent of this Fraction object.
	 * 
	 * @return the decimal-point equivalent
	 */
	public Fraction addOne() {
		(this.numerator + this.denominator) / this.denominator;
	}
	/**
	 * This method calculates the decimal-point equivalent of this Fraction object.
	 * 
	 * @return the decimal-point equivalent
	 */
	public double toDouble() {
		return this.numerator / (double) this.denominator;
	}

	/**
	 * This method generates a textual representation of this Fraction object.
	 * 
	 * @return a string containing the textual representation
	 */
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	/**
	 * This method determines whether this Fraction object and the given
	 * object are equal.
	 * 
	 * @param other - the other object to compare
	 * @return true if the two objects are equal, false otherwise
	 */
	public boolean equals(Object other) {
		if (!(other instanceof Fraction))
			return false;
		Fraction otherFraction = (Fraction) other;
		return this.numerator == otherFraction.numerator && 
				this.denominator == otherFraction.denominator;
	}
	/**
	 * This method computes the GCD of this Fraction object's numerator and denominator.
	 * 
	 * @return the GCD
	 */
	private int gcd() {
		int t = 0
		int a = this.numerator
		int b = this.denominator
		while (b!=0) {
		   t=b;
		   b= a%b;
		   a=t;
		}
		return a;
	}
		
	/**
	 * This method reduced this Fraction object to its simplest form.
	 */
	public void reduce() {
		int gcd= gcd();
		int newNum = this.numerator/gcd;
		int newDen = this.denominator/gcd;
		
	}
}