package inherent;

class Child extends Parent {
	public Child(int _age, String _name) {
		this.age = _age;
		this.name = _name; // ����� �޾ұ� ������ ����Ŭ������ ������ ���� Child Ŭ������ ��
		System.out.println("Child Constructor");
	}
	
	public void showInfo() {
		System.out.println("Child showInfo");
        super.showInfo();
	}
//	// �����ڷ� this�� ���� �ڽ��� ������ ȣ�� ����
//	public Child(int age, String name) {
//		this();
//		this.age = age;
//		this.name = name;
//		System.out.println("Child Constructor");
//	}

}