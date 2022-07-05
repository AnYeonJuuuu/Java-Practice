package iopractice;

public class TryCatch {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=0;
		try {
			int c=a/b;
			System.out.println(c);	//예외발생으로 실행 불가한 코드
		}catch(ArithmeticException e) {
			System.out.println("예외발생!!!");
			System.out.println("0으로 나누기 불가!!!");
			e.printStackTrace();
		}finally {
			System.out.println("finally는 무조건 실행");
		}
	
	}

}
