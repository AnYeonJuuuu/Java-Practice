package exception;

public class Exception {
	public static void main(String args[]) {
		
		System.out.println(1);			
		try {
			System.out.println(2);
			System.out.println(3/0);
			System.out.println(3);
		} catch (ArithmeticException e)    {
			System.out.println(4);  // 실행되지 않는다.
		} // try-catch의 끝
		System.out.println(5);
}
}
