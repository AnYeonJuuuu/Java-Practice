

import java.util.Random;
import java.util.Scanner;

import eventstart.EventStart;
import selectPlant.SelectPlant;
import sersatisfaction.SerSatisfaction;

public class MainOrigin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		EventStart es = new EventStart(); //EventStartŬ������ welcome�޼ҵ� �ҷ�����
//		es.welcome();
//		
//
//		int sr = sc.nextInt();//ȸ������ or ���̵� �Է� ���� ��� 
//		es.login(sr);
//	
//		SelectPlant sp = new SelectPlant();
//		sp.recostart();//�Ĺ� ��õ ���۸�Ʈ
//
//		int i = sc.nextInt();
//		sp.selrecomm(i);// �Ĺ� ��õ ���α׷�
		
		es.Satiwelcom(); //������ ���� ��Ʈ
		
		SerSatisfaction ssf = new SerSatisfaction();
		ssf.Score();
			
//			int[] ser = new int[4];
//			for(int p = 1; p<4; p++) {
//				if(p==1) {
//				System.out.println("("+p+")"+"�� ��̼� ������ �Է����ּ���.");
//				} else if(p==2) {
//				System.out.println("("+p+")"+"�� ������ ������ �Է����ּ���.");
//				}else if(p==3) {
//					System.out.println("("+p+")"+"�� ��Ȯ�� ������ �Է����ּ���.");
//					}
//				ser[p] = sc.nextInt();
//			}
//			
//			
//			SerSatisfaction ssf = new SerSatisfaction(ser[1],ser[2],ser[3]);
//			System.out.println(ssf);
			
//			ser[1] = f;
//			ser[2] = c;
//			ser[3] = fo;
//			int t;
//			int l = 0;
//			for( t = 1; t < 4; t++) {
//				
//				if( l < ser[t]) {
//					l = ser[t];
//				}
//			}
//				System.out.println("�ְ��� :: << "+ l + "�� >> " +"������ �򰡿� �������ּż� �����մϴ� ^o^");

			// ���� �� �κп��� �ְ����� �׸��� �Է��ϰ� �;���!
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
	
			
				
				
				
		
				
				
		
		
		
		
	


