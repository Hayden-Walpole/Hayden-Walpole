package practice;

public class Fraction {
	//
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	public Fraction() {
		numerator = 1;
		denominator = 1;
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int newNumerator) {
		numerator = newNumerator;
	}
	public double asDouble() {
		return numerator / (double)
	}
}
