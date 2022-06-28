package prictice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PracticeMap {

	public void test() {
		//맵 만들고, 모든 key와 모든 value 확인
		
		Map map = new HashMap();//해쉬맵 객체를 Map 타입으로 map 변수에 생성
		
		map.put("one", "apple");
		map.put("two", "banana");
		map.put("three", "tomato");
		
		//맵의 모든 키 확인
		Set ks = map.keySet();// 키셋 메서드가 Set을 리턴하고 있어서 리턴타입을 셋타입으로 해줌!
		//맵 안에 엔트리의 모든 키 값들을 모두 뽑아서 하나의 셋타입 객체에 집어넣은 것을 리턴해주는 메서드!!
		
		
		for(Object x : ks) {
			System.out.println(x);
//			map.get(x);//맵에 들어있는 키값에 해당하는 밸류 값 접근 가능
			System.out.println(map.get(x));
		}
	}
	
		public void test2() {
			Map map = new HashMap();
			
			// 총 세 개의 엔트리(== 키와 밸류값)
			map.put("apple", "red");
			map.put("banana", "yellow");
			map.put("grape", "purple");
			
			//모든 데이터 확인
			//셋 안쪽의 모든 요소 : 향상된 for문 이용해서 꺼내오기
			Set <Map.Entry> es = map.entrySet(); 
			//왜 <Map.Entry>를 이용? 
			//요소를 키값과 밸류값을 따로 컨트롤 해야하기 때문에 엔트리로 만들어 키값과 밸류값 가져오게 함
			
			for(Map.Entry x : es) {
				x.getKey();/*x==엔트리*/ //겟키 호출하면 겟 값을 반환해줌
				System.out.println(x.getKey());
				x.getValue(); //x가 가진 밸류값을 리턴해줌!
				System.out.println(x.getValue()); 
			}
			
		}
	
		public void test3() { //???
		
			Map map = new HashMap();
			
			map.put("one", "apple");
			map.put("two", "banana");
			map.put("three", "tomato");
		
			map.values();
			
		}
		
		
		
		
		
		
}
