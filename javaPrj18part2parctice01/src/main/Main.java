package main;


import employee.Emp;
import kiosk.Kiosk;
import order.Order;

public class Main {
	
	public static Emp emp = new Emp("아이유 : ");//클래스 변수

	public static void main(String[] args) {

		System.out.println("===== 피자가게 =====");
		
		//직원이 인사
		emp.saywelcome();
		
		//키오스크 사용하여, 주문 내용 얻기
		Kiosk kiosk = new Kiosk();
		Order order = kiosk.useKiosk();
		
		
		
		System.out.println(order);
		
		//가격 계산 총 얼마입니다 알려주기
		
		
		//돈 받기
		
		//거스름돈 계산해서 말하기
		
		
		
	}

}
