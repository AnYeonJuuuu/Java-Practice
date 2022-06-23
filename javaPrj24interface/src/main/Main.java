package main;

public class Main {

	public static void main(String[] args) {

		//인터페이스 : ava는 클래스의 다중 상속을 지원하지 않지만, 
		// 인터페이스로 다중 상속 효과를 간접적으로 얻을 수 있음.
		//메소드는 추상 메소드만 가질 수 있음
		Car car01 = new Sonata();
		car01.go();
		car01.stop();
	}

}
