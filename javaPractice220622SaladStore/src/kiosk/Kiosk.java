package kiosk;

import java.util.Scanner;

import base.Normal;
import base.Rice;
import base.Tomato;
import main.Topping.Meat;
import main.Topping.Salmon;
import main.Topping.TVP;
import main.Topping.Tuna;
import menu.Menu;
import order.Order;
import topping.Cheese;
import topping.Corn;

public class Kiosk {

	private Scanner sc = new Scanner(System.in);//현재 클래스에서만 스캐너 쓸 거니까
	
	//주문 쭉 받기
	public Order useKiosk() {
		boolean isTakeOut = checkTakeOut();
		int base = selectBase();
		int maintopping = selectMainTopping();
		int topping = selectTopping();
		int sourse = selectSourse();
		int price = 0;
		int time = 0; 
		Order order = new Order(isTakeOut, base, maintopping, topping, sourse,price,time);
		return order;
	}
	
	public void calc(Order o) {
		calcBase(o);
		calcMainTopping(o);
		calcTopping(o);
	}
	
	private void calcTopping(Order o) {
		int topping = o.getTopping();
		if(topping == 1) {
			Menu m = new Cheese();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}else if(topping == 2) {
			Menu m = new Corn();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}else if(topping == 3) {
			Menu m = new Tomato();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}
	}

	

	private void calcMainTopping(Order o) {
		int maintopping = o.getMaintopping();
		if(maintopping == 1) {
			Menu m = new Meat();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}else if(maintopping == 2) {
			Menu m = new Salmon();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}else if(maintopping == 3) {
			Menu m = new Tuna();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}else if(maintopping == 4) {
			Menu m = new TVP();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}
	}

	private void calcBase(Order o) {
		// TODO Auto-generated method stub
		int base = o.getBase();
		if(base == 1) {
			Menu m = new Normal();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}else if(base == 2) {
			Menu m = new Rice();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}else if(base == 3) {
			Menu m = new Tomato();
			o.addPrice(m.getPrice());	
			o.addTime(m.getTime());
		}
	}

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
