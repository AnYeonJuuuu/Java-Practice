package main;

import student.Student;

public class Main {

	public static void main(String[] args) {

		System.out.println("=== 오브젝트 ===");
		
		//학생 1명 만들고
		Student s = new Student(); // 뒷 항 Student는 메소드가 아님!!
		//데이터 집어넣기
		s.name = "안연주"; //s.(=변수)객체 접근한 다음(s.)>> 그 안에서 name 변수 찾도록!!
		s.age = 20;
		s.score = 100;
		
		//데이터 출력
		System.out.println("s.name : "+ s.name);
		System.out.println("s.age : "+ s.age);
		System.out.println("s.score : "+ s.score);
		
		Student s2 = new Student();
		s2.name = "안연주주";
		s2.age = 22;
		s2.score = 200;
		
		System.out.println("s2.name : "+ s2.name);
		System.out.println("s2.age : "+ s2.age);
		System.out.println("s2.score : "+ s2.score);
		
		
		//메소드 확인
		s.hello();
		
		//메소드 확인
		s.student();
		
		
	}

}
