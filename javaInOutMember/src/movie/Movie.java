package movie;

public class Movie {
	private String name;
	private char gender;
	private int birth;
	private int phone;
	private String id;
	private String pw;

	// toString
	@Override

	public String toString() {
		return "[ ȸ�� ���� Ȯ�� ] " + "\n ���̵� : " + id + "\n �̸� : " + name + "\n ���� : " + gender + "\n ������� : " + birth
				+ "\n ��ȭ��ȣ : " + phone;
	}

	// ������
//	public void Member(String name, char gender, int birth, int phone, String id, String pw) {
//		super();
//		this.name = name;
//		this.gender = gender;
//		this.birth = birth;
//		this.phone = phone;
//		this.id = id;
//		this.pw = pw;}

	// ���ͼ���
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
