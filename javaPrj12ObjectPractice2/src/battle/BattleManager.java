package battle;

import mob.Pockemon;

public class BattleManager {

	public void battleStart(Pockemon user,Pockemon enemy) {
		// 포켓몬 두 개 받아와서 작업
		// 순서 : 1 어택 - 2데미지 -2어택 -1데미지 - 무한반복
		
		boolean isFinish = false; //처음부터 true로 종료되면 안되므로!
		
		do {
			//공격하기
			user.attack();//어떤 객체에 접근해서 메소드 호출
			calcDamage(enemy, user);
			//배틀종료 여부 판단
			isFinish = checkDead(enemy);
			if(isFinish) {
				break;
			}
			//공격
			enemy.attack();
			calcDamage(user, enemy);
			//배틀종료 여부 판단
			isFinish = checkDead(user);
			
		}while(!isFinish);// 마지막 조건 판단 : isFinish가 아닐 때 반복해야하므로!!!
		
		System.out.println("배틀 종료^^*");
		
	}
	
	
	 
	//데미지 계산
	public void calcDamage(Pockemon defender, Pockemon attacker) {
		int result = defender.getHp()- attacker.getAtk();
		defender.setHp(result);//디펜더에 접근해서 setHp 찾아가서 result 값 전달해줘!
		System.out.println("데미지 : " + attacker.getAtk());
		System.out.println( defender.getName() +" 포켓몬의 남은 체력 : " + defender.getHp());
		System.out.println("------------------------");
	}
	
	//체력 0 이하인지 판단
	public boolean checkDead(Pockemon p) {
		if(p.getHp() <= 0) {
			System.out.println(p.getName() + "죽음");
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
