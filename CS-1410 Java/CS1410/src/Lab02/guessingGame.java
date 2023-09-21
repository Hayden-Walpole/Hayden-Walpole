//package Lab02;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class guessingGame {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner userInput = new Scanner(System.in);
//		// set value to an invalid integer
//		int value = 1000;	
//		// while value is an invalid integer
//		while(!(value >= 1 && value <= 100)) {
//			System.out.print("Please Guess a number between 1-100");
//			// if the next token is not an integer
//			value = ValidateUserInput(userInput);
//		 Random generator = new Random();
//		 int ranNum =(generator.nextInt(100)+1);
//		 System.out.println(ranNum);
//		 
//		 if (ranNum >= 1 && ranNum <= 100)
//				 System.out.println("number is in range");
//		 else
//		 System.out.println("number is in range");
//		}
//	}
//	/**
//	 * This class contains code for getting and validating user input.
//	 * In this example, "valid" means an integer less than 10.
//	 */
//	public static int ValidateUserInput(int input) {
//				if(!input.hasNextInt() ) { 
//					// advance Scanner to next token
//					input.next();
//					System.out.println("Invalid, not an int. Try again.");
//				} 
//				else {
//					value = input.nextInt();
//					// if the int token is not < 10
//					if(!(value >= 1 && value <= 100)) 
//						System.out.println("Invalid, number not in range, Try again.");
//				}
//			}
//			System.out.println("Valid input: " + value);
//			userInput.close();
//			return value
