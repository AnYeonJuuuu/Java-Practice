package exception;

public class TestException {

	public void test01() throws Exception { // e를 나를 불렀던 곳에 던짐
		System.out.println("test01 called...");
		test02(); //e throw
		System.out.println("test01 end...");
	}
	
	public void test02() throws Exception {
		System.out.println("test02 called...");
		test03();
		System.out.println("test02 end...");
	} //메소드 종료되면 불렀던 곳으로 다시 돌아감
	
	public void test03() throws Exception { 
		System.out.println("test03 called...");
		throw new PokemonException("zzzzzz");
		// 예외 상황이 발생하지 않아도 내가 만든 예외 객체를 던져버려야 함!
		// 내가 원하는 예외 가능 : ArrayIndexOutOfBound ...
		
//		System.out.println("test03 end...");
	} //메소드 종료되면 불렀던 곳으로 다시 돌아감
	
}
