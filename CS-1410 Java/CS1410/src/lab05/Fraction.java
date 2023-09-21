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
	 * This constructor builds Fraction object over 1 (num/1).
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
	public addOne() {
		(this.numerator + this.denominator) / (double) this.denominator;
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
}