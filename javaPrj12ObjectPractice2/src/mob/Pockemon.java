package mob;

public class Pockemon {
	
	//생성자 호출을 해야 객체가 생성이 된다.
	public Pockemon() {
		System.out.println("포켓몬 생성자 호출 됨 ... ");
	}
	
	//( 모든 필드에 대한 )매개변수가 있는 생성자
	public Pockemon(String name, int hp, int atk) {
		System.out.println("매개변수가 있는 생성자 호출 됨 !! ");
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	//deta
	//이름 공격력 hp 
	private String name;
	private int atk;
	private int hp;
	
	
	//method
	//공격하기 회피하기 도망가기
	public void attack() {
		System.out.println(name + "공격!!!!!");
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
