package by.bsuir.ArtemShel.JunitTests.task4Test;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.bsuir.ArtemShel.task4.util.FindPrimeNumbers;

class Task4Test {

	@Test
	void test() {
		
		 
	     ArrayList<Integer> expectedIndexes = new ArrayList<>();  
	        int[] arr =  {4,2,8,3,5,9};
	        expectedIndexes.add(1);
	        expectedIndexes.add(3);
	        expectedIndexes.add(4);

	     Assertions.assertEquals(expectedIndexes, FindPrimeNumbers.findSimpleNumbers(arr));
	     	expectedIndexes.clear();
	     int[] arr2 =  {1,2,8,5,9,10};
	        expectedIndexes.add(1);
	        expectedIndexes.add(3);
	     int[] arr3 = null;

	     Assertions.assertEquals(expectedIndexes, FindPrimeNumbers.findSimpleNumbers(arr2));
	     Assertions.assertThrows(IllegalArgumentException.class, ()-> FindPrimeNumbers.findSimpleNumbers(arr3));
	}
	
	

}
