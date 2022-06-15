package main;

import battle.BattleManager;
import game.GameManager;
import mob.Pockemon;

public class Main {

	public static void main(String[] args) {

		// 2개의 객체
		Pockemon p1 = new Pockemon();
		p1.setName("피카츄");
		p1.setHp(100);
		p1.setAtk(30);
		
		Pockemon p2 = new Pockemon();
		p2.setName("파이리");
		p2.setHp(100);
		p2.setAtk(25);
		
		// 게임시작
		GameManager gm =new GameManager();
		gm.gameStart(p1,p2);// 인자 2개
		
		// 배틀시작
		BattleManager bm = new BattleManager();
		bm.battleStart(p1, p2);
		
		
		
	}

}
