package eventstart;

import java.util.Scanner;

public class EventStart {
	Scanner sc = new Scanner(System.in);
	
	//처음 멘트
	public void welcome() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! 나와 함께 할 식물 찾기 !! =====\n** 이벤트 후, 서비스 만족도 조사 완료 시 100% 경품을 드립니다 **");
		System.out.println(" >>> 로그인 : 1번 입력 "
				+ "\n >>> 회원가입 : 0번 입력");
	}

	//로그인(아이디, 비밀번호 입력)
	public void login() {
		
		int sr = sc.nextInt();
		
		String ID;
		
		for(int x=0; x<1;x++)  { //여러 번 반복하고 싶었는데 구현 못함!
			
			if (sr == 0) {
				System.out.println("회원가입 창으로 이동합니다.");
				int join = sc.nextInt();
				continue;	}
			else if( sr == 1 ) {
					System.out.println("ID을 입력해주세요(한글 또는 영문으로 입력해주세요.)");
					ID = sc.nextLine();
					sc.nextLine();
					;
					  } 
		
		
			
		for(;;) {
			if(sr == 1) {System.out.println("↓↓비밀번호를 입력해주세요↓↓(비밀번호 == 112)");}
			int pw = sc.nextInt();
		if( pw == 112 ) {
			
			System.out.println("로그인이 완료되었습니다 ^o^");
			break;
			}else {
				System.out.println("틀린 비밀번호 입니다. 비밀번호를 다시 입력해주세요.");
				continue;
			}
		}
		
		}
	}

	public void Satiwelcom() {
		System.out.println();
		
		System.out.println("===== 서비스 만족도 조사 후 경품을 증정해드립니다. =====");
		// 배열 이용해서 서비스 만족도 조사하기((수업 시간 내용 및 검색 다수 이용!!!! 어렵!!))
		System.out.println("\"(1) 흥미성 (2) 구성도 (3) 정확성 \" 점수를 입력해주세요.");
	}
	
	
}//class
