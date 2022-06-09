package main;

import java.util.Scanner;

public class Reproblem1355 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int x= 0 ; x < n; x++) {
			for(int i = 0 ; i< x; i++) {
				System.out.print(" ");
			}
			for(int k = n; k > x; k-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
