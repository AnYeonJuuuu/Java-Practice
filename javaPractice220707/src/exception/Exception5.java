package exception;

public class Exception5 {
	public static void main(String args[]) {
		
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); 	// ������� �ʴ´�.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	
			System.out.println("ArithmeticException");}
		System.out.println(6);
	}	// main�޼����� ��
}
