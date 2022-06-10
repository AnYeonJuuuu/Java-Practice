package practice;

import java.util.Scanner;

public class Repractice1094 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//번호부른 횟수 입력
		
		//n개의 번호 순서대로 입력(반복문, 배열 이용!)
		int [] ran = new int[n]; // 배열 변수 선언!!
				
		for(int x=0; x<n; x++) {
			int num = sc.nextInt(); // 숫자를 입력 받는다!!
			ran[x] = num;
		}
		
		//거꾸로 출력하기!!
		 for(int j=n-1; j>=0; j--) {
			 System.out.print(ran[j]+" ");
		 }
		
	}

}
