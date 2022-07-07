package exception;

public class Exception4 {
	public static void main(String args[]) {
		
		System.out.println(1);			
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0); // ArithmeticException 예외발생
			System.out.println(4);   // 실행 안 됨.
		} catch (ArithmeticException ae)	{
//			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		}	// try-catch의 끝

		System.out.println(6);}
}

