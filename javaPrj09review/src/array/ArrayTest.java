package array;

public class ArrayTest {
	
	byte[] bArr;
	
	public void test() {
		
		//배열 선언
		int[] intArr;
		intArr = new int[3]; //배열 생성하여 할당!
		
		intArr[0] =10;
		intArr[1] =20;
		intArr[2] =30;
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		
	}
	
	
//	public void test2() {
//		int[] a = new int[3];
//		
//		for(int i = 0; i< a.length; i++) {
//			
//			a[i] = 10;
//		}
//		
//		for(int i = 0; i< a.length; i++) {
//			System.out.println(a[i]);
//			
//		}
		
		public void test3() {
			long[] longArr = new long[3];
			double[] doubleArr = new double[3];
			boolean[] boolArr = new boolean[3];
			String[] strArr = new String[3];
			
			System.out.println(longArr);
			System.out.println(doubleArr);
			System.out.println(boolArr);
			System.out.println(strArr);
			
			
			System.out.println(bArr);
			
			}
		
		public void test4() {
			// 문자열 자체도 배열로 만들어서 호출 가능!!
			String[] strArr = new String[3];
			strArr[0] = "첫번째";
			strArr[1] = "두번째";
			strArr[2] = "세번째";
			System.out.println(strArr[0]);
			System.out.println(strArr[1]);
			System.out.println(strArr[2]);
		}
			
		public void test5() { //길이 출력
			int[] a = new int[3];
			int[] b = new int[10];
			int[] c = new int[30];
			
			System.out.println(a.length);
			System.out.println(b.length);
			System.out.println(c.length);
		}
		
	}
	
	
	
	

