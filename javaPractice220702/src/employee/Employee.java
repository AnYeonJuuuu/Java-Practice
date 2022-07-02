package employee;

public class Employee {
	
	public void welcomeEmployee() {
		System.out.println("======= 어서오세요 종합 스터디 학원 입니다. ========");
		
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
