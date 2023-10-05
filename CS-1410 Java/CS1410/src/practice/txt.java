package practice;

public class Fraction {
	   private int numerator;
	   private int denominator;
	   public Fraction(int numerator, int denominator) {
	      numerator = numerator;
	      denominator = denominator;
	   }
	   public int getNumerator() {
	      return numerator;
	   }
	   public int getDenominator() {
	      return denominator;
	   }
	   public static void main(String[] args) {
	   Fraction half = new Fraction(1, 2);
	   System.out.println(half.getNumerator() + " " + half.getDenominator());
	}
