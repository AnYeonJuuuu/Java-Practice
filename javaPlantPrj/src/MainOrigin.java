

import java.util.Random;
import java.util.Scanner;

import eventstart.EventStart;
import selectPlant.SelectPlant;
import sersatisfaction.SerSatisfaction;

public class MainOrigin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		EventStart es = new EventStart(); //EventStart클래스의 welcome메소드 불러오기
//		es.welcome();
//		
//
//		int sr = sc.nextInt();//회원가입 or 아이디 입력 문구 출력 
//		es.login(sr);
//	
//		SelectPlant sp = new SelectPlant();
//		sp.recostart();//식물 추천 시작멘트
//
//		int i = sc.nextInt();
//		sp.selrecomm(i);// 식물 추천 프로그램
		
		es.Satiwelcom(); //만족도 조사 멘트
		
		SerSatisfaction ssf = new SerSatisfaction();
		ssf.Score();
			
//			int[] ser = new int[4];
//			for(int p = 1; p<4; p++) {
//				if(p==1) {
//				System.out.println("("+p+")"+"번 흥미성 점수를 입력해주세요.");
//				} else if(p==2) {
//				System.out.println("("+p+")"+"번 구성도 점수를 입력해주세요.");
//				}else if(p==3) {
//					System.out.println("("+p+")"+"번 정확성 점수를 입력해주세요.");
//					}
//				ser[p] = sc.nextInt();
//			}
//			
//			
//			SerSatisfaction ssf = new SerSatisfaction(ser[1],ser[2],ser[3]);
//			System.out.println(ssf);
			
//			ser[1] = f;
//			ser[2] = c;
//			ser[3] = fo;
//			int t;
//			int l = 0;
//			for( t = 1; t < 4; t++) {
//				
//				if( l < ser[t]) {
//					l = ser[t];
//				}
//			}
//				System.out.println("최고점 :: << "+ l + "점 >> " +"만족도 평가에 참여해주셔서 감사합니다 ^o^");

			// 원래 이 부분에서 최고점의 항목을 입력하고 싶었음!
			System.out.println("===== 100% 경품 추첨 이벤트!!===== \n(1)~(5)번 중 숫자를 아래에 입력해주세요.\n(** 경품은 랜덤으로 증정됩니다.)");
			
			int b = sc.nextInt();
			Random rd = new Random(); // 객체 생성
			int p = rd.nextInt(5)+1;
			
			if(p == 1) {
				System.out.println("축하합니다! \"2인 제주도 여행권\"에 당첨되셨습니다^.^");
			}else if(p == 2) {
				System.out.println("축하합니다! \"LG 식물 재배기\"에 당첨되셨습니다^.^");
			}else if(p == 3) {
				System.out.println("축하합니다! \"삼성 스타일러\"에 당첨되셨습니다^.^");
			}else if(p == 4) {
				System.out.println("축하합니다! \"ㅇㅇ랜드 연간이용권\"에 당첨되셨습니다^.^");
			}else if(p == 5) {
				System.out.println("축하합니다! \"ㅇㅇ텃밭 20m x 20m 평생 이용권\"에 당첨되셨습니다^.^");
			}
			System.out.println();
			System.out.println("====== 나와 함께할 식물 찾기를 종료합니다. 이용해주셔서 감사합니다. ======");
		
			
			
			
	
			}
	

	}
	
			
				
				
				
		
				
				
		
		
		
		
	


