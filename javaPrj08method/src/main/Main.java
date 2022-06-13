package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== method =====");
		
		/*
		 * <메소드>
		 * 
		 * [문법]
		 * 접근제한자 리턴타입 메소드명(파라미터1, 파라미터2, ...){실행내용}
		 * 
		 * 
		 */
		
		
//		int x = 100;
		
		MethodTest mt = new MethodTest();
//		mt.test01();//MethodTest 호출하기!!!
//		mt.test02();
//		mt.test03();
//		mt.gugu();
//		mt.printNum(x); // mt.printNum()에서 x값을 받을 수 있게 출력 해보기!!
//		mt.plusOne(10);
		
//		MethodReturnTest mrt = new MethodReturnTest();
//		int result = mrt.test01(); // 등호를 기준으로 오른쪽 먼저 실행
//		System.out.println(result);
		
		
//		MethodFuncTest mft = new MethodFuncTest();
//		int r = mft.testMethod(30); // () 안의 숫자가 mft에서 실행 됨!
//		System.out.println(r);//return 값을 출력!!
		
		
		MethodConsumeTest mct = new MethodConsumeTest();
//		mct.testMethod(10);
		mct.plus(10,40);
	}

}
