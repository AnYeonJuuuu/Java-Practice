package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! ���� �Բ��� �Ĺ� ã�� !! =====");
		System.out.println(" >>> �α��� : 1�� �Է� "
				+ "\n >>> ȸ������ : 0�� �Է�");
		int s;
		s = sc.nextInt();
		
		String ID;
		
		for(int x = 0; x<1 ;x++)  {
			
		if(s == 1 ) {
				System.out.println("ID�� �Է����ּ���");
				ID = sc.nextLine();
				sc.nextLine();//nextLine()�� Line���� �ޱ�!!
				break;  } 
		
		if (s == 0) {
			System.out.println("ȸ������ â���� �̵��մϴ�.");
				continue;	}
		}
			
		for(;;) {
			if(s == 1) {System.out.println("����й�ȣ�� �Է����ּ�����");}
			int pw = sc.nextInt();
			
		if( pw == 112 ) {
			
			System.out.println("�α����� �Ϸ�Ǿ����ϴ�");
			break;
			}else {
				System.out.println("Ʋ�� ��й�ȣ �Դϴ�. ��й�ȣ�� �ٽ� �Է����ּ���.");
			}continue;
		}
		System.out.println();
		System.out.println("===== �Ĺ� ��õ �̺�Ʈ�� �����մϴ� =====");
		
		
		
		
	}

}
