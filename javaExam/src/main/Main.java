package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력해주세요");
			String str = sc.nextLine();
			
			if(str.equals("exit") ) {
			System.out.println("프로그램을 종료합니다.");
			break;	
		} else{
			System.out.println(str.length()+"글자입니다.");
			continue;
		}

		
	}
		
	}
}
