package person;

public class Person {

	// 사람에 대한 클래스 만들기
	// 추상화 : 공통 속성 추출
	
	private String name;
	private String addr;
	private int birth;
	private char gender;
	private int age;
	
	public void old() {
		age = age +1;
	}
}
