package main;

import employee.Employee;
import io.InOut;
import job.SamMagerException;
import join.Join;

public class Main {

	//���� ���� ���͵� �п� ( �����, ��������, ���Թ�)
//	public static Employee employee = new Employee("���� : "); 
	
	public static void main(String[] args) throws SamMagerException {

		 
		System.out.println("========= ");
		new Join().firstJoin();
		new Join().mainJoin();
		new InOut().testOutput();
		 
		
		 
		
//		Punip2 pi = new Punip2();//����1 : �ذ� ) �⺻ ������ ����� ��� ���� �ȳ�!!
//		
//		while(true) {
//		try {
//			pi.sameMager();
//			break; //����� �Է� ��, while�� ��������
//		} catch (SamMagerException e) {
//			String s = e.getMessage();
//			System.out.println(s);
//		}
//		
//		}
	}

}
