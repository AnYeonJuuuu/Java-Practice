package iopractice;

public class TryCatch {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=0;
		try {
			int c=a/b;
			System.out.println(c);	//���ܹ߻����� ���� �Ұ��� �ڵ�
		}catch(ArithmeticException e) {
			System.out.println("���ܹ߻�!!!");
			System.out.println("0���� ������ �Ұ�!!!");
			e.printStackTrace();
		}finally {
			System.out.println("finally�� ������ ����");
		}
	
	}

}
