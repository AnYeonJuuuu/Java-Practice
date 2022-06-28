package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public void testMethod2() {
		Map hm = new HashMap();
		
		hm.put(1, "cat");
		hm.put("two", "dog");
		hm.put(3, "pizza");
		hm.put(3, "tomato");
		hm.put("five", "tomato");
		
		System.out.println(hm.containsKey(3));
		
		System.out.println(hm.containsValue("dog"));
		
		
		System.out.println(hm.size());
		
		System.out.println("====== °ª ²¨³»±â ========");
		Set <Map.Entry> es = hm.entrySet();
		
		for(Map.Entry x : es) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
		
		
	}
	
}
