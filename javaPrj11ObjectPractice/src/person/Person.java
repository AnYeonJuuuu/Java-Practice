package person;

public class Person {

	// 사람에 대한 클래스 만들기
	// 추상화 : 공통 속성 추출
	
	private String name;
	private String addr;
	private int birth;
	private char gender;
	private int age;
	
	//name
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//age
	public void setAge(int age) {
		if(this.age < age) {
			this.age = age;
		}
		
	}
	
	//나이 알려주는 메소드를 이용해서 age 값 입력 받을 수 있음!
	public int getAge(){
		return age; //실행 당시에는 age의 값!!만 들어오는 것임 age 자체가 아님
	}
	
	//주소
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr(){
		return addr; //실행 당시에는 age의 값!!만 들어오는 것임 age 자체가 아님
	}
	
	//생일
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getBirth(){
		return birth; //실행 당시에는 age의 값!!만 들어오는 것임 age 자체가 아님
	}
	
	//성별
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender(){
		return gender; //실행 당시에는 age의 값!!만 들어오는 것임 age 자체가 아님
	}
	
	
	
	
	
	
	
}
