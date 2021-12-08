package by.bsuir.ArtemShel.JunitTests.task3Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import by.bsuir.ArtemShel.task3.util.FindFunction;

class FindFunctionTest {

	@Test
	void test() {
		 Assertions.assertEquals(1, FindFunction.findAnswer(0, 0, 0.1)[0].length);
	     Assertions.assertEquals(6, FindFunction.findAnswer(1, 2, 0.2)[0].length);
	    
	}

}
