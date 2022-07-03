package main;

import employee.Employee;
import io.InOut;
import job.SamMagerException;
import join.Join;

public class Main {

	//독학 종합 스터디 학원 ( 재수반, 공무원반, 편입반)
//	public static Employee employee = new Employee("직원 : "); 
	
	public static void main(String[] args) throws SamMagerException {

		 
		System.out.println("========= ");
		new Join().firstJoin();
		new Join().mainJoin();
		new InOut().testOutput();
		 
		
		 
		
//		Punip2 pi = new Punip2();//오류1 : 해결 ) 기본 생성자 만들어 줘야 오류 안남!!
//		
//		while(true) {
//		try {
//			pi.sameMager();
//			break; //제대로 입력 시, while문 빠져나옴
//		} catch (SamMagerException e) {
//			String s = e.getMessage();
//			System.out.println(s);
//		}
//		
//		}
	}

}
