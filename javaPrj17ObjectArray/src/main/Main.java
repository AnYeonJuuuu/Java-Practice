package main;

import person.Person;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 객체 배열 =====");
		
		//배열 선언
		Person[] personArr = new Person[5];
		personArr[0] = new Person("안연주", "한국", 26, 'F');
		personArr[1] = new Person("연주", "미국", 22, 'F');
		personArr[2] = new Person("안연wb", "디국", 28, 'F');
		personArr[3] = new Person("안투주", "리국", 21, 'F');
		personArr[4] = new Person("안연주스", "지국", 26, 'F');
		
		for(int i=0; i < personArr.length; i++) {
			System.out.println(personArr[i]);
		}
		
//		System.out.println(personArr[0]);
//		System.out.println(personArr[1]);
//		System.out.println(personArr[2]);
//		System.out.println(personArr[3]);
//		System.out.println(personArr[4]);
		
	}//c

}
