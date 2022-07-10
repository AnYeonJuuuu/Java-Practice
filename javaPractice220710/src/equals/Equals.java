package equals;

public class Equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	} // main
} 

class Value {
	int value;

	Value(int value) {
		this.value = value;
	} // 코드 여기까지만 입력하면 "다릅니다" 출력
	
	//object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교.
	public boolean equals(Object obj) {
//		return this==obj; // 주소 비교. 서로 다른 객체는 항상 거짓
		// 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함.
		if(!(obj instanceof Value)) 
			return false;
		
		Value v = (Value)obj; 
		//obj를 value로 형변환(왜? obj에는 value 없으므로 형변환 하여 만들어줘야함)
		
		return this.value==v.value;
	}
	
	
	
}

