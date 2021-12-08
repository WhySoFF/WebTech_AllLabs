package by.bsuir.ArtemShel.JunitTests.task5Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import by.bsuir.ArtemShel.task5.util.FindMinElements;

class Task5Test {

	@Test
	void test() {
			int[] arr = null;
		    Assertions.assertEquals(0, FindMinElements.getMinElements(new int[0]));
	        Assertions.assertEquals(0, FindMinElements.getMinElements(new int[1]));
	        Assertions.assertEquals(0, FindMinElements.getMinElements(new int[] {1, 2, 3}));
	        Assertions.assertEquals(1, FindMinElements.getMinElements(new int[] {4, 1, 2, 3}));
	        Assertions.assertThrows(IllegalArgumentException.class,() -> FindMinElements.getMinElements(arr));
	}

}
