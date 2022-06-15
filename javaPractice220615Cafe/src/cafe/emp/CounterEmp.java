package cafe.emp;

import java.util.Scanner;

public class CounterEmp {

	public String cfname; // 추가 생성
	public String nick;
	public int salary;
	
	public void welcome() { //메서드 생성
		System.out.println("어서오세요!!!!");
		System.out.println();
		System.out.println(cfname+" "+ nick + "입니다.");
		System.out.println();
	}
	
	public void showMenu() {
		System.out.println("메뉴판 확인해주세요!!");
	}
	
	public int scanUserNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: 아아메 or 2: 라테 선택");
		int a = sc.nextInt();
		
		return a;
		
	}
	
	public void priceQ(int a) {
		
		
		
		if(a == 1) {
			System.out.println("아아메 4400원 입니다.");
			
		}else if(a == 2) {
			System.out.println("라테 5500원 입니다.");}
			
		
	}
	
	
	public void order() {
		System.out.println("주문 완료 되었습니다");
	}
	
	
	
	
	
}
