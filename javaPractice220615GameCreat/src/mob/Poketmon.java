package mob;

public class Poketmon {

	//���ϸ� �����Է�
	//1. private ������ �Է�
	private String name;
	private int atk;
	private int hp;
	
	//getter, setter ����
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
		System.out.println("����!!");
	}
	
	public void evade() {
		System.out.println("����~~~~~~");
	}
	public void giveUp() {
		System.out.println("�������ڤФФ�");
	}
	
	
}
