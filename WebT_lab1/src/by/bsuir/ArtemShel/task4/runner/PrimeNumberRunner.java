package by.bsuir.ArtemShel.task4.runner;

import by.bsuir.ArtemShel.scanner.InputData;
import by.bsuir.ArtemShel.task4.util.FindPrimeNumbers;

public class PrimeNumberRunner {

	public static void main(String[] args) {
		
		System.out.println("Please, enter array size: ");
		int n = InputData.inputInt();
		
		System.out.println("Please, enter array");
		int[] array = InputData.inputIntArray(n);
		
		try {
			
			int[] arr  = FindPrimeNumbers.findSimpleNumbers(array);
			for(int i= 0; i< arr.length; i++)
				System.out.print(arr[i]+ " ");
			//System.out.println("Indexes of prime numbers: " +  (list.toString().substring(1, list.toString().length() - 1))  );
			
		}catch( IllegalArgumentException e) {
			System.out.println( e.getMessage() );
		}
	}

}
