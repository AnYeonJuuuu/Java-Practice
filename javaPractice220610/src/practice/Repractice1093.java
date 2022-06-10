package practice;

import java.util.Scanner;

public class Repractice1093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 배열을 입력! 1~23인덱스가 필요하므로 
		// 24의 값을 넣어서 인덱스와 학생번호를 맞춰준다!
		int [] arr = new int[24];
		
		for(int x=0; x<n; x++) {
			int num = sc.nextInt();//2번째 줄 숫자(출석번호)를 입력 받는다는 의미!!
			arr[num] += 1;
		}
		
		// 번호를 출력하기
		// 실제 입력되는 값이니까 
		for(int j=1; j<23; j++) {
			System.out.println(arr[j]+" ");
		}
		
	}

}
