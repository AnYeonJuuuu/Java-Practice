package cafe.main;

import cafe.emp.CookEmp;
import cafe.emp.CounterEmp;

public class CafeMain {

	public static void main(String[] args) {

		CounterEmp counter01 = new CounterEmp();
		
		counter01.cfname = "����ī��";
		counter01.nick = "ö��";
		counter01.salary = 11000;
		
		CookEmp cook01 = new CookEmp();
		cook01.nick = "����";
		cook01.salary = 14000;
		
		counter01.welcome();
		counter01.showMenu();
		
		//ī�� �޴� �����غ���
		int a = counter01.scanUserNum();
		
		counter01.priceQ(a);
		
		counter01.order();
		
		cook01.cook();
		}
		
	}


