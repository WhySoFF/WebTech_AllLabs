package by.bsuir.ArtemShel.task1.util;


public class SolveTheEquation {
	
	public static  double equation( double x, double y) {
		 double numerator = 1 + Math.pow(Math.sin(x + y), 2);
		 double denominator = 2 + Math.abs(x - 2*x/ (1 + x * x * y * y));
		 double result = numerator/denominator + x;
		 return result;
	 }
}
