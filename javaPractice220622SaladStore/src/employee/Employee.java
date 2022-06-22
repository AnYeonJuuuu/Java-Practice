package employee;

public class Employee {

	public Employee(String nick) {
		this.nick = nick;
	}
	
	private String nick;
	
	public void saywelcome() {
		System.out.println(nick + "환영합니다~^^ 싱싱샐러드 입니다.");
		System.out.println(nick +"키오스크로 가셔서 주문해주세요 ~");
		System.out.println(" ");
		System.out.println(" >> 키오스크로 도착 <<");
	}
	
}
