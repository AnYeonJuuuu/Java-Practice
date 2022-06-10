package practice;

import java.util.Scanner;

public class Problem1461 {

	public static void main(String[] args) {

		//2차원 배열
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		
		int x = 1;
		
		for(int i = 0; i<n; i++) {
			for(int j= 0; j<n; j++) {
				a[i][j] = x++; // x는 칸에 들어오는 숫자의 값을 입렫ㄱ
				// x += 1; 대신에 윗 줄의 "x++" 사용했음! 라인이 다 끝나고 나서 증가가 되므로 1부터 시작 되는게 맞음!!
			}
		}
		
		
		for(int i = 0; i<n; i++) {
			for(int j= n-1; j >= 0; j--) { 
			//[n-1 ~ 0 까지 출력]j가 열을 담당! 거꾸로 출력하는 것 외우기!!!!! 
			//n-1을 해주는 이유 =  인덱스 값이기 때문에 !	
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
