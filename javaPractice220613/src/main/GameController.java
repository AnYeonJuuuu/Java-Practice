package main;

import java.util.Scanner;

public class GameController {

	public void printInfo() { // 메소드 작성
		System.out.println("===== UP DOWN GAME START =====");
		System.out.println("컴퓨터가 생각한 숫자를 user가 맞추면 게임 finish!!");
		System.out.println("안내~~~~~");
	}
	
	public int scanUserNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~50까지 숫자 중 하나를 입력해주세요!! ");
		int user = sc.nextInt();
		return user;// 입력받은 유저의 값 main으로 보내기 위해서!!
		
	}
	
	public boolean judge(int u, int c, int cnt) {
		if(u > c) {
			System.out.println("Down");
			return false;
		}else if(u < c) {
			System.out.println("Up");
			return false;
		}else {
			System.out.println("정답입니다!!");
			System.out.println("시도횟수 : "+ cnt);
		} // 정답 나온 후 break문이 필요하지만 main창에 for문이 존재하므로
		return true; // 리턴타입을 boolean으로 바꿔준다
		
	}
	
	
	
}
