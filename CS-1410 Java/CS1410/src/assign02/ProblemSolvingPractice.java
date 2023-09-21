package assign02;
//CS 1410 Assignment 2: ProblemSolvingPractice by Hayden Walpole(Sept 4, 2023)
import java.util.Arrays;
import java.util.Scanner;
public class ProblemSolvingPractice {

	public static void main(String[] args) {
		//Tests for is Palindrome
		System.out.println("Checking isPalindrome(\"abba\"). Expecting a result of true. The actual result is " + isPalindrome("abba") + ".");
		System.out.println("Checking isPalindrome(\"bad\"). Expecting a result of false. The actual result is " + isPalindrome("bad") + ".");
		System.out.println("Checking isPalindrome(\"racecar\"). Expecting a result of true. The actual result is " + isPalindrome("racecar") + ".");
		System.out.println("Checking isPalindrome(\"biscuit\"). Expecting a result of false. The actual result is " + isPalindrome("biscuit") + ".");
		System.out.println("Checking isPalindrome(\"tacocat\"). Expecting a result of true. The actual result is " + isPalindrome("tacocat") + ".");
		//Tests for countIntTokens
		System.out.println("Checking countIntTokens(\"there are 3 exams in 1410\"). Expecting a result of 2 . The actual result is " + countIntTokens("there are 3 exams in 1410") + ".");
		System.out.println("Checking countIntTokens(\"hello\"). Expecting a result of 0. The actual result is " + countIntTokens("hello") + ".");
		System.out.println("Checking countIntTokens(\"5 dogs on the grass\"). Expecting a result of 1. The actual result is " + countIntTokens("5 dogs on the grass") + ".");
		System.out.println("Checking countIntTokens(\"the 7 dwarves mined for 6 hours until 8 pm\"). Expecting a result of 3. The actual result is " + countIntTokens("the 7 dwarves mined for 6 hours until 8 pm") + ".");
		System.out.println("Checking countIntTokens(\"1 two 3 4 five six 7 8\"). Expecting a result of 5. The actual result is " + countIntTokens("1 two 3 4 five six 7 8") + ".");
		//moreOddThanEven tests
		System.out.println("Checking moreOddThanEven(\"1 3 4 6 Hello -8\"). Expecting a result of false. The actual result is " + moreOddThanEven("1 3 4 6 Hello -8") + ".");
		System.out.println("Checking moreOddThanEven(\"1 1 2 3 5 7\"). Expecting a result of true. The actual result is " + moreOddThanEven("1 1 2 3 5 7") + ".");
		System.out.println("Checking moreOddThanEven(\"2 2 test 3 4 6\"). Expecting a result of false. The actual result is " + moreOddThanEven("2 2 test 3 4 6") + ".");
		System.out.println("Checking moreOddThanEven(emptystring). Expecting a result of false. The actual result is " + moreOddThanEven("") + ".");
		System.out.println("Checking moreOddThanEven(\"no numbers in this line\"). Expecting a result of false. The actual result is " + moreOddThanEven("no numbers in this line") + ".");
		//camelCase tests
		System.out.println("Checking camelCase(\"first letter in word\"). Expecting a result of firstLetterInWord. The actual result is " + camelCase("first letter in word") + ".");
		System.out.println("Checking camelCase(\"testing number two\"). Expecting a result of testingNumberTwo. The actual result is " + camelCase("testing number two") + ".");
		System.out.println("Checking camelCase(\"example method style\"). Expecting a result of exampleMethodStyle. The actual result is " + camelCase("example method style") + ".");
		System.out.println("Checking camelCase(). Expecting a result of \"\". The actual result is " + camelCase("") + ".");
		//positiveAverage tests
		System.out.println("Checking positiveAverage(new int[] {2,3,4}). Expecting a result of 3.0. The actual result is " + positiveAverage(new int[] {2,3,4}) + ".");
		System.out.println("Checking positiveAverage(new int[] {-2,3,4,3,2}). Expecting a result of 3.0. The actual result is " + positiveAverage(new int[] {-2,3,4,3,2}) + ".");
		System.out.println("Checking positiveAverage(new int[] {-2,3,4,-3,-2}). Expecting a result of 3.5. The actual result is " + positiveAverage(new int[] {-2,3,4,-3,-2}) + ".");
		//frequencyCount tests
		System.out.println("Checking Arrays.toString(frequencyCount(new int[] {5,3,4,6,5,5,4,3,10,2,4,5,6,3,2,6})). Expecting a result of [0,2,3,3,4,3,0,0,0,1]. The actual result is " + Arrays.toString(frequencyCount(new int[] {5,3,4,6,5,5,4,3,10,2,4,5,6,3,2,6})) + ".");
		System.out.println("Checking Arrays.toString(frequencyCount(new int[] {1,3,4,5,7})). Expecting a result of [1,0,1,1,1,0,1,0,0,0]. The actual result is " + Arrays.toString(frequencyCount(new int[] {1,3,4,5,7})) + ".");
		System.out.println("Checking Arrays.toString(frequencyCount(new int[] {1,3,4,5,7,10,3})). Expecting a result of [1,0,2,1,1,0,1,0,0,1]. The actual result is " + Arrays.toString(frequencyCount(new int[] {1,3,4,5,7,10,3})) + ".");
		System.out.println("Checking Arrays.toString(frequencyCount(new int[] {1,1,1,5,7,7,3,10,6})). Expecting a result of [3,0,1,0,1,1,2,0,0,1]. The actual result is " + Arrays.toString(frequencyCount(new int[] {1,1,1,5,7,7,3,10,6})) + ".");
	}
	public static boolean isPalindrome(String input) {
		//Checks a single string to be a Palindrome
		for(int count1 = 0; count1 < input.length(); count1++) {
			char frontChar= input.charAt(count1);
			char backChar = input.charAt(input.length()-(count1+1));
			if (!(frontChar==backChar))
				return false;
			}
		return true;
		}
	
