package Lab02;

import java.util.Scanner;

public class ScannerPractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner classInfo = new Scanner("CS1410 2023");
		boolean stringAvailable = classInfo.hasNext();
		String token = classInfo.next();
		System.out.println(stringAvailable + " " + token);
		stringAvailable = classInfo.hasNextInt();
		int year = classInfo.nextInt();
		
		System.out.println(stringAvailable + " " + year);
		Scanner s = new Scanner("Hello 10");
		System.out.print(s.hasNextInt() + " " + s.hasNextInt());
	}
}
