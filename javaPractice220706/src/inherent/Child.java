package inherent;

class Child extends Parent {
	public Child(int _age, String _name) {
		this.age = _age;
		this.name = _name; // 상속을 받았기 때문에 슈퍼클래스의 변수도 이제 Child 클래스의 것
		System.out.println("Child Constructor");
	}
	
	public void showInfo() {
		System.out.println("Child showInfo");
        super.showInfo();
	}
//	// 생성자로 this를 통해 자신의 생성자 호출 가ㅇ
//	public Child(int age, String name) {
//		this();
//		this.age = age;
//		this.name = name;
//		System.out.println("Child Constructor");
//	}

}