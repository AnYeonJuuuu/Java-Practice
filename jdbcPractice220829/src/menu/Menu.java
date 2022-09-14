package menu;

import main.Main;
import util.InputUtil;

public class Menu {
	public int showMenu(){
		System.out.println("---- 메인 입니다. -----");
		if(Main.loginMember != null) {
			//로그인 o
			System.out.println(Main.loginMember.getNick() + "님 환영합니다.");
			System.out.println("3. 게시글 작성");
			System.out.println("4. 게시글 목록 조회");
		}else {
			//로그인 x
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 게시글 작성");
			System.out.println("4. 게시글 목록 조회");
		}
		
		System.out.println("9. 프로그램 종료");
		
		return InputUtil.getInt();
	}



}//c


