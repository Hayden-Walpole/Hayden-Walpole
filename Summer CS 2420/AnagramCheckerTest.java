package assign04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains tests for methods in AnagramChecker class
 *
 * @author Hayden Walpole, Zijia Xie
 * @version June ______________________________________________________, 2024
 */
class AnagramCheckerTest {
    private String[] smallWordArray, largeWordArray, emptyWordArray, noAnagramArray;

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

    @BeforeEach
    void setUp() {
        emptyWordArray = new String[0];
        smallWordArray = new String[]{"paled", "Paled", "pedal", "plea", "word", "Paled", "test", "Test", "paste", "drow", "tes"};
        noAnagramArray = new String[]{"rhj", "chk", "kgc", "fjddddi", "ngsd"};
    }

    @Test
    void test() {
//        AnagramChecker.insertionSort(smallWordArray, new Comparing<>());
//
//        for (String i : smallWordArray)
//            System.out.println(i + ", ");
    }
    
    @Test
    void testSort() {
//          System.out.println(AnagramChecker.sort("dasDfjAk"));
    	System.out.println();
    	System.out.println(AnagramChecker.sort("FaI"));
    }
    
    @Test
    void test3() {
    	assertTrue(AnagramChecker.areAnagrams("alert", "Later"));
    }
    
    @Test
    void test4() {
		System.out.print("test4 initial array:");
    	for (String s : smallWordArray)
    		System.out.print(s + ", ");
    	
    	String[] f = AnagramChecker.getLargestAnagramGroup(smallWordArray);
    	
		System.out.println("");
		System.out.print("test4 result:");
    	for (String s : f)
    		System.out.print(s + ", ");
    	
    }
    
    @Test
    void test4helper() {
    	AnagramChecker.insertionSort(smallWordArray, new Comparing<>());
		System.out.print("test4 array after insertion sort:");
    	for (String s : smallWordArray)
    		System.out.print(s + ", ");
		System.out.println("");
    }
    
    @Test
    void test41() {
    	var s = AnagramChecker.getLargestAnagramGroup(noAnagramArray);
    	assertEquals(0, s.length);
    }
    
    @Test
    void testGetLargestAnagramGroupSmall() {
    	var j = AnagramChecker.getLargestAnagramGroup(smallWordArray);
    	System.out.println("testGetLargestAnagramGroupSmall: ");
    	assertEquals(4, j.length);
    	for (String s : smallWordArray)
    		System.out.print(s + ", ");
    	System.out.println("-----------: ");

    }
    
    @Test
    void test5() {
    	var s = AnagramChecker.getLargestAnagramGroup("sample_word_list.txt");
    	System.out.println("");
    	System.out.println("Largest anargam Group from file:");
    	for (String r : s)
    		System.out.print(r + ", ");
    	assertEquals(7, s.length);
    	String[] exp = new String[]{"carets", "Caters", "caster", "crates", "Reacts", "recast", "traces"};
    	assertArrayEquals(exp, s);
    	}
    @Test
    void testPrintTextFilesorted() {
    	AnagramChecker.printList("sample_word_list.txt");
    }
    
}