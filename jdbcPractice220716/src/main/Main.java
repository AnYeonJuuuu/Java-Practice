package main;

import java.util.Scanner;

import member.MemberController;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberController mc = new MemberController();
		
		System.out.println("===== 노래 추천 =====");
		
		System.out.println("1.좋아하는 장르 선택");
		System.out.println("2.맞춤 추천");
		System.out.println("3.노래 등록");
		
		System.out.print("* 원하는 항목의 숫자 입력 : ");
		String input = sc.nextLine();
		
		switch(input) {
		case "1" : 
			System.out.println("===== 좋아하는 장르를 입력해주세요. =====");
			System.out.print("장르 입력 : ");
			String genre = sc.nextLine();
			mc.selectGenre(genre);
			break;
//		case "2" : 
//			int result = mc.join();
//			if(result > 0) System.out.println("회원가입 성공!!!");
//			else System.out.println("회원가입 실패...");
//			break;
//		case "3" : 
//			mc.edit();
//			break;
		default : System.out.println("그런 숫자 없어요");
		}
	
	}

}
