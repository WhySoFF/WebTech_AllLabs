package by.bsuir.ArtemShel.JunitTests.task8Test;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import by.bsuir.ArtemShel.task8.util.SequencesMerging;

class Task8Start {

	@Test
	void test() {
		double[] a = {1, 3, 6, 7};
		ArrayList<Double> list1 = new ArrayList<Double>();
		list1.add((double) 1);
		list1.add((double) 2);
		list1.add((double) 3);
		list1.add((double) 6);
		list1.add((double) 7);
		list1.add((double) 8);
        double[] b = {1, 2,  7, 8};  
        
        Assertions.assertEquals(list1 , SequencesMerging.merge(a, b));
        
          double[] a1 = {1, 2 ,22};
          double[] b1 = {0};
          list1.clear();
          list1.add((double) 0);
  		  list1.add((double) 1);
  		  list1.add((double) 2);
  		  list1.add((double) 22);
          
         Assertions.assertEquals(list1 , SequencesMerging.merge(a1, b1));
         
         Assertions.assertThrows(IllegalArgumentException.class, () -> SequencesMerging.merge(null, null));
        
    }

	

}
