package employee;

public class Employee {
	
	public void welcomeEmployee() {
		System.out.println("[ " + nick +"  ������� ���� ���͵� �п� �Դϴ�. ]"
				+ "\n["+ nick +" ȸ����� ���� ��Ź�帳�ϴ� ~~! ]");
	}
	
	
	
	private String nick;

	public Employee(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	

}
