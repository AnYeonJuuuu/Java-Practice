package javaPractice220617;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int arr[] = new int[n];
		
		for(int x= 0; x<n; x++) {
			
			arr[x] = sc.nextInt();
			
		}
		
		
	
		Arrays.sort(arr);// 오름차순 정렬
		System.out.print(arr[0]+ " "+ arr[n-1]);
		
	}

}
