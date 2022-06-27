package collection;

import java.util.Stack;

public class TestStack {

	public void testMethod() {
		
		Stack s = new Stack();
		/*
		 * LIFO 구조
		 * 
		 */
		
		
		//데이터 넣기
		s.push("one");
		s.push("two");
		s.push("three");
		
		//데이터 꺼내기 .peek >> 무조건 마지막 데이터를 꺼내옴
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.peek()); 
		System.out.println(s.size());
		System.out.println("=================================");
		
		//데이터 꺼내기 .pop >> 데이터 꺼내고 "삭제"
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		//
		System.out.println(s.size());
		
		
		
		
		
		
		
		
		
	}//m
	
}
