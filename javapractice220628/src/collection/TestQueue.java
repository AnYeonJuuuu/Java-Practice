package collection;

import java.util.LinkedList;
import java.util.Queue;


public class TestQueue {
	
	public void testMethodQ() {

	// 큐 == 인터페이스
	Queue q = new LinkedList();
	
	q.offer("one");
	q.offer("2");
	q.offer("three");
	
	System.out.println(q.size());
	
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q.size());
	
	}
	
}
