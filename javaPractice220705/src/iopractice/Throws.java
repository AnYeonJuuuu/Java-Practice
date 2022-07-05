package iopractice;

public class Throws {
	// 나를 불러다가 쓰는 녀석에게 에러 처리를 전가하겠다는 의미이며
	// 코드를 짜는 사람이 이 선언부를 보고 어떤 예외가 발생할 수 있는지 알 수 있음
	public static void divide(int a, int b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException("0으로 나눌 수는 없음!!!");
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