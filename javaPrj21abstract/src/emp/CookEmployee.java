package emp;

public class CookEmployee extends Employee{
 
	//
	
	//
	public void cook() {
		System.out.println("요리 함 ~~~");
	}
	
	@Override
	public void clean() {
		System.out.println("주방 청소 ... ");
	}
	
}
