package main;

import battlemanager.BattleManager;
import gamemanager.GameManager;
import mob.Poketmon;

public class Main {

	public static void main(String[] args) {

		Poketmon p1 = new Poketmon();
		p1.setName("피카츄");
		p1.setHp(100);
		p1.setAtk(30);
		
		Poketmon p2 = new Poketmon();
		p2.setName("파이리");
		p2.setHp(100);
		p2.setAtk(25);
		
		//게임시작
		GameManager gm = new GameManager();
		gm.gamestart(p1, p2);
		
		//배틀시작
		BattleManager bm = new BattleManager();
		bm.battleStart(p1, p2);
		
	}

}
