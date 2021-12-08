package by.bsuir.ArtemShel.task2.runner;
import by.bsuir.ArtemShel.task2.util.Point;
import by.bsuir.ArtemShel.scanner.InputData;


public class FindPoint {

	public static void main(String[] args) {
	
		System.out.print("������� x: ");
		double x = InputData.inputDouble();
		
		System.out.print("������� y: ");
		double y = InputData.inputDouble();
		
		
		Point pt = new Point(x,y);
		System.out.println("����� � ������������: " +pt.toString()+ (pt.heck()? "������ ":"�� ������ ")+ "� ����������� �������");

	}

}
