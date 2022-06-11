package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("===== !! 나와 함께할 식물 찾기 !! =====");
		System.out.println(" >>> 로그인 : 1번 입력 "
				+ "\n >>> 회원가입 : 0번 입력");
		int s;
		s = sc.nextInt();
		
		String ID;
		
		for(int x = 0; x<1 ;x++)  {
			
		if(s == 1 ) {
				System.out.println("ID을 입력해주세요");
				ID = sc.nextLine();
				sc.nextLine();//nextLine()은 Line으로 받기!!
				break;  } 
		
		if (s == 0) {
			System.out.println("회원가입 창으로 이동합니다.");
				continue;	}
		}
			
		for(;;) {
			if(s == 1) {System.out.println("↓↓비밀번호를 입력해주세요↓↓");}
			int pw = sc.nextInt();
			
		if( pw == 112 ) {
			
			System.out.println("로그인이 완료되었습니다");
			break;
			}else {
				System.out.println("틀린 비밀번호 입니다. 비밀번호를 다시 입력해주세요.");
			}continue;
		}
		System.out.println();
		System.out.println("===== 식물 추천 이벤트를 시작합니다 =====");
		
		
		
		
	}

}
