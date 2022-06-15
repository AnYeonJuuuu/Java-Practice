package battlemanager;

import mob.Poketmon;

public class BattleManager {

	// ���ϸ� �� �� �޾ƿͼ� �۾�
	// ���� : 1 ���� - 2������ -2���� -1������ - ���ѹݺ� �ǵ��� �����
	public void battleStart(Poketmon user, Poketmon enemy) {
		
		boolean isFinish = false;
		
	do {
		user.attack(); //���� ����
		calcDamage(enemy, user);
		isFinish = checkDead(enemy);
		
		enemy.attack(); // ����� ����
		calcDamage(user, enemy);
		isFinish = checkDead(user);
		}while(!isFinish);
	
		System.out.println("Game Over==");
		
	}

	//������ ���
	public void calcDamage(Poketmon defender, Poketmon attacker) {
		int result = defender.getHp() - attacker.getAtk();
		defender.setHp(result);
	}
	
	// ��Ʋ ���� ���� �Ǵ�!!
	public boolean checkDead(Poketmon p) {
		if(p.getHp() <= 0) {
			System.out.println(p.getName()+"����!!");
			return true;
		}else {
			return false;
		}
	}
	
	
}//�Ѥ�


