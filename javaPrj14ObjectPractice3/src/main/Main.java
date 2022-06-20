package main;

import animal.Animal;
import person.Person;
import pokemon.Pokemon;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 연습 =====");
		
//		Person p1 = new Person("안연주",26,'f');
//		
//		Person p2 = new Person("연주",23,'f');
		
		Animal a1 = new Animal("토끼", 3.4);
		
		Animal a2 = new Animal("고양이", 6.5);
		
		System.out.println(a1);
		System.out.println(a2);
		
		Pokemon p1 = new Pokemon("피카",100,20);
		Pokemon p2 = new Pokemon("파이",100,10);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
