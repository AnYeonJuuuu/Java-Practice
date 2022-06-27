package collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public void testMethod() {
		//Queue는 인터페이스 이므로 일반적 방법으로는 객체생성 불가
		/*
		 * FIFO 구조
		 */
		//따라서 LinkedList(== 다중상속 받음?) 사용
		Queue q = new LinkedList();
		
		//데이터 넣기
		q.offer("one");
		q.offer("two");
		q.offer("three");
		
		//
		System.out.println(q.size());
		
		
		//처음 데이터 읽기
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.size());
		
		//처음 데이터 꺼내기(읽고 삭제하기)
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.size());

		
		
		
		
		
	}//method
}

