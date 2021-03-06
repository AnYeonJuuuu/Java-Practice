package main;

import java.util.Scanner;

import member.MemberController;
import member.MemberDto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberController mc = new MemberController();
		
		System.out.println("===== MEMBER =====");
		
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.마이페이지");
		
		String input = sc.nextLine();
		MemberDto dto = null;
		switch(input) {
		case "1" : 
			dto = mc.login();
			mc.loginCheck(dto);//메서드로 분리
			break;
		case "2" : 
			int result = mc.join();
			if(result > 0) System.out.println("회원가입 성공!!!");
			else System.out.println("회원가입 실패...");
			break;
		case "3" :
			dto = mc.login();
			mc.loginCheck(dto);
			mc.edit();
			break;
		default : System.out.println("그런 숫자 없어요");
		}
	
	}

}
