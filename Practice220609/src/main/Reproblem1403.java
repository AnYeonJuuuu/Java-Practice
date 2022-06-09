package main;

import java.util.Scanner;

public class Reproblem1403 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();//k 숫자 입력
		
		int[] ar = new int[k]; //배열 변수 선언
		
		//배열 변수 입력 받기
		for(int x = 0; x< k; x++) {
			ar[x] = sc.nextInt();
		}
		
		//변수 출력 하기
		for(int u = 0; u<2; u++) {
			for(int i = 0; i< k; i++) {
				System.out.println(ar[i]);
			}
		}
		
	}

}
