package sersatisfaction;

import java.util.Scanner;

public class SerSatisfaction {

	Scanner sc = new Scanner(System.in);
	public SerSatisfaction() {
		
	}

	
	// �Ű������� �ִ� ������
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
		return "������ ���� ��� [ ��̼� :: " + fun + ", ������ :: " + form + ", ��Ȯ�� :: " + acc + "]";
	}
	
	public void Score() {
		int[] ser = new int[4];
		for(int p = 1; p<4; p++) {
			if(p==1) {
			System.out.println("("+p+")"+"�� ��̼� ������ �Է����ּ���.");
			} else if(p==2) {
			System.out.println("("+p+")"+"�� ������ ������ �Է����ּ���.");
			}else if(p==3) {
				System.out.println("("+p+")"+"�� ��Ȯ�� ������ �Է����ּ���.");
				}
			ser[p] = sc.nextInt();
		}
		
		SerSatisfaction ssf = new SerSatisfaction(ser[1],ser[2],ser[3]);
		System.out.println(ssf);//toString �� ���!!(�򰥸�)
		
		int t;
		int l = 0;
		for( t = 1; t < 4; t++) {
			
			if( l < ser[t]) {
				l = ser[t];
			}
		}
			System.out.println("�ְ��� :: << "+ l + "�� >> " +"������ �򰡿� �������ּż� �����մϴ� ^o^");
		
	}
	
	
	
	
}//c
