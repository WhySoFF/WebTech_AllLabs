package by.bsuir.ArtemShel.task5.runner;

import by.bsuir.ArtemShel.scanner.InputData;
import by.bsuir.ArtemShel.task5.util.FindMinElements;

public class StartSequence {

	public static void main(String[] args) {
		
		System.out.println("Please, enter array size: ");
		int n = InputData.inputInt();
		
		System.out.println("Please, enter array");
		int[] array = InputData.inputIntArray(n);
		
		try {
			
			System.out.println("Min Amount for extracting: " +  FindMinElements.getMinElements(array)  );
			
		}catch( IllegalArgumentException e) {
			System.out.println( e.getMessage() );
		}
	}

}
