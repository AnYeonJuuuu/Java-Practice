package practice;

import java.util.HashSet;
import java.util.Set;

public class Practice {

	public void test() {
		Set<String> set = new HashSet<>();
		set.add("chicken");
		set.add("pizza");
		set.add("hamberger");
		set.add("pasta");
		 
		//향상된 for문 : set의 모든 요소 꺼내기
		for(Object x : set) {
			System.out.println(x);
		}
		
		//배열 : set의 모든 요소 꺼내기 
		System.out.println("======================");
//		set.toArray(); // == new Object[] {"chick", "피자" ...} 형태의 배열이 만들어짐!
		Object[] arr = set.toArray(); //set 안에는 오브젝트 넣을 수 있으므로
//		for(int i=0; i< arr.length;) {
//		System.out.println(arr[i]);
//		}
//		for(String x : arr) {
//			System.out.println(x);
//		}
		
		System.out.println(set);//투 스트링 형식과 비슷 ))컬렉션 안에 어떤 요소들 들어있는지 알 수 있음.
	}
	
	
	
	
}
