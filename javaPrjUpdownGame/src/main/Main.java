package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//게임 안내
		GameController gc = new GameController();
		gc.printInfo();
		
		//랜덤 숫자 만들기 1~50
		GameManager gm = new GameManager();
		int random = gm.getRandom();
		
		//시도한 횟수 체크 *******
		int cnt = 0;
	
		// 반복문으로 감싸주기
		while(true) {
		int user = gc.scanUserNum();
		cnt++;// 횟수 더해주는 것!
		
		//boolean isFinish로 정답 판단 후, 종료 여부 선택
		boolean isFinish = gc.judge(user, random, cnt); // 판단
		if(isFinish == true) {
			break;
		}
	}
		
		
		
	}

}
