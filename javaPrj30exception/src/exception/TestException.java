package exception;

public class TestException {

	public void test01() {
		System.out.println("test01 called...");
		try 
		{
			int[] arr = new int[3];//배열에서 오류 발생 
			arr[7] = 10;
			int x = 1/0; // Arithmetic Exception : 계산에서 오류가 발생
		}
		catch(ArithmeticException e) //Exception 잡아서 e에 넣고 처리하겠다.
		{
			System.out.println("Arithmetic Exception 발생");
		}
		catch(ArrayIndexOutOfBoundsException e) //Exception 잡아서 e에 넣고 처리하겠다.
		{
			System.out.println("에러 인덱스 이상함 발생");
		}
		
		System.out.println("test01 end...");
	}
	
	public void test02() {
		System.out.println("test02 called...");
		System.out.println("test02 end...");
	}
	
	public void test03() {
		System.out.println("test03 called...");
		System.out.println("test03 end...");
	}
	
}
