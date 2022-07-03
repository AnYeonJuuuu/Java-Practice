

import java.util.Random;
import java.util.Scanner;

import eventstart.EventStart;
import gift.Gift;
import selectPlant.SelectPlant;
import sersatisfaction.SerSatisfaction;

public class MainOrigin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		EventStart es = new EventStart(); //EventStart클래스의 welcome메소드 불러오기
		es.welcome();
		

		//회원가입 or 아이디 입력 문구 출력 
		es.login();
	
		SelectPlant sp = new SelectPlant();
		sp.recostart();//식물 추천 시작멘트

		int i = sc.nextInt();
		sp.selrecomm(i);// 식물 추천 프로그램

		es.Satiwelcom(); //만족도 조사 멘트
		
		SerSatisfaction ssf = new SerSatisfaction();//만족도 조사 점수 입력 및 점수 출력, 최고점 출력
		ssf.Score();

	
		Gift g = new Gift();
		g.giftment();//경품추첨 멘트
			
		
		int b = sc.nextInt();
//		g.giftran
//		dom();//랜덤 경품 >>>?? 갑자기 오류?

	
			}
	

	}
	
			
				
				
				
		
				
				
		
		
		
		
	


