package cafe.emp;

import java.util.Scanner;

public class CounterEmp {

	public String cfname; // �߰� ����
	public String nick;
	public int salary;
	
	public void welcome() { //�޼��� ����
		System.out.println("�������!!!!");
		System.out.println();
		System.out.println(cfname+" "+ nick + "�Դϴ�.");
		System.out.println();
	}
	
	public void showMenu() {
		System.out.println("�޴��� Ȯ�����ּ���!!");
	}
	
	public int scanUserNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: �ƾƸ� or 2: ���� ����");
		int a = sc.nextInt();
		
		return a;
		
	}
	
	public void priceQ(int a) {
		
		
		
		if(a == 1) {
			System.out.println("�ƾƸ� 4400�� �Դϴ�.");
			
		}else if(a == 2) {
			System.out.println("���� 5500�� �Դϴ�.");}
			
		
	}
	
	
	public void order() {
		System.out.println("�ֹ� �Ϸ� �Ǿ����ϴ�");
	}
	
	
	
	
	
}
