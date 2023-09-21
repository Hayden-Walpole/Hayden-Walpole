package lab04;

import java.util.Scanner;
public class TestingPractice {
	public static String camelCase(String originalText) {
		/**takes a string and converts it to a camelcase string without spaces
		 * @return string- camel case output
		 */
	    String camelCaseText = "";
	    Scanner wordScanner = new Scanner(originalText);
	    boolean firstWord = true;
	    while(wordScanner.hasNext()) {
	        String word = wordScanner.next();
	        if(firstWord)
	            camelCaseText = word;
	        else {
	            char firstLetter = word.charAt(0);
	            char upperLetter = Character.toUpperCase(firstLetter);
	            String camelWord = upperLetter + word.substring(1, word.length());
	            camelCaseText += camelWord;
	        }
	        firstWord = false;
	    }
	    wordScanner.close();
	    return camelCaseText;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
