package practice;

import java.util.Scanner;

public class Problem1407 {

	public static void main(String[] args) {
		
		
		//문자열 받아서 공백 제거하고 출력
		
		//문자열 받기
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		
		//문자열 출력(공백 제거!!)
		//조건식에 배열의 길이가 들어가야 하므로 s.length() 넣어야함!! 괄호 필수!!
		for(int i = 0; i < s.length(); i++) { // <=s.length()-1로 작성해도 되고, < s.length() 로 작성해도 됨!
			if(s.charAt(i) != ' ') {// .charAt()에서는 ' '로 공백 인식!!!!
				System.out.print(s.charAt(i));//첫 번째 인덱스에 있는 값 읽어오기(한칸한칸 배열로 이루어져 있으니까!!)
				
			} 
			
		}
		
		
		
		
		
		
	}

}
