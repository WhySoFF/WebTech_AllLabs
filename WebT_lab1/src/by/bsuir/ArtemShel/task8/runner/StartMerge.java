package by.bsuir.ArtemShel.task8.runner;

import java.util.ArrayList;


import by.bsuir.ArtemShel.scanner.InputData;
import by.bsuir.ArtemShel.task8.util.SequencesMerging;

public class StartMerge {

	public static void main(String[] args) {
		
		System.out.println("Please, enter first sequence size: ");
		int n1 = InputData.inputInt();
				
		System.out.println("Please, enter first sequence");
		double[] sequence1 = InputData.inputDoubleArray(n1);
		
		System.out.println("Please, enter second sequence size: ");
		int n2 = InputData.inputInt();
				
		System.out.println("Please, enter second sequence");
		double[] sequence2 = InputData.inputDoubleArray(n2);
		
		try {
			ArrayList<Double> finalSequence = SequencesMerging.merge(sequence1, sequence2); 
			System.out.println("Final sequebce: " +  (finalSequence.toString().substring(1, finalSequence.toString().length() - 1))  );
			
		}catch( IllegalArgumentException e) {
			System.out.println( e.getMessage() );
		}

	}

}
