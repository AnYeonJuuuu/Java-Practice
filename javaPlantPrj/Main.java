package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! ���� �Բ��� �Ĺ� ã�� !! =====\n** �̺�Ʈ �� ������ ���� �Ϸ� �� 100% ��ǰ�� �帳�ϴ� **");
		System.out.println(" >>> �α��� : 1�� �Է� "
				+ "\n >>> ȸ������ : 0�� �Է�");
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
		System.out.println();
		System.out.println("===== �Ĺ� ��õ �̺�Ʈ�� �����մϴ� =====");
		System.out.println("** (1)�� or (2)���� �� ������ ��� �׸��� ��ȣ�� �Է����ּ���!!");
		System.out.println();
		System.out.println("(1) �Ĺ� Ű����� ���̶���Ʈ�� ��!! ���� ���ƿ�!!^o^ \n(2) �Ĺ��� Ǫ��Ǫ�� ���� �����̶�� �����Ѵٸ�!!");
		System.out.println("��� �Ʒ��� ���� (1) �Ǵ� (2)�� �Է����ּ���. ���");
		
			int i = sc.nextInt(); // �� ����
			if(i == 1) {
				System.out.println("(1) ���� �Ĺ����� \"���̴��� ��\" � ���̵��� �ڽ��־��!! "
						+ "\n(2) ���� �Ĺ����� \"���̳ʽ� ��\" �ʺ��ڵ� �� Ű�� �� �ִ� �� ��õ���ּ���!!");
				System.out.println("��� �Ʒ��� ���� (1) �Ǵ� (2)�� �Է����ּ���. ���");
				
				int a = sc.nextInt(); // �Ĺ� ���̵�
				if(a==1) {
					System.out.println("����� �� Ű����� ���� :: \"ȣ����\" \"�ɺ���\" ��õ�帳�ϴ�^_~");
				}
				else if(a==2){ 
					System.out.println("�̷� �� Ű����� ���̴��� �� :: \"����Ƽ�ʸ�\" \"û��ȫ\" ��õ�帳�ϴ�^_~");}}
				
			else if(i == 2) {
				System.out.println("(1) ���� �͵� ������ Ű��鼭 ���� ���� �ִ� �Ĺ��� ���ƿ�!"
						+ "\n(2) �Ĺ� Ű��� �ʹ� ������� �����ϱ� ���� �Ĺ��� Ű������ �;��!");
				System.out.println("��� �Ʒ��� ���� (1) �Ǵ� (2)�� �Է����ּ���. ���");
				int b = sc.nextInt();
				if(b==1) {
					System.out.println("���� �츮 ���� ���� ���� :: \"�丶��\" \"�����\" ��õ�帳�ϴ�^_~");}
				else if (b==2){
					System.out.println("�̷� �Ĺ� Ű����� ��� :: \"����Ű\" \"���׶�\" ��õ�帳�ϴ�^_~");}}
				
			System.out.println();
			
			System.out.println("===== ���� ������ ���� �� ��ǰ�� �����ص帳�ϴ�. =====");
			// �迭 �̿��ؼ� ���� ������ �����ϱ�((���� �ð� ���� �� �˻� �ټ� �̿�!!!! ���!!))
			System.out.println("\"(1) ��̼� (2) ������ (3) ��Ȯ�� \" ������ �Է����ּ���.");
			int[] ser = new int[4];
			int w;
			int t;
			int l = 0;
			for( w = 1; w<=3; w++) {
				System.out.println("(" + w + ")"+ " ���� �Է� ���");
				
				 // �� �׸��� ���� ����
			 ser[w] = sc.nextInt();
			 
			}
			
			for( t = 0; t < 4; t++) {
				if( l < ser[t]) {
					l = ser[t];
				}
			}
			// ���� �� �κп��� �ְ����� �׸��� �Է��ϰ� �;���!
			System.out.println("�ְ��� :: << "+ l + "�� >> " +"������ �򰡿� �������ּż� �����մϴ� ^o^");
			System.out.println();
			System.out.println("===== 100% ��ǰ ��÷ �̺�Ʈ!!===== \n(1)~(5)�� �� ���ڸ� �Ʒ��� �Է����ּ���.\n(** ��ǰ�� �������� �����˴ϴ�.)");
			
			int b = sc.nextInt();
			Random rd = new Random(); // ��ü ����
			int p = rd.nextInt(5)+1;
			
			if(p == 1) {
				System.out.println("�����մϴ�! \"2�� ���ֵ� �����\"�� ��÷�Ǽ̽��ϴ�^.^");
			}else if(p == 2) {
				System.out.println("�����մϴ�! \"LG �Ĺ� ����\"�� ��÷�Ǽ̽��ϴ�^.^");
			}else if(p == 3) {
				System.out.println("�����մϴ�! \"�Ｚ ��Ÿ�Ϸ�\"�� ��÷�Ǽ̽��ϴ�^.^");
			}else if(p == 4) {
				System.out.println("�����մϴ�! \"�������� �����̿��\"�� ��÷�Ǽ̽��ϴ�^.^");
			}else if(p == 5) {
				System.out.println("�����մϴ�! \"�����Թ� 20m x 20m ��� �̿��\"�� ��÷�Ǽ̽��ϴ�^.^");
			}
			System.out.println();
			System.out.println("====== ���� �Բ��� �Ĺ� ã�⸦ �����մϴ�. �̿����ּż� �����մϴ�. ======");
		
			
			
			
	
			}
	

	}
	
			
				
				
				
		
				
				
		
		
		
		
	


