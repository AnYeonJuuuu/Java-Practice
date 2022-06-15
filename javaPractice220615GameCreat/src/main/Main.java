package main;

import battlemanager.BattleManager;
import gamemanager.GameManager;
import mob.Poketmon;

public class Main {

	public static void main(String[] args) {

		Poketmon p1 = new Poketmon();
		p1.setName("��ī��");
		p1.setHp(100);
		p1.setAtk(30);
		
		Poketmon p2 = new Poketmon();
		p2.setName("���̸�");
		p2.setHp(100);
		p2.setAtk(25);
		
		//���ӽ���
		GameManager gm = new GameManager();
		gm.gamestart(p1, p2);
		
		//��Ʋ����
		BattleManager bm = new BattleManager();
		bm.battleStart(p1, p2);
		
	}

}
