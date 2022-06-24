package test;

public class ApiTest {
  
	public void test01() {
		String str = "Hello world";
		
		//charAt : 특정 인덱스의 ‘문자’ 리턴
//		char result = str.charAt(0);
		
		//compareTo : 사전순으로 비교
//		int result = str.compareTo("Hello world");
		
		//concat : 자주 이용함!
//		String result = str.concat("zzz");
		
		//substring() : 메소드 오버로딩 인덱스 이용해서 문자열 자름,
//		String result = str.substring(3);
		//(3) == 3번 인덱스부터 쭉 출력
		//(3,7) == 3번부터 7번 인덱스 전 까지 출력(3번 이상 7번 미만, 3<= "값" < 7)
		
		//lowercase
		String result = str.toUpperCase();
		
		System.out.println(result);
	}
	
	public void test02() {
		//StringBuilder, StringBuffer
//		StringBuilder sb = new StringBuilder();
//		sb.append("zz");
//		sb.append("abc");
//		System.out.println(sb);
		
		StringBuffer sb = new StringBuffer();
		sb.append("zz");
		sb.append("abc");
		System.out.println(sb);
	}
	
	public void test03() {
		//Math
		
		int result = Math.abs(-77);
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
