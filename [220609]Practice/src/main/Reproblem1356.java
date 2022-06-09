package main;

import java.util.Scanner;

public class Reproblem1356 {

	public static void main(String[] args) {
		// 테두리만 있는 사각형 *찍기
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j<= n; j++) {
			//첫 행,열  마지막 행,열 출력 되어야함!!
			//윗 문장 그대로를 if문의 조건문에 대입	
				if(i == 1 || i == n || j ==1 || j == n ) {
					System.out.print("*");
				}else { 
					System.out.print(" ");
				}
				
			}
			
			System.out.println(); // 안 쪽 for문 빠져나와서 입력해야함!!
		}
	
		
	}

}
