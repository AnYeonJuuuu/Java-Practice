package equals;

public class Equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
	} // main
} 

class Value {
	int value;

	Value(int value) {
		this.value = value;
	} // �ڵ� ��������� �Է��ϸ� "�ٸ��ϴ�" ���
	
	//object�� equals()�� �������̵��ؼ� �ּҰ� �ƴ� value�� ��.
	public boolean equals(Object obj) {
//		return this==obj; // �ּ� ��. ���� �ٸ� ��ü�� �׻� ����
		// ���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���ؾ���.
		if(!(obj instanceof Value)) 
			return false;
		
		Value v = (Value)obj; 
		//obj�� value�� ����ȯ(��? obj���� value �����Ƿ� ����ȯ �Ͽ� ����������)
		
		return this.value==v.value;
	}
	
	
	
}
