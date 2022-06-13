package main;

public class MethodTest {

	public void test01(){
		System.out.println("테스트01 메소드 호출됨...");
	}
	
	public void test02() {
		System.out.println("테스트02 메소드 호출됨...");
	}
	public void test03() {
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public void gugu() {
		for(int x=2; x<=9; x++) {
			for(int i = 1; i<=9; i++) {
				System.out.println(x + "*" + i + "=" +  x*i);
			}
		}
	}
	
	public void printNum(int x) { //x에 Main class에서 입력한 값을 받아와서 실행 됨!!
		System.out.println(x);
	}
	
	//정수 하나 전달받고, +1 해준 값 출력
	public void plusOne(int n) {
		System.out.println(n+1);
	}
	
	
	
}
