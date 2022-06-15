package main;

import array.ArrayTest;

public class Run {

	public static void main(String[] args) {

		System.out.println("===== 객체 연습하기!! =====");
		// array 객체 연습
		ArrayTest at = new ArrayTest();//객체 불러오기
		at.test();
		at.test2();
		System.out.println("타입별 테스트");
		at.test3();
	}
	
	

}
