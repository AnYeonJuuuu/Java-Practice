package array;

public class ArrayTest {

	public void test() { //�޼��� ����
		
		//�迭 ����
		int[] intArr;
		intArr = new int[3]; // �迭 �����Ͽ� �Ҵ�
		
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
	}
	
	public void test2() {
		int[] a = new int[3];
		
		for(int i = 0; i< a.length; i++) {
			
			a[i] = 10;
		}
		
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
			
		}
	}
	
		public void test3() {
			long[] longArr = new long[3];
			double[] doubleArr = new double[3];
			boolean[] boolArr = new boolean[3];
			String[] strArr = new String[3];
			
			System.out.println(longArr  +" : longArr");
			System.out.println(doubleArr);
			System.out.println(boolArr);
			System.out.println(strArr);
		}
	
	
	
	
	
	
	
	 
	}
