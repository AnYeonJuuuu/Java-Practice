package job;

import java.util.Scanner;

import member.Member;
public class Jasu1 extends Member implements GoalSchool{
	Scanner sc = new Scanner(System.in);

	public Jasu1(){
		
	}
	public Jasu1(String name, char gender, int birth, int phone, String id, String pw) {
		super(name, gender, birth, phone, id, pw);
	} 
	 
	@Override
	public void goalSchool() {
		System.out.println("��ǥ ������ �Է����ּ���.(3���� �б� �Է�.)");
		System.out.println("1����"); 
		String fir = sc.nextLine();
		System.out.println("2����");
		String sec = sc.nextLine();
		System.out.println("3����");
		String thr = sc.nextLine();

		System.out.println("��ǥ ���� >> 1���� : " + fir +" / 2���� : "+ sec + " / 3���� : " + thr);		
	}

}
