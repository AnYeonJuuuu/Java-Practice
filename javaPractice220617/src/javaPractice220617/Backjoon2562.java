package javaPractice220617;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		
		for( int i=1; i<10; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int max = arr[1];
		int index = 1; // 최댓값 위치 알 수 있는 변수
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
						
			}
		}
		
	
		System.out.println(max);
		System.out.println(index);
		
		
		
	}

}
