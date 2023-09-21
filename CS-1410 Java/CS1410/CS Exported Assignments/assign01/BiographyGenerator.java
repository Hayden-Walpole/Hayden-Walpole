package assign01;
//CS 1410 Assignment 1: Generating biographies by Hayden Walpole(Aug 31, 2023)
public class BiographyGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//info about Turing found at: https://www.ncitech.co.uk/media/2_1174_Original_Famous_People_in_Computer_History_1deb09.pdf
		System.out.println(biographyMaker("Alan Turing",2023,1912,"inventing the Turing Test to test artifical intelligence"));
		//info about Rossum found at: https://www.ncitech.co.uk/media/2_1174_Original_Famous_People_in_Computer_History_1deb09.pdf
		System.out.println(biographyMaker("Guido Van Rossum",2023,1956,"being the author of the programming language Pyton"));
	}
	//Calculates difference from past year and the current year
	public static int calculateYearDifference(int currentYear, int pastYear) {
		return currentYear-pastYear;
	}
	//Takes a list of inputs and turns them into a single Biography string
	public static String biographyMaker(String name, int currentYear, int birthYear, String famousAchievement) {
		return name + " was born " + calculateYearDifference(currentYear,birthYear)+ " years ago. " + name + " is famous for " + famousAchievement + ".";
	}
}
