package cafe.main;

import cafe.emp.CookEmp;
import cafe.emp.CounterEmp;

public class CafeMain {

	public static void main(String[] args) {

		CounterEmp counter01 = new CounterEmp();
		
		counter01.cfname = "매일카페";
		counter01.nick = "철수";
		counter01.salary = 11000;
		
		CookEmp cook01 = new CookEmp();
		cook01.nick = "영희";
		cook01.salary = 14000;
		
		counter01.welcome();
		counter01.showMenu();
		
		//카페 메뉴 선택해보기
		int a = counter01.scanUserNum();
		
		counter01.priceQ(a);
		
		counter01.order();
		
		cook01.cook();
		}
		
	}


