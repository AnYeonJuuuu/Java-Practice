package main;

import employee.Employee;
import job.Punip;
import job.SamMagerException;
import member.Member;

public class Main {

	//���� ���� ���͵� �п� ( �����, ��������, ���Թ�)
	public static Employee employee = new Employee("���� : "); 
	
	public static void main(String[] args) {

		
		System.out.println("========= ");
		Punip pi = new Punip();//����1 : �ذ� ) �⺻ ������ ����� ��� ���� �ȳ�!!
		
		while(true) {
		try {
			pi.sameMager();
			break; //����� �Է� ��, while�� ��������
		} catch (SamMagerException e) {
			String s = e.getMessage();
			System.out.println(s);
		}
		
		}
	}

}
