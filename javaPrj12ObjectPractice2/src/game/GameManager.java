package game;

import mob.Pockemon;

public class GameManager {

	public void gameStart(Pockemon p1, Pockemon p2) { //파라미터 2개
		System.out.println("=== 포켓몬 게임 시작!!!! ===");
		System.out.println("당신의 포켓몬 정보 : ");
		System.out.println(p1); //자동으로 toString을 호출하기 때문에 객체 자체 입력 가능
		System.out.println("상대방 포켓몬 정보 : ");
		System.out.println(p2);
	}
	
	
	
	
}
