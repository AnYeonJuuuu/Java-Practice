package main;

import employee.Employee;
import kiosk.Kiosk;
import order.Order;

public class Main {

	public static Employee employee = new Employee("���� : ");
	
	public static void main(String[] args) {

		System.out.println(" ===== �̽� ������ ===== ");
		
		//���� �θ��� �λ�
		employee.saywelcome();
		Kiosk kiosk = new Kiosk();
		Order order = kiosk.useKiosk();
		kiosk.calc(order);
		System.out.println(order);
		
		//Ű����ũ ���
		
		//Ű����ũ ����
		
		
		
		
	}

}
