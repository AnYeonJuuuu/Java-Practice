package member;

public class Member {
	
	public Member() {
		
	}
	
	// 공통적으로 회원가입에 필요한 이름, 성별, 생년월일, 전화번호, 아이디(중복확인),비밀번호 
	private String name;
	private char gender;
	private int birth;
	private int phone;
	private String id;
	private String pw;
	
	//toString
	@Override
	public String toString() {
		return "member [name=" + name + ", gender=" + gender + ", birth=" + birth + ", phone=" + phone + ", id=" + id
				+ ", pw=" + pw + "]";
	}
	
	//생성자
	public Member(String name, char gender, int birth, int phone, String id, String pw) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.phone = phone;
		this.id = id;
		this.pw = pw;
	}
	
	//게터세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
