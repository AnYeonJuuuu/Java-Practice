package class_Test;

public class Student {

	public String name;
	public int age;
	public double height;
	
	 public Student() {
		 
	 }
	//������
	public Student(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void PrintStudentInfo() {
		System.out.println("�̸� : " + name + " ");
		System.out.println("���� : " + age + " ");
		System.out.println("Ű : " + height + " ");
	}
	

}
