package by.bsuir.ArtemShel.JunitTests.task6Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import by.bsuir.ArtemShel.task6.util.Matrix;

class Task6Test {

	@Test
	void testMatrix() {
		 int[][] expectedResult;
		 expectedResult = new int[][]{{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
		 Assertions.assertArrayEquals(expectedResult, Matrix.fillMatrix(new int[]{1, 2, 3}));
		 expectedResult = new int[][]{{1}};
	     Assertions.assertArrayEquals(expectedResult, Matrix.fillMatrix(new int[]{1}));
	     Assertions.assertThrows(IllegalArgumentException.class, () -> Matrix.fillMatrix(null));
	} 

}
