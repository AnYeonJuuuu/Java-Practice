package main;

import mob.Agumon;
import mob.Digimon;
import mob.Papimon;

public class Main {
public static void main(String[] args) {
	
	//디지몬 공격 출력 >>공통속성 뭐가 있을까?
	//인터페이스는 추상메소드 넣어보기!
	//디지몬 action에는 공격 , 스킬!
	//디지몬 클래스에는 이름 타입
	System.out.println("===== 인터페이스 추상클래스 연습 ======");
	Digimon agumon = new Agumon();//아구몬 객체 생성
	agumon.setName("아구몬");
	agumon.setType("백신");
	
	Digimon papimon = new Papimon();
	papimon.setName("파피몬");
	papimon.setType("백신");
	
	System.out.println(agumon);
	System.out.println(papimon);
	
	//디지몬 액션 출력
	agumon.sayHello();//이 메서드는 디지몬에 클래스에 있지만 제일 하위 클래스가 아구몬 이므로
	agumon.action();
	agumon.attack();
	papimon.action();
	papimon.attack();
	
	
	
}
}
