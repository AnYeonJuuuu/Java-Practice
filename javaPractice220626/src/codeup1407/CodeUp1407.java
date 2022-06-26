package codeup1407;

import java.util.Scanner;

public class CodeUp1407 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		for(int j = 0; j<a.length(); j++) {
			//.charAt == string 타입을 char 타입으로 변환할 때 사용!!
			if(a.charAt(j) != ' ') {
				System.out.print(a.charAt(j));
			}
			
		}
		
		
	}

}
