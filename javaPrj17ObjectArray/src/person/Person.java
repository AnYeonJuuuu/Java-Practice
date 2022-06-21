package person;

public class Person {
	
	public Person(String name,String hometown, int age, char gender) {
		this.name = name;
		this.hometown = hometown;
		this.age = age;
		this.gender = gender;		
	}
	
	
	//데이터
	private String name;
	private String hometown;
	private int age;
	private char gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", hometown=" + hometown + ", age=" + age + ", gender=" + gender + "]";
	}

	//메소드
	public void goHome() {
		System.out.println("집에가기!!");
	}
	
	public void study() {
		System.out.println("공부하자~");
		}
	public void workout() {
		System.out.println("운동 고고!!");
	}
	

}
