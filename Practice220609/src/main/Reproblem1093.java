package main;

import java.util.Scanner;

public class Reproblem1093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ar = new int[n]; // �迭 ���� ����
		
		for(int i = 0; i<n; i++) {
			ar[i] = sc.nextInt(); //�迭 ���� �Է� �ޱ�
			
		}
		
		
			for(int j = n-1 ; j >= 0 ; j--) {
				System.out.print(ar[j] + " ");
				
			}
		
		
		
	}

}
