package sersatisfaction;

import java.util.Scanner;

public class SerSatisfaction {

	Scanner sc = new Scanner(System.in);
	public SerSatisfaction() {
		
	}

	
	// 매개변수가 있는 생성자
	public SerSatisfaction(int fun, int form, int acc) { 
		this.fun = fun;
		this.form = form;
		this.acc = acc;
	}
	
	private int fun;
	private int form;
	private int acc; 
	
	public int getFun() {
		return fun;
	}
	public void setFun(int fun) {
		this.fun = fun;
	}
	public int getForm() {
		return form;
	}
	public void setForm(int form) {
		this.form = form;
	}
	public int getAcc() {
		return acc;
	}
	public void setAcc(int acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "만족도 점수 결과 [ 흥미성 :: " + fun + ", 구성도 :: " + form + ", 정확성 :: " + acc + "]";
	}
	
	public void Score() {
		int[] ser = new int[4];
		for(int p = 1; p<4; p++) {
			if(p==1) {
			System.out.println("("+p+")"+"번 흥미성 점수를 입력해주세요.");
			} else if(p==2) {
			System.out.println("("+p+")"+"번 구성도 점수를 입력해주세요.");
			}else if(p==3) {
				System.out.println("("+p+")"+"번 정확성 점수를 입력해주세요.");
				}
			ser[p] = sc.nextInt();
		}
		
		SerSatisfaction ssf = new SerSatisfaction(ser[1],ser[2],ser[3]);
		System.out.println(ssf);
	}
	
	
	
	
}//c
