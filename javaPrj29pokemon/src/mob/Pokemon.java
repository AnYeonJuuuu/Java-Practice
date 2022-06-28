package mob;

public abstract class Pokemon {

	//생성자
	public Pokemon(String name, int atk, int def, int hp) {
		
		this.name = name;
		this.atk = atk; 
		this.def = def;
		this.hp = hp;
	}
 
	//데이터
	private String name;
	private int atk;
	private int def;
	private int hp;
	
	//추상 메소드로 구현 : 자식 클래스들은 무조건 이 메소드 상속 받아 구현해야함
	public abstract void bodyAttack(); 
		
	public abstract void skill();

	//getter setter
	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
