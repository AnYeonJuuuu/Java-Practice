package job;

import java.util.Scanner;

import member.Member;

public class Punip extends Member implements GoalSchool {

	public Punip() {
		
	}
	Scanner sc = new Scanner(System.in);

//	
//	public Punip(String name, char gender, int birth, int phone, String id, String pw) {
//		super(name, gender, birth, phone, id, pw);
//	}


//
//	public Punip(String name, char gender, int birth, int phone, String id, String pw, Scanner sc, String goalschool) {
//		super(name, gender, birth, phone, id, pw);
//		this.goalschool = goalschool;
//	}

	
	

	public void sameMager() throws SamMagerException {
		System.out.println("===== 같은 전공을 원하시면 Y, 타전공을 희망하시면 N 을 입력해주세요.(대소문자 구분 없음.) =====");
		String result = sc.nextLine();

			if(result.equalsIgnoreCase("y")) {
				System.out.println("동일전공 선택하셨습니다.");
			} else if(result.equalsIgnoreCase("n")) {
			System.out.println("타전공 선택하셨습니다.");}
			else{throw new SamMagerException("잘못입력하셨습니다. 다시 입력해주세요.\nY 또는 N를 입력하세요.(대소문자 구분 없음.)\n");}
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
		System.out.println("1순위" + fir +"2순위"+ sec + "3순위" + thr);
		
	}

}
