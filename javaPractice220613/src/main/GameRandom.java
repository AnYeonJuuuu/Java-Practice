package main;

public class GameRandom {

	public int getrandom() {
		//main으로 내보내야 할 값이므로 return 이용해야 함!!
		return (int)(Math.random()*50+1);
	}
	
}
