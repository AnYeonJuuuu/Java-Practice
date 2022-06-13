package main;

import java.util.Scanner;

public class GameController {

	public void printInfo() { //메소드 작성
		// 게임 안내
		System.out.println("===== UPDOWN 게임 =====");
		System.out.println("컴퓨터가 생각한 숫자 맞추면 이기는 게임");
		System.out.println("안내");
		System.out.println("어쩌구");
		System.out.println("저쩌구");
	}
	
	public int scanUserNum() {
		//사용자로부터 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요!");
		int user = sc.nextInt();
		return user;
	}
	
	
	public boolean judge(int u, int c, int cnt) { 
		// 숫자 3개 받아올 것!(user, computer, 반복횟수)
		//입력받은 결과 판단하고 출력문 실행 ****중요!!!!!!
		if(u > c) {
			System.out.println("down");
			return false;
		}else if(u < c) {
			System.out.println("up");
			return false;
		}else {
			System.out.println("정답!!");
			System.out.println("시도횟수 : "+ cnt);
			//원래 여기서 브레이크 써야 하는데, 적용이 안되므로
			return true; // boolean 타입을 이용해서 T or F로 종료 여부 선택
		}
	}
	
	
}






