package main;

import java.util.Scanner;

public class GameController {

	public void printInfo() { // �޼ҵ� �ۼ�
		System.out.println("===== UP DOWN GAME START =====");
		System.out.println("��ǻ�Ͱ� ������ ���ڸ� user�� ���߸� ���� finish!!");
		System.out.println("�ȳ�~~~~~");
	}
	
	public int scanUserNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~50���� ���� �� �ϳ��� �Է����ּ���!! ");
		int user = sc.nextInt();
		return user;// �Է¹��� ������ �� main���� ������ ���ؼ�!!
		
	}
	
	public boolean judge(int u, int c, int cnt) {
		if(u > c) {
			System.out.println("Down");
			return false;
		}else if(u < c) {
			System.out.println("Up");
			return false;
		}else {
			System.out.println("�����Դϴ�!!");
			System.out.println("�õ�Ƚ�� : "+ cnt);
		} // ���� ���� �� break���� �ʿ������� mainâ�� for���� �����ϹǷ�
		return true; // ����Ÿ���� boolean���� �ٲ��ش�
		
	}
	
	
	
}
