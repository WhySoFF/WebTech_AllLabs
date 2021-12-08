package by.bsuir.ArtemShel.task3.util;

public class CheckValues {
	
	public static  void  checkParam(double a, double b, double h) {
		if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(h)) {
	        throw new IllegalArgumentException("���������� �� �����");
	    }
	    if (b < a) {
	        throw new IllegalArgumentException("�������� ����� �������");
	    }
	    if (h <= 0) {
	        throw new IllegalArgumentException("��� ������ ���� �������������");
	    }
	}
}
