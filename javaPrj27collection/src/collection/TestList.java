package collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	//collection 3가지
	public void testMethod() {
		// List > ArrayList
		/*
		 * 순서 있음!! (인덱스 이용 가능)
		 * 중복 가능!!
		 * 
		 */
		List al = new ArrayList(); // 리스트 생성
		
		// 값 넣기 (타입 상관 어ㅏㅄ이 넣을 수 있음)
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
//		al.add("xxx");
		
		
		// 값이 존재하는지 확인 30 이라는 값이 포함되어 있는지!!
		System.out.println(al.contains(30));
		
		// 현재 몇 개의 요소가 들어있는지 확인 가능!(배열의 length 역할)
		al.size();// size는 함수
		System.out.println(al.size());
		
		// 인덱스를 활용해서 요소 삭제
		al.remove(3);
		
		// 값을 활용해서 요소 삭제
		al.remove(new Integer(10));
		
		// 요소의 인덱스 확인(중복값이 있어도 처음 발견된 인덱스 리턴)
		al.indexOf(50);
		System.out.println(al.indexOf(50));
		
		// 요소의 인덱스 확인(뒤에서)
		System.out.println(al.lastIndexOf(50));

		// 특정 인덱스의 값 바꾸기
		al.set(0,99);
		
		// 현재 리스트의 모든 요소 제거
		// al.clear();
		
		// 리스트가 비어있는지 확인
		System.out.println(al.isEmpty());
		
		// 특정 인덱스에 값 추가 (특정 인덱스, 추가값)
		al.add(3, 777);
		
		
		System.out.println("=============================");
		
		//값 확인
		// al.get(0);  al에서 인덱스 값 읽어올 수 있음.
		
		for(int i = 0; i< al.size(); i++) { // 이 부분 다시 공부 !! al.size
			System.out.println(al.get(i));
		}
		
		// 값을 삭제하면, 인덱스도 변한다 (당겨짐!!)
		//System.out.println(al.get(2));
		
		
	}
	
}
