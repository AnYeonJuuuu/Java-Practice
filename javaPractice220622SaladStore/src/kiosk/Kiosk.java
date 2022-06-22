package kiosk;

import java.util.Scanner;

public class Kiosk {

	private Scanner sc = new Scanner(System.in);//현재 클래스에서만 스캐너 쓸 거니까
	
	//주문 쭉 받기
	/*public Order useKiosk() {
		boolean isTakeOut = checkTakeOut();
		int base = selectBase();
		int maintopping = selectMainTopping();
		int topping = selectTopping();
		int sourse = selectSourse();
		Order order = new Order(isTakeOut, base, maintopping, topping, sourse);
		return order;
	}*/
	
	
	//포장여부 묻기
	private boolean checkTakeOut() {
		System.out.println("포장하시겠습니까?");
		String result = sc.nextLine();
		
		if(result.equalsIgnoreCase("Y")) {
			return true;
		}else {
			return false;
		}
	
	}
	
	//도우 선택
	private int selectBase() {
		System.out.println("====== 샐러드 Base ======");
		System.out.println("1. 채소 ");
		System.out.println("2. 밥");
		System.out.println("3. 토마토");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	
	//메인 토핑
	private int selectMainTopping() {
		System.out.println("====== 메인 토핑 ======");
		System.out.println("1. 고기");
		System.out.println("2. 연어");
		System.out.println("3. 참치");
		System.out.println("4. 콩고기 ");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
		
	}
	
	//토핑
	private int selectTopping() {
		System.out.println("====== 토핑 ======");
		System.out.println("1. 치즈 ");
		System.out.println("2. 옥수수 ");
		System.out.println("3. 토마토 ");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
		
		
	}
	
	private int selectSourse() {
		System.out.println("====== 토핑 ======");
		System.out.println("1. 케찹 ");
		System.out.println("2. 마요 ");
		System.out.println("3. 스윗BBQ ");
	
		String result = sc.nextLine();
		return Integer.parseInt(result);
		
		
	}
	
}
