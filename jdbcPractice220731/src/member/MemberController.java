package member;

import main.Main;
import util.InputUtil;

public class MemberController {
	public void login() {

		if (Main.loginMember != null) {
			// 이미 로그인 O
			System.out.println("이미 로그인 되어있습니다.");
			return; // else 쓰느 것 보다 좋은 코드 : 왜? ->

			/*
			 * else로 이용하면 컴퓨 기억해야할 것들이 많아짐 == 코드 보는게 굉장히 힘들어짐
			 */
		}

		System.out.println("----- 로그인 ------");
		System.out.print("아이디 : ");
		String id = InputUtil.sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = InputUtil.sc.nextLine();

		try {
			MemberVo vo = new MemberDao().login(id, pwd);
			if (vo != null) {
				System.out.println("로그인 성공 !!! \n\n");
				Main.loginMember = vo; // 메인에 있는 로그인 멤버한테 vo 집어넣어 주는 코드!
			} else {
				System.out.println("로그인 실패 \\n\\n");
			}
		} catch (Exception e) {
			// 로그인 실패
			System.out.println("[Error] 로그인 실패 \\n\\n");
			e.printStackTrace();
		}

	}
}
