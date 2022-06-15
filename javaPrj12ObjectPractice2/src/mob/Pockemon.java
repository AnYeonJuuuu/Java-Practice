package mob;

public class Pockemon {

	//deta
	//이름 공격력 hp 
	private String name;
	private int atk;
	private int hp;
	
	
	//method
	//공격하기 회피하기 도망가기
	public void attack() {
		System.out.println("공격!!!!!");
	}
	public void evade() {
		System.out.println("피함@@@");
	}public void giveUp() {
		System.out.println("도망가자ㅠㅠㅠ");
	}
	
	//deta의 getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	//toString
	@Override
	public String toString() {
		return "Pockemon [name = " + name + ", atk = " + atk + ", hp = " + hp + "]";
	}
	
	
	

	
	
	
}//c
