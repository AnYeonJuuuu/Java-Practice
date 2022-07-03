package main;


import employee.Employee;
import io.IOjoin;
import login.Login;


public class Main {
	public static Employee emp = new Employee(" Á÷¿ø : ");

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		emp.welcomeEmployee();
		new IOjoin().joinOut();
		new Login().login();
		
	}

}
