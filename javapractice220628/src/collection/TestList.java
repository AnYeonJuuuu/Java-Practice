package collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public void testMethod() {
		
		List al = new ArrayList();
		
		al.add(10);
		al.add(30);
		al.add("one");
		al.add(22);
		al.add('f');
		
		
		System.out.println(al.contains(30));
		
		System.out.println(al.size());
		
		al.remove(3);
		
		al.add(new Integer(10));
		
		System.out.println("==============");
		
		System.out.println(al.indexOf('f'));
		
		al.set(2, "two");
		
		al.add(3, "66666");
		
		System.out.println("===== °ª È®ÀÎ ==========");
		
		for(int x= 0; x<al.size(); x++) {
			System.out.println(al.get(x));
		}
		
		
		
	}
}
