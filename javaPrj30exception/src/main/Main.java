package main;

import exception.TestException;

public class Main {

	public static void main(String[] args) {

		TestException te = new TestException();
		
		try {
			te.test01();//exception 들어옴!
		} catch (Exception e) { // e라는 변수로 exception 잡겠다
			String s = e.getMessage();//메세지라는 변수가 있나보다!!
			System.out.println(s);
		}
//		te.test02();
//		te.test03();
		
	}

}
