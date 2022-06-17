package main;

import battle.BattleManager;
import game.GameManager;
import mob.Pockemon;

public class Main {

	public static void main(String[] args) {

		// 2개의 객체
		Pockemon p1 = new Pockemon("피카츄",100,30);
		
		Pockemon p2 = new Pockemon("파이리", 100,25);

		// 게임시작
		GameManager gm =new GameManager();
		gm.gameStart(p1,p2);// 인자 2개
		
		// 배틀시작
		BattleManager bm = new BattleManager();
		bm.battleStart(p1, p2);
		
		
		
	}

}
