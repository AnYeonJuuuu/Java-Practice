package main;

import food.Chicken;

public class BattleManager {

	public static String name = "배틀매니저"; //클래스 변수
	
	private boolean Finish; //인스턴스 변수
	
	
	public boolean isFinish() { //getter가 붙지 않고 boolean 타입의 isFinish 로 !!
		return Finish;
	}


	public void setFinish(boolean finish) {
		Finish = finish;
	}


	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		BattleManager.name = name;
	}




	public void test01() {
		System.out.println("name : " + name);
		System.out.println("GameManager.name : " + GameManager.name);
		System.out.println("BattleManager.name : " + BattleManager.name);
		System.out.println("Chicken.name : " + Chicken.name);
	}
	
}