	public static int countIntTokens(String text){
		//counts the amount of integers in a single string
		int intCount = 0;
		Scanner stringInput = new Scanner(text);
		while(stringInput.hasNext()) {
			if (stringInput.hasNextInt()) {
				intCount= intCount + 1;
			}
			stringInput.next();
		}
		stringInput.close();
		return intCount;
	}
	
	public static boolean moreOddThanEven(String text){
		//Checks a single string and returns weither there are more odd
		//integer values than even integers
		int evenCount = 0;
		int oddCount = 0;
		Scanner stringInput1 = new Scanner(text);
		while(stringInput1.hasNext()) {
			if (stringInput1.hasNextInt()) {
				int intNumber = stringInput1.nextInt();
				if (intNumber %2 <= 0)
					evenCount = evenCount + 1;
				else
					oddCount = oddCount + 1;
			}
			else
			stringInput1.next();
			}
		stringInput1.close();
		return(oddCount > evenCount);
	}
	public static String camelCase(String stringLine) {
		// all characters much be letters a-z
		String camelString = "";
		Scanner stringInput = new Scanner(stringLine);
		if (stringInput.hasNext())
			camelString = stringInput.next();
			while(stringInput.hasNext()) {
				String word = stringInput.next();
				char firstLetter = word.charAt(0);
				char upperCaseFirLetter = Character.toUpperCase(firstLetter);
				String newWord = upperCaseFirLetter + word.substring(1,word.length());
				camelString=camelString + newWord;
				}
			stringInput.close();
		return camelString;
	}
	
	public static double positiveAverage(int[] arrayNums) {
		// takes the average of the positive integers from an input array
		double sumPositive = 0;
		double countPositive = 0;
		for(double item:arrayNums) {
			if(item > 0) {
				sumPositive= sumPositive + item;
				countPositive=countPositive+1;
			}
		}
		double average = (sumPositive)/(countPositive);
		return average;
	}
	
	public static int[] frequencyCount(int[] inputArray){
		//counts the frequency of each integer in an array of integers from 1-10
		int[] returnIndex = new int[10];
		for(int outputIndex=0; outputIndex<10; outputIndex++) {
			int outputIndexVal=0;
			for(int value: inputArray ) {
				if(value==outputIndex+1)
					outputIndexVal=outputIndexVal+1;
			}
			returnIndex[outputIndex]=outputIndexVal;
		}
		return returnIndex;
	}
}
