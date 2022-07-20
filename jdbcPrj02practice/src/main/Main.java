package main;

import java.util.Scanner;

import member.MemberController;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberController mc = new MemberController();
		
		System.out.println("===== MEMBER =====");
		
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.마이페이지");
		
		String input = sc.nextLine();
		
		switch(input) {
		case "1" : 
			System.out.println("===== 아래에 로그인 정보를 입력해주세요. =====");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = sc.nextLine();
			mc.login(id,pwd);
			break;
		case "2" : 
			int result = mc.join();
			if(result > 0) System.out.println("회원가입 성공!!!");
			else System.out.println("회원가입 실패...");
			break;
		case "3" : 
			
			mc.edit();
			break;
		default : System.out.println("그런 숫자 없어요");
		}
	
	}

}
