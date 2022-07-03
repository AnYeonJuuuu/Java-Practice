package job;

import member.Member;

public class Gongmu3 extends Member {

	public Gongmu3() {
		
	}
	public Gongmu3(String name, char gender, int birth, int phone, String id, String pw,String goalkind) {
		super(name, gender, birth, phone, id, pw);
		this.goalkind = goalkind;
	}

	public String goalkind;

	@Override
	public String toString() {
		return "Gongmu [ Èñ¸Á Á÷±º =" + goalkind + "]";
	}

//	public Gongmu(String goalkind) {
//		super();
//		this.goalkind = goalkind;
//	}

	public String getGoalkind() {
		return goalkind;
	}

	public void setGoalkind(String goalkind) {
		this.goalkind = goalkind;
	}
}
