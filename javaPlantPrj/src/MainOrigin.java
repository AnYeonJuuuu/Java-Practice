

import java.util.Random;
import java.util.Scanner;

import eventstart.EventStart;
import gift.Gift;
import selectPlant.SelectPlant;
import sersatisfaction.SerSatisfaction;

public class MainOrigin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		EventStart es = new EventStart(); //EventStartŬ������ welcome�޼ҵ� �ҷ�����
		es.welcome();
		

		//ȸ������ or ���̵� �Է� ���� ��� 
		es.login();
	
		SelectPlant sp = new SelectPlant();
		sp.recostart();//�Ĺ� ��õ ���۸�Ʈ

		int i = sc.nextInt();
		sp.selrecomm(i);// �Ĺ� ��õ ���α׷�

		es.Satiwelcom(); //������ ���� ��Ʈ
		
		SerSatisfaction ssf = new SerSatisfaction();//������ ���� ���� �Է� �� ���� ���, �ְ��� ���
		ssf.Score();

	
		Gift g = new Gift();
		g.giftment();//��ǰ��÷ ��Ʈ
			
		
		int b = sc.nextInt();
//		g.giftran
//		dom();//���� ��ǰ >>>?? ���ڱ� ����?

	
			}
	

	}
	
			
				
				
				
		
				
				
		
		
		
		
	


