package employee;

public class Employee {

	public Employee(String nick) {
		this.nick = nick;
	}
	
	private String nick;
	
	public void saywelcome() {
		System.out.println(nick + "ȯ���մϴ�~^^ �̻̽����� �Դϴ�.");
		System.out.println(nick +"Ű����ũ�� ���ż� �ֹ����ּ��� ~");
		System.out.println(" ");
		System.out.println(" >> Ű����ũ�� ���� <<");
	}
	
}
