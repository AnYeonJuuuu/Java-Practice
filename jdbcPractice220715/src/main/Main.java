package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== JDBC TEST =====");

		Scanner sc = new Scanner(System.in);
		EmployeeController ec = new EmployeeController();

		System.out.println("1. ��ü ��� ��ȸ");
		System.out.println("2. ��� �˻�(���̵�)");

		String input = sc.nextLine();

		switch (input) {
		case "1":
			ec.selectEmployeeList();
			break;
		case "2":
			System.out.print("�����ȣ : ");
			String empId = sc.nextLine();
			ec.selectEmployeeById(empId); break;
		}
	}

}
