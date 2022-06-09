package main;

import java.util.Scanner;

public class Reproblem1382 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//모든 경우의 수 구하기
		for(int i= 1; i<= 6; i++) {
			for(int j = 1; j<= 6; j++) {
				if(i+j == n) {
					System.out.println(i + " " + j);
				}
				
			}
		}
		
		
	}

}
