package menu;

import main.Main;
import util.InputUtil;

public class Menu {
	public int showMenu(){
		System.out.println("---- ���� �Դϴ�. -----");
		if(Main.loginMember != null) {
			//�α��� o
			System.out.println(Main.loginMember.getNick() + "�� ȯ���մϴ�.");
			System.out.println("3. �Խñ� �ۼ�");
			System.out.println("4. �Խñ� ��� ��ȸ");
		}else {
			//�α��� x
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. �Խñ� �ۼ�");
			System.out.println("4. �Խñ� ��� ��ȸ");
		}
		
		System.out.println("9. ���α׷� ����");
		
		return InputUtil.getInt();
	}



}//c


