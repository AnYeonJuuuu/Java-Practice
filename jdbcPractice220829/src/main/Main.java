package main;

import member.MemberVo;
import menu.Menu;

public class Main {
	
	public static MemberVo loginMember;//로그인 성공 시, MemberVo 객체를 loginMember에 넣을 것

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("환영합니다");
		
		Menu menu = new Menu();
		
		int input = menu.showMenu();
		
		
		
	}

}
