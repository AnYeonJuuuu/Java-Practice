package Run;

import com.kh.user.model.vo.User.User;

import fruit.Fruit;

public class Main {

	public static void main(String[] args) {

		 User user = new User("userId","usePwd","userName","address","phone",'F');
		 Fruit fruit = new Fruit();
		 fruit.fruit(); 
		 
		
	}

	
}
