package class_Test;

public class Student {

	public String name;
	public int age;
	public double height;
	
	 public Student() {
		 
	 }
	//생성자
	public Student(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void PrintStudentInfo() {
		System.out.println("이름 : " + name + " ");
		System.out.println("나이 : " + age + " ");
		System.out.println("키 : " + height + " ");
	}
	

}
