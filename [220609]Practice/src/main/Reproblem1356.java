package main;

import java.util.Scanner;

public class Reproblem1356 {

	public static void main(String[] args) {
		// �׵θ��� �ִ� �簢�� *���
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j<= n; j++) {
			//ù ��,��  ������ ��,�� ��� �Ǿ����!!
			//�� ���� �״�θ� if���� ���ǹ��� ����	
				if(i == 1 || i == n || j ==1 || j == n ) {
					System.out.print("*");
				}else { 
					System.out.print(" ");
				}
				
			}
			
			System.out.println(); // �� �� for�� �������ͼ� �Է��ؾ���!!
		}
	
		
	}

}
