package mob;

 public abstract class Digimon implements DigimonAction {

	//�����͵�
	private String name;
	private String type;
	
	
	@Override
	public String toString() {
		return "Digimon [ ���ϸ� = " + name + ", Ÿ�� = " + type + "]";
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
		System.out.println("���� �� ������~!!");
	}
	
}
