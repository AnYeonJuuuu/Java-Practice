package employee;

public class Employee {
	
	public void welcomeEmployee() {
		System.out.println("[ " + nick +"  어서오세요 종합 스터디 학원 입니다. ]"
				+ "\n["+ nick +" 회원등록 먼저 부탁드립니다 ~~! ]");
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
