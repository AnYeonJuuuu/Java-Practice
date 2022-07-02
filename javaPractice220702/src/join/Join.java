package join;

import java.util.Scanner;

import member.Member;
public class Join {
	Scanner sc = new Scanner(System.in);

	public void firstJoin() {
		System.out.println(" 회원가입");
		
	}
	
	Member mb = new Member();
	public void mainJoin() {
		System.out.println("이름을 입력해주세요.");
		mb.setName(sc.nextLine());
		System.out.println("성별을 입력해주세요(M 또는 F 입력.)");
		mb.setGender(sc.nextLine().charAt(0));//한 글자만 입력 받고 싶을 땐 ".charAt"

	}
	
	
	public void endingJoin() {
		System.out.println("======= + name + 님의 합격을 기원합니다. ========");
		
	}
}
