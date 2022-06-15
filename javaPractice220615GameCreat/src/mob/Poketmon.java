package mob;

public class Poketmon {

	//포켓몬 정보입력
	//1. private 데이터 입력
	private String name;
	private int atk;
	private int hp;
	
	//getter, setter 생성
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
		return "Poketmon [name=" + name + ", atk=" + atk + ", hp=" + hp + "]";
	}
	
	//method
	public void attack() {
		System.out.println("공격!!");
	}
	
	public void evade() {
		System.out.println("피함~~~~~~");
	}
	public void giveUp() {
		System.out.println("도망가자ㅠㅠㅠ");
	}
	
	
}
