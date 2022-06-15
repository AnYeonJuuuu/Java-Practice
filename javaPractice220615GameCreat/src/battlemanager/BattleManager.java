package battlemanager;

import mob.Poketmon;

public class BattleManager {

	// 포켓몬 두 개 받아와서 작업
	// 순서 : 1 어택 - 2데미지 -2어택 -1데미지 - 무한반복 되도록 만들기
	public void battleStart(Poketmon user, Poketmon enemy) {
		
		boolean isFinish = false;
		
	do {
		user.attack(); //유저 공격
		calcDamage(enemy, user);
		isFinish = checkDead(enemy);
		
		enemy.attack(); // 상대편 공격
		calcDamage(user, enemy);
		isFinish = checkDead(user);
		}while(!isFinish);
	
		System.out.println("Game Over==");
		
	}

	//데미지 계산
	public void calcDamage(Poketmon defender, Poketmon attacker) {
		int result = defender.getHp() - attacker.getAtk();
		defender.setHp(result);
	}
	
	// 배틀 종료 여부 판단!!
	public boolean checkDead(Poketmon p) {
		if(p.getHp() <= 0) {
			System.out.println(p.getName()+"죽음!!");
			return true;
		}else {
			return false;
		}
	}
	
	
}//ㅡㅡ


