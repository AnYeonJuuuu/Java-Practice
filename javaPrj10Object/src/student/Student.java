package student;

public class Student {

	// field, global(=전역변수), member var, ovject var, instance var
	// 일반적으로 field 라고 불림!!
	// 항목 하나하나를 member라고 명칭함!
	
	public String name;
	public byte age;
	public int score;
	
	// +추가 ) 메소드 = 접근제한자 리턴타입 메소드이름(파라미터){실행 내용}
	public void hello() {
		System.out.println("hello ~~~ ");
	}
	
	//Student 객체는 총 네개의 멤버가 생성되어 있는 것!!
	
	
	public void student() {
		System.out.println("여기는 student 메소드 !!! ");
	}
	
	/*
	 * 접근제한자 : 인터넷 서치!
	 */
	
}
