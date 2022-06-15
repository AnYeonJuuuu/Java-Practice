package eventstart;

import java.util.Scanner;

public class EventStart {
	
	public void welcome() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! 나와 함께할 식물 찾기 !! =====\n** 이벤트 후 만족도 조사 완료 시 100% 경품을 드립니다 **");
		System.out.println(" >>> 로그인 : 1번 입력 "
				+ "\n >>> 회원가입 : 0번 입력");
	}

}
