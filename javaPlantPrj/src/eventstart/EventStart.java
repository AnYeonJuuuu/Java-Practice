package eventstart;

import java.util.Scanner;

public class EventStart {
	
	//처음 멘트
	public void welcome() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! 나와 함께할 식물 찾기 !! =====\n** 이벤트 후, 서비스 만족도 조사 완료 시 100% 경품을 드립니다 **");
		System.out.println(" >>> 로그인 : 1번 입력 "
				+ "\n >>> 회원가입 : 0번 입력");
	}

	//로그인(아이디, 비밀번호 입력
//	)
	public void login() {
		Scanner sc = new Scanner(System.in);
		
		int s;
		s = sc.nextInt();
		
		String ID;
		
		for(int x = 0; x<1 ;x++)  {
			
		if(s == 1 ) {
				System.out.println("ID을 입력해주세요(한글 또는 영문으로 입력해주세요.)");
				ID = sc.nextLine();
				sc.nextLine();//nextLine()은 Line으로 받기!!
				break;  } 
		
		if (s == 0) {
			System.out.println("회원가입 창으로 이동합니다.");
				continue;	}
		}
			
		for(;;) {
			if(s == 1) {System.out.println("↓↓비밀번호를 입력해주세요↓↓(비밀번호 == 112)");}
			int pw = sc.nextInt();
			
		if( pw == 112 ) {
			
			System.out.println("로그인이 완료되었습니다 ^o^");
			break;
			}else {
				System.out.println("틀린 비밀번호 입니다. 비밀번호를 다시 입력해주세요.");
			}continue;
		}
	}
	
	
	
	
}//class
