package main;

public class MethodTest {

	// 메소드 오버로딩( 파라미터만 다르게 여러개 만드는 것)
	
	public void test() {
		System.out.println("test() called...");
	}
	
	public void test2(int x) {// 1. 메소드명에 숫자 붙이변 구분 가능!
		System.out.println("test() called...");
	}
	
	public void test2(int x, String s) { // 2.변수의 개수 차이로 구분 가능!
		System.out.println("test() called...");
	}
	public void test2(int x, int s) { // 3. 파라미터 타입을 다르게 해도 구분 가능!!
		System.out.println("test() called...");
	}
//	public boolean test2(int x, int s) { // 4.메소드 이름 판단은 리턴타입과 관계없음 == 오류남!!
//		System.out.println("test() called...");
//		return ture;
//	}
	
	
	
	
	
}
