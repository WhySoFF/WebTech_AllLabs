package by.bsuir.ArtemShel.JunitTests.task3Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.bsuir.ArtemShel.task3.util.CheckValues;

class CheckValuesTest {

	@Test
	void testParam() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->CheckValues.checkParam(3,2,0.45));
		Assertions.assertThrows(IllegalArgumentException.class, ()->CheckValues.checkParam(3,2,-0.45));
		Assertions.assertThrows(IllegalArgumentException.class, ()->CheckValues.checkParam(Double.POSITIVE_INFINITY,2,-0.45));
		Assertions.assertThrows(IllegalArgumentException.class, ()->CheckValues.checkParam(1,Double.POSITIVE_INFINITY,-0.45));
	}

}
