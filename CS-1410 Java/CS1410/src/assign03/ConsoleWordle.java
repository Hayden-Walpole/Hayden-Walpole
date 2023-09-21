package assign03;
/**this is Assignment 3: COnsole Wordle
 * @author Hayden Walpole
 * @version September 14, 2023
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
public class ConsoleWordle {
	public static String[] readFile(String fileName) throws FileNotFoundException {
		/** this method reads the specified file name in project and converts it into a string array
		 * 
		 *@param fileName- file name of specified file 
		 *@return wordArray - array of strings of the words in text file
		 */
		File file = new File(fileName);
		Scanner fileInput = new Scanner(file);
		int arraySize = fileInput.nextInt();
		String[] wordArray = new String[arraySize];
		for(int i=0;i<arraySize;i++) {
			wordArray[i]=fileInput.next();
		}
		fileInput.close(); // close the Scanner
		return wordArray;
		}
	public static String getSecretWord(String[] stringArray) {
		/**Chooses a random word from the string array and outputs it
		 * 
		 * @params string array- array of strings
		 * @return secretWord- random word from the text file
		 */
		Random rand = new Random();
		int randNum = rand.nextInt(stringArray.length+1);
		String secretWord = stringArray[randNum];
		return secretWord;
	}
	public static boolean letterContainedInWord(char letter, String word) {
		/**Checks the word to see if it contains the character
		 * 
		 * @param letter- letter too check for
		 * @param word- string that method searches for letter in
		 * @return True if letter is found in word, false otherwise
		 */
		for (int i = 0;i< word.length();i++) {
			if (word.charAt(i)==letter)
				return true;
			}
		return false;
		}
	public static String getUserGuess(Scanner userInput) {
		/**waits until user enters 5 letter word as string
		 * 
		 * @params userInput- scanner from user
		 * @return userWord- five letter string
		 */
		// while value is an invalid integer
		String userWord="";
		while(userWord.length()!= 5) {
			System.out.println("Please Guess a five letter word");
			userWord=userInput.next();
			if(userWord.length()!=5 ) { 
				System.out.println("Invalid, Please Guess a five letter word");
				}
			}
		return userWord;
	}
	public static void displayResultOfRound(String guess, String secretWord) {
		/**returns the round results
		 * 
		 * @param guess- the guess from the user
		 * @param secretWord- the secret word for this game
		 * @return string stating the correct letters and places
		 */
		for(int letterIndex=0; letterIndex<5;letterIndex++) {
			if(guess.charAt(letterIndex)==secretWord.charAt(letterIndex))
				System.out.print(Character.toUpperCase(guess.charAt(letterIndex)));
			else if(letterContainedInWord(guess.charAt(letterIndex),secretWord))
				System.out.print(guess.charAt(letterIndex));
			else
				System.out.print("-");
			}
		System.out.println();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String[] wordArray = readFile("words.txt");
		String secretWord = getSecretWord(wordArray);
		Scanner userInputWord = new Scanner(System.in);
		int roundNum=1;
		boolean correctGuess= false;
		while(roundNum<7 && correctGuess==false ) {
			System.out.print("Round" + roundNum + "- ");
			String userGuess=getUserGuess(userInputWord);
			displayResultOfRound(userGuess,secretWord);
			if (userGuess=secretWord) {
				correctGuess= true;
				System.out.println("Congratulations! you guessed the secret word Correctly");
			}
			roundNum=roundNum+1;
			}
		System.out.println("Sorry, you did not guess the secret word- " + secretWord + " in 6 rounds.");
		userInputWord.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}
		
	}

}
