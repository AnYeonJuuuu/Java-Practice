package main;

import java.util.Scanner;

public class Reproblem1403 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();//k ���� �Է�
		
		int[] ar = new int[k]; //�迭 ���� ����
		
		//�迭 ���� �Է� �ޱ�
		for(int x = 0; x< k; x++) {
			ar[x] = sc.nextInt();
		}
		
		//���� ��� �ϱ�
		for(int u = 0; u<2; u++) {
			for(int i = 0; i< k; i++) {
				System.out.println(ar[i]);
			}
		}
		
	}

}
