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
		System.out.println("목표 대학을 입력해주세요.(3개의 학교 입력.)");
		System.out.println("1순위"); 
		String fir = sc.nextLine();
		System.out.println("2순위");
		String sec = sc.nextLine();
		System.out.println("3순위");
		String thr = sc.nextLine();

		System.out.println("목표 대학 >> 1순위 : " + fir +" / 2순위 : "+ sec + " / 3순위 : " + thr);		
	}

}
