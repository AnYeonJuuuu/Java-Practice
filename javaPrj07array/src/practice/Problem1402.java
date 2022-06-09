package practice;

import java.util.Scanner;

public class Problem1402 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//n 개의 변수 만들기
		int[] ar = new int[n];
		
		//입력받기
		for(int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}
		
		// 출력할 때 N-1 ~ 0 까지 출력되도록
		for(int i = n-1; i >= 0; --i) { //초기식에서 n-1해주는 이유는 인덱스가 0부터 시작이니까
			System.out.print(ar[i]+ " ");	
		}
		
	}

}
