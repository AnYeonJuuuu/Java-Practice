package main;

import employee.Employee;
import kiosk.Kiosk;
import order.Order;

public class Main {

	public static Employee employee = new Employee("직원 : ");
	
	public static void main(String[] args) {

		System.out.println(" ===== 싱싱 샐러드 ===== ");
		
		//직원 부르고 인사
		employee.saywelcome();
		Kiosk kiosk = new Kiosk();
		Order order = kiosk.useKiosk();
		kiosk.calc(order);
		System.out.println(order);
		
		//키오스크 사용
		
		//키오스크 선택
		
		
		
		
	}

}
