package main;

public class Main {

	public static void main(String[] args) {

		//�� �� �ٿ� ���� ���� ��ü �̿�! 
		//���� ���� �� �غ���!
		
		//���� �ȳ� ��ü �ҷ�����
		GameController gc = new GameController();
		gc.printInfo();
		
		//�������� �����!
		GameRandom gr = new GameRandom();
		int random = gr.getrandom();
		
		//�õ��� Ƚ�� ���� ����
		int cnt = 0;
		
		//user�� ���� computer�� ���� ���� �� ���� �ݺ�!!
		//while�� �̿� = ���ѹݺ� ��ų ���̱� ������!
		while(true) {
			int user  = gc.scanUserNum();//������ �̹� ���� ���� �־����Ƿ�
			cnt++;
			
			boolean isFinish = gc.judge(user, random, cnt);
			if(isFinish == true) {
				break;
			}
		}
			
		
		
		
	}

}
