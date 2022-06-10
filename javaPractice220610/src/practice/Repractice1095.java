package practice;

import java.util.Scanner;

public class Repractice1095 {

	public static void main(String[] args) {

		int [] memo = new int[24];//모든 칸 입력 후 
		//그 중에서 작은 수를 가려내야 하기 때문!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//번호부른 횟수 입력
		
		// n을 입력받기!!(배열, 반복문 이용!)
		int[] arr = new int[n];
		for(int x=0; x<n; x++) {
			int num = sc.nextInt();
			memo [num] = 1; // >>> 이 부분 틀림!!
		}
		
		// 제일 빠른 번호 입력 값 출력하기
		int min = arr[0]; // >>>>> ?? 뭔지 모르겠음!!
		for(int j=1; j<23; j++ ) {
			if(memo[j] == 1) {
				System.out.println(j);
				break;
			}
		}
	}

}
