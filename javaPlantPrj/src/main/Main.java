package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! 나와 함께할 식물 찾기 !! =====\n** 이벤트 후 만족도 조사 완료 시 100% 경품을 드립니다 **");
		System.out.println(" >>> 로그인 : 1번 입력 "
				+ "\n >>> 회원가입 : 0번 입력");
		int s;
		s = sc.nextInt();
		
		String ID;
		
		for(int x = 0; x<1 ;x++)  {
			
		if(s == 1 ) {
				System.out.println("ID을 입력해주세요(한글 또는 영문으로 입력해주세요.)");
				ID = sc.nextLine();
				sc.nextLine();//nextLine()은 Line으로 받기!!
				break;  } 
		
		if (s == 0) {
			System.out.println("회원가입 창으로 이동합니다.");
				continue;	}
		}
			
		for(;;) {
			if(s == 1) {System.out.println("↓↓비밀번호를 입력해주세요↓↓(비밀번호 == 112)");}
			int pw = sc.nextInt();
			
		if( pw == 112 ) {
			
			System.out.println("로그인이 완료되었습니다 ^o^");
			break;
			}else {
				System.out.println("틀린 비밀번호 입니다. 비밀번호를 다시 입력해주세요.");
			}continue;
		}
		System.out.println();
		System.out.println("===== 식물 추천 이벤트를 시작합니다 =====");
		System.out.println("** (1)번 or (2)번중 더 마음에 드는 항목의 번호를 입력해주세요!!");
		System.out.println();
		System.out.println("(1) 식물 키우기의 하이라이트는 꽃!! 꽃이 좋아요!!^o^ \n(2) 식물은 푸릇푸릇 잎이 생명이라고 생각한다면!!");
		System.out.println("↓↓ 아래에 숫자 (1) 또는 (2)를 입력해주세요. ↓↓");
		
			int i = sc.nextInt(); // 꽃 유무
			if(i == 1) {
				System.out.println("(1) 나는 식물계의 \"마이더스 손\" 어떤 꽃이든지 자신있어요!! "
						+ "\n(2) 나는 식물계의 \"마이너스 손\" 초보자도 잘 키울 수 있는 꽃 추천해주세요!!");
				System.out.println("↓↓ 아래에 숫자 (1) 또는 (2)를 입력해주세요. ↓↓");
				
				int a = sc.nextInt(); // 식물 난이도
				if(a==1) {
					System.out.println("당신은 꽃 키우기의 달인 :: \"호접란\" \"심비디움\" 추천드립니다^_~");
				}
				else if(a==2){ 
					System.out.println("미래 꽃 키우기의 마이더스 손 :: \"스파티필름\" \"청일홍\" 추천드립니다^_~");}}
				
			else if(i == 2) {
				System.out.println("(1) 보는 것도 좋지만 키우면서 먹을 수도 있는 식물이 좋아요!"
						+ "\n(2) 식물 키우기 너무 어려워요 관리하기 쉬운 식물을 키워보고 싶어요!");
				System.out.println("↓↓ 아래에 숫자 (1) 또는 (2)를 입력해주세요. ↓↓");
				int b = sc.nextInt();
				if(b==1) {
					System.out.println("이제 우리 집은 작은 농장 :: \"토마토\" \"로즈마리\" 추천드립니다^_~");}
				else if (b==2){
					System.out.println("미래 식물 키우기의 고수 :: \"스투키\" \"몬스테라\" 추천드립니다^_~");}}
				
			System.out.println();
			
			System.out.println("===== 서비스 만족도 조사 후 경품을 증정해드립니다. =====");
			// 배열 이용해서 서비스 만족도 조사하기((수업 시간 내용 및 검색 다수 이용!!!! 어렵!!))
			System.out.println("\"(1) 흥미성 (2) 구성도 (3) 정확성 \" 점수를 입력해주세요.");
			int[] ser = new int[4];
			int w;
			int t;
			int l = 0;
			for( w = 1; w<=3; w++) {
				System.out.println("(" + w + ")"+ " 점수 입력 ↓↓");
				
				 // 각 항목의 점수 저장
			 ser[w] = sc.nextInt();
			 
			}
			
			for( t = 0; t < 4; t++) {
				if( l < ser[t]) {
					l = ser[t];
				}
			}
			// 원래 이 부분에서 최고점의 항목을 입력하고 싶었음!
			System.out.println("최고점 :: << "+ l + "점 >> " +"만족도 평가에 참여해주셔서 감사합니다 ^o^");
			System.out.println();
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
	
			
				
				
				
		
				
				
		
		
		
		
	


