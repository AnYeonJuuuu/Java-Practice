package main;

import array.ArrayTest;
import operator.OperTest;
import print.PrintTest; //print 패키지에 있는 PrintTest 클래스 이용하겠다!
import variable.VarTest;
import bool.BoooleanTest;

public class Run {

	public static void main(String[] args) {

		System.out.println("===== review =====");
		
		// 에러 뜨는 이유 PT와 런이 다른 패키지에 있기 때문!
		PrintTest pt = new PrintTest();
		pt.test();
		
		VarTest vt = new VarTest();
		vt.test();
		
		OperTest ot = new OperTest();
		ot.test();
		
		ArrayTest at = new ArrayTest();
		at.test();
//		at.test2();
		at.test3();
		at.test4();
		
		at.test5();
		
		BoooleanTest bt = new BoooleanTest();
		bt.test();
		
		
	}

}
