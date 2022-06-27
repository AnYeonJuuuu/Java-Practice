package generic;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	public void testMethod() {
	
		//generic : 타입 제한
		
		List<Integer> scoreList/*변수이름*/ = new ArrayList<Integer>();
		
		scoreList.add(80);
		scoreList.add(70);
		scoreList.add(100);
		
		int result = 0;
		result += scoreList.get(0);
		result += scoreList.get(1);
		
		
		
	}

}
