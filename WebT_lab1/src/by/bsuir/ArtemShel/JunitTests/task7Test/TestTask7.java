package by.bsuir.ArtemShel.JunitTests.task7Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.bsuir.ArtemShel.task7.util.ShellSort;

class TestTask7 {

	@Test
	void testSort() {
        Assertions.assertArrayEquals(new double[] {1, 2, 3, 4, 5}   ,ShellSort.sort(new double[]{5, 4, 3, 2, 1}));
        Assertions.assertArrayEquals(new double[] {1.2, 2,  4, 6.6, 7.3}  ,ShellSort.sort(new double[]{6.6, 4, 7.3, 2, 1.2}));
        Assertions.assertThrows(IllegalArgumentException.class,() -> ShellSort.sort(null));
	}

}
