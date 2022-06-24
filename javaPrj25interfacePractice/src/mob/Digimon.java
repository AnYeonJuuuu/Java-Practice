package mob;

public abstract class Digimon implements DigimonAction { //그냥 디지몬이라는 것이 만들어지면 안되므로

	//안에 void attack(); void skill(); 들어있음!! 
	//오버라이드 안 하는 이유? 이 클래스가 추상 클래스이기 때문에 객체로 여기서 만들어질 일이 없음!!
	//따라서 굳이, 오버라이드 할 이유가 없음!
	
	//데이터
	protected String name;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Digimon [name=" + name + ", type=" + type + "]";
	}
	
	public void sayHello() {
		System.out.println("나는 디지몬이야 ㅎㅎ");
	}
	
}
