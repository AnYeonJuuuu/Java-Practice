package eventstart;

import java.util.Scanner;

public class EventStart {
	
	//ó�� ��Ʈ
	public void welcome() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! ���� �Բ��� �Ĺ� ã�� !! =====\n** �̺�Ʈ ��, ���� ������ ���� �Ϸ� �� 100% ��ǰ�� �帳�ϴ� **");
		System.out.println(" >>> �α��� : 1�� �Է� "
				+ "\n >>> ȸ������ : 0�� �Է�");
	}

	//�α���(���̵�, ��й�ȣ �Է�
//	)
	public void login() {
		Scanner sc = new Scanner(System.in);
		
		int s;
		s = sc.nextInt();
		
		String ID;
		
		for(int x = 0; x<1 ;x++)  {
			
		if(s == 1 ) {
				System.out.println("ID�� �Է����ּ���(�ѱ� �Ǵ� �������� �Է����ּ���.)");
				ID = sc.nextLine();
				sc.nextLine();//nextLine()�� Line���� �ޱ�!!
				break;  } 
		
		if (s == 0) {
			System.out.println("ȸ������ â���� �̵��մϴ�.");
				continue;	}
		}
			
		for(;;) {
			if(s == 1) {System.out.println("����й�ȣ�� �Է����ּ�����(��й�ȣ == 112)");}
			int pw = sc.nextInt();
			
		if( pw == 112 ) {
			
			System.out.println("�α����� �Ϸ�Ǿ����ϴ� ^o^");
			break;
			}else {
				System.out.println("Ʋ�� ��й�ȣ �Դϴ�. ��й�ȣ�� �ٽ� �Է����ּ���.");
			}continue;
		}
	}
	
	
	
	
}//class
