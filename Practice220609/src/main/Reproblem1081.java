package main;

import java.util.Scanner;

public class Reproblem1081 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		// n이 나올 경우의 수, m이 나올 경우의 수
		
		for(int x=1; x<=n; x++) {
			for(int i = 1; i<= m; i++ ) {
				System.out.println(x + " " + i );
			}
		}
		
	}

}
