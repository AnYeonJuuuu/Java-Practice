package iopractice;

public class Throws {
	// ���� �ҷ��ٰ� ���� �༮���� ���� ó���� �����ϰڴٴ� �ǹ��̸�
	// �ڵ带 ¥�� ����� �� ����θ� ���� � ���ܰ� �߻��� �� �ִ��� �� �� ����
	public static void divide(int a, int b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException("0���� ���� ���� ����!!!");
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] ar) {
		
		try {
			divide(1,2);
		}catch(ArithmeticException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}