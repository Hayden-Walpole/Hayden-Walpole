package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingPracticeTest {

	@Test
	void testAdd() {
	    int result = MyClass.add(10, 20);
	    assertEquals(30, result, "Failed 10 plus 20");
	}
	void testSimpleCamelCase() {
		String result = lab04.TestingPractice.camelCase("is valid")
		assertEquals("isValid", TestingPractice.camelCase("is valid"), "camelCase(\"is valid\") failed");
	}
}