package assign04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class provides methods for checking anagram words and word group
 *
 * @author Hayden Walpole, Zijia Xie
 * @version June 4, 2024
 * @param <T> Generic type
 */
public class ACLegacy<T> {

    /**
     * Perform insertion sort to a given generic array and Comparator object
     *
     * @param array The array to be sorted
     * @param cmp Comparator object
     * @param <T> Generic type
     */
    public static <T> void insertionSort(T[] array, Comparator<? super T> cmp) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >= 0 && cmp.compare(array[j], array[j+1]) > 0; j--) {
                T tempItem = array[j+1];
                array[j+1] = array[j];
                array[j] = tempItem;
            }
        }
    }

    /**
     * Sort to a given string which the characters are sorted lexicographically
     *
     * @param inputString Given string
     * @return Given string but all characters are ordered in lexicographic order
     */
    public static String sort(String inputString) {
        String[] charactersArray = new String[inputString.length()];
        String returnString = "";
        for (int i = 0; i < inputString.length();i++) {
            char character = inputString.charAt(i);
            charactersArray[i] = Character.toString(character);
        }

        insertionSort(charactersArray, new Comparing<>());
        
        for(int i=0; i < charactersArray.length; i++)
        	returnString = returnString + charactersArray[i];
        return returnString;
    }

    /**
     * Check if two strings are anagrams or not
     *
     * @param string1 First string to be checked
     * @param string2 Second string to be checked
     * @return True if the two strings are anagrams, false of not
     */
    public static boolean areAnagrams(String string1, String string2) {
    	return sort(string1).equalsIgnoreCase(sort(string2));
    }

    /**
     * Find the largest group of anagram words in an array of words
     *
     * @param inputArray Array with words (in string)
     * @return Largest group of anagram words in the given array
     */
    public static String[] getLargestAnagramGroup(String[] inputArray) {
        int largestAnagramWordCount = 0;
        int largestAnagramGroupStartIndex = 0;
        int anagramWordsTrack = 0;

        insertionSort(inputArray, new Comparing<>());

        for(int i = 0; i < inputArray.length; i+= anagramWordsTrack) {
            anagramWordsTrack = 0 ;

            for (int j = i; j < inputArray.length; j++) {
                if (areAnagrams(inputArray[i], inputArray[j])) {
                    anagramWordsTrack++;
                    if (anagramWordsTrack > largestAnagramWordCount && i!=j) {
                        largestAnagramWordCount = anagramWordsTrack;
                        largestAnagramGroupStartIndex = i;
                    }
                }
            }
        }
        
        String[] s = new String[largestAnagramWordCount];
        int w =0;
        for (int i  = largestAnagramGroupStartIndex; i < largestAnagramGroupStartIndex + largestAnagramWordCount; i++) {
            s[w] = inputArray[i];
            w++;
        }

        return s;
    }

    /**
     * Find the largest group of anagram words in a text file
     *
     * @param filename Text (.txt) file's name
     * @return Largest group of anagram words in the text file
     */
    public static String[] getLargestAnagramGroup(String filename) {
        Scanner scanner;
		try {
			scanner = new Scanner(new File(filename));
			
			ArrayList<String> wordList = new ArrayList<>();
	        while (scanner.hasNextLine())
	            wordList.add(scanner.nextLine());

	        String[] stringArray = new String[wordList.size()];
	        stringArray = wordList.toArray(stringArray);
	        
	        scanner.close();
	        return getLargestAnagramGroup(stringArray);
		} catch (FileNotFoundException e) {
			return new String[0];
		}

    }

    /**
     * Comparator
     *
     * @param <T> Generic type
     */
    private static class Comparing<T> implements Comparator<T> {

        /**
         * Comparing two objects in ascending order
         *
         * @param item1 the first object to be compared
         * @param item2 the second object to be compared
         * @return 0 if item1 = item2, positive number
         */
        public int compare(T item1, T item2) {
        	String i1 = AnagramChecker.sort((String)item1);
        	String i2 = AnagramChecker.sort((String)item2);
        	return i1.compareTo(i2);
        }
    }

}