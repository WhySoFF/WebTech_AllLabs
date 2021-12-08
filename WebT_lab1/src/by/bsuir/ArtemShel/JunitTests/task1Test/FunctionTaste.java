package by.bsuir.ArtemShel.JunitTests.task1Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.bsuir.ArtemShel.task1.util.SolveTheEquation;;
class FunctionTaste {

	private static final double e = 0.0001;
	
	@Test
	void equationTest() {
		 
	     Assertions.assertEquals(2.4932,SolveTheEquation.equation( 2 ,3 ), e);
	     Assertions.assertEquals(0.5, SolveTheEquation.equation(0, 0));
	     Assertions.assertEquals(3.2, SolveTheEquation.equation(3, Double.MAX_VALUE), e);
	     Assertions.assertEquals(Double.NaN,SolveTheEquation.equation( Double.MAX_VALUE,2), e);
	     Assertions.assertEquals(3.2039, SolveTheEquation.equation(3,Double.MIN_VALUE), e);
	}

}
