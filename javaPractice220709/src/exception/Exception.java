package exception;

public class Exception {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		 try{
             int k = divide(i, j);
             System.out.println(k);
         
         //divide ���� �� ������ try - catch ó��~
         }catch(IllegalArgumentException e){
             System.out.println("0���� ������ �ȵ˴ϴ�.");
         }           
     }

	public static int divide(int i, int j) {
		if (j == 0) {
			// IllegalArgumentException ��ü ����� ����.
			// new ���� throw�� �ش� ���ο��� �ͼ����� �߻��Ѵٴ� �ǹ�
			throw new IllegalArgumentException("0���� ���� �� �����.");
		}
		int k = i / j;
		return k;
	}
}
