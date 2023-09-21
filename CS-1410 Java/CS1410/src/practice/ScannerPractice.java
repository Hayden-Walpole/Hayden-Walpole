package practice;

import java.util.Scanner;

public class ScannerPractice{
	public static void main(String[] args) {
		Scanner userInputReader = new Scanner(System.in);
		// TODO Auto-generated method stub
		while(userInputReader.hasNext()) {
			if(userInputReader.hasNextInt())
				System.out.print("int-");
			else if(userInputReader.hasNextDouble())
				System.out.print("Double-");
			else
				System.out.print("other-");
			String Value = userInputReader.next();
			System.out.println(Value);
		}
	userInputReader.close();
	}
}