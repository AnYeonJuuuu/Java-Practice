package mob;

 public abstract class Digimon implements DigimonAction {

	//데이터들
	private String name;
	private String type;
	
	
	@Override
	public String toString() {
		return "Digimon [ 포켓몬 = " + name + ", 타입 = " + type + "]";
	}
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
	
	public void sayHello() {
		System.out.println("하이 난 디지몬~!!");
	}
	
}
