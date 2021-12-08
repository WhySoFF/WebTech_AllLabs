package by.bsuir.ArtemShel.JunitTests.task2Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import by.bsuir.ArtemShel.task2.util.Point;

class DecisitionTest {

	@Test
	void testPointCheck() {
		 Assertions.assertTrue(new Point(0,0).�heck());
		 Assertions.assertTrue(new Point(1,2).�heck());
		 Assertions.assertTrue(new Point(4,4).�heck());
		 Assertions.assertTrue(new Point(5,-3).�heck());
		 Assertions.assertFalse(new Point(4,6).�heck());
		 Assertions.assertFalse(new Point(5,-4).�heck());
	}

}
