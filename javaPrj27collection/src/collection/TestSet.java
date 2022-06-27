package collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public void testMethod() {
		// Set >> HashSet 해쉬 셋은 셋이라는 인터페이스 상속 받고 있음!!
		/*
		 * Set은 순서 없음!!
		 * 중복 불가능
		 * */
		new HashSet(); // << 일단 만들어주고!
		Set hs = new HashSet();
		
		// 값 넣기 >> set은 중복을 자동으로 없애버림
		hs.add("one");
		hs.add("twe");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		hs.add("one");
		hs.add(3.14);
		hs.add(100);
		hs.add(true);
		hs.add(false);
		
		// 사이즈 확인
		System.out.println(hs.size());
		
		//포함 여부 확인
		System.out.println(hs.contains("one"));
		
//		hs.clear();
		
		// 비어있는지 확인
		System.out.println(hs.isEmpty());
		
		// 원하는 특정 요소 삭제
		hs.remove("three");
		hs.remove(3.14);
		
		System.out.println("=============================");
		
		// 셋에서는 인덱스 이용 해서 값 꺼내오기는 불가
		// Set의 모든 요소 확인
		for( Object x : hs) { // 모~든 요소가 다 들어가야 하므로 Object
			System.out.println(x);
		}
		
		System.out.println("==================");
		//배열 형식으로 
		Object[] result = hs.toArray();
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		System.out.println(result[4]);
		
	}
	
}
