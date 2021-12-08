package by.bsuir.ArtemShel.task6.runner;

import by.bsuir.ArtemShel.printer.PrintData;
import by.bsuir.ArtemShel.scanner.InputData;
import by.bsuir.ArtemShel.task6.util.Matrix;

public class StartTask6 {

	public static void main(String[] args) {
		
		System.out.println("Please, enter array size: ");
		int n = InputData.inputInt();
		
		System.out.println("Please, enter array");
		int[] array = InputData.inputIntArray(n);
		
		try {
			int[][] matrix = Matrix.fillMatrix(array); 
			PrintData.printIntMatrix(matrix);
			
		}catch( IllegalArgumentException e) {
			System.out.println( e.getMessage() );
		}

	}

}
