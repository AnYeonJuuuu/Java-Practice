package menu;

import main.Main;

public class Menu {

	public int showMenu() {
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
		
		return InputUtil.getInt();
		
	}
}
