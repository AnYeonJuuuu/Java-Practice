package kiosk;

import java.util.Scanner;

public class Kiosk {

	private Scanner sc = new Scanner(System.in);//���� Ŭ���������� ��ĳ�� �� �Ŵϱ�
	
	//�ֹ� �� �ޱ�
	/*public Order useKiosk() {
		boolean isTakeOut = checkTakeOut();
		int base = selectBase();
		int maintopping = selectMainTopping();
		int topping = selectTopping();
		int sourse = selectSourse();
		Order order = new Order(isTakeOut, base, maintopping, topping, sourse);
		return order;
	}*/
	
	
	//���忩�� ����
	private boolean checkTakeOut() {
		System.out.println("�����Ͻðڽ��ϱ�?");
		String result = sc.nextLine();
		
		if(result.equalsIgnoreCase("Y")) {
			return true;
		}else {
			return false;
		}
	
	}
	
	//���� ����
	private int selectBase() {
		System.out.println("====== ������ Base ======");
		System.out.println("1. ä�� ");
		System.out.println("2. ��");
		System.out.println("3. �丶��");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	
	//���� ����
	private int selectMainTopping() {
		System.out.println("====== ���� ���� ======");
		System.out.println("1. ���");
		System.out.println("2. ����");
		System.out.println("3. ��ġ");
		System.out.println("4. ���� ");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
		
	}
	
	//����
	private int selectTopping() {
		System.out.println("====== ���� ======");
		System.out.println("1. ġ�� ");
		System.out.println("2. ������ ");
		System.out.println("3. �丶�� ");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
		
		
	}
	
	private int selectSourse() {
		System.out.println("====== ���� ======");
		System.out.println("1. ���� ");
		System.out.println("2. ���� ");
		System.out.println("3. ����BBQ ");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
		
		
	}
	
}
