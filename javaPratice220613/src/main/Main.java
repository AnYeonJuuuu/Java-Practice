package main;

public class Main {

	public static void main(String[] args) {

		//업 앤 다운 게임 복습 객체 이용! 
		//순서 생각 잘 해보기!
		
		//게임 안내 객체 불러오기
		GameController gc = new GameController();
		gc.printInfo();
		
		//랜덤숫자 만들기!
		GameRandom gr = new GameRandom();
		int random = gr.getrandom();
		
		//시도한 횟수 변수 생성
		int cnt = 0;
		
		//user의 값과 computer의 값이 맞을 때 까지 반복!!
		//while문 이용 = 무한반복 시킬 것이기 때문에!
		while(true) {
			int user  = gc.scanUserNum();//위에서 이미 변수 선언 있었으므로
			cnt++;
			
			boolean isFinish = gc.judge(user, random, cnt);
			if(isFinish == true) {
				break;
			}
		}
			
		
		
		
	}

}
