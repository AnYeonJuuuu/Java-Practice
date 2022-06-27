package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		if문 게임 만들기 <운명의 동물 찾기>
		
		System.out.println("===== 운명의 동물 찾기!! =====");
		
		System.out.println("1~5사이의 숫자를 고르세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
			int user = sc.nextInt();	
		
	
			
			int com = (int) (Math.random() * 6)+1;
			if(com == 1) {
				System.out.print("고양이 입니다.");
				
			}
			else if(com == 2) {
				System.out.print("강아지 입니다.");
			}
			else if(com == 3) {
				System.out.print("호랑이 입니다.");
			}
			else if(com == 4) {
				System.out.print("치타 입니다.");
			}
			else if(com == 5) {
				System.out.print("독수리 입니다.");
			}
			
		}
		
}

	
	
	

