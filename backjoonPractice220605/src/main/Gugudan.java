package main;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(n=n; n>=1 && n<=9; n++ ) {
			
			for(int x=1; x<10; x++) {
				System.out.println( n + " * " + x + " = " +  + n*x);
				
			
				
			}
		 
			break;
		}
		
	}

}
