package practice;

import java.util.Scanner;

public class Problem1094 {

	public static void main(String[] args) {
		//출석 n번 부를건데, 출력을 거꾸로
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] memo = new int[n]; // 배열 변수 선언
		
		//배열 변수 입력 받기
		    // i = 1; i<=n으로 하면 오류가 남!! 인덱스는 0번부터 시작이니까!
		for(int i = 0; i<n; i++) { 
			int num = sc.nextInt();
			memo[i] = num;
			
		}
		
		// 반복문으로 memo[n-1] 
		// n-1은 왜 하는건지?
		// 거꾸로 출력하기!
		for(int j = n-1 ; j >= 0 ; j--) {
			System.out.print(memo[j] + " ");
			
		}
		
		
	}

}
