package practice;

import java.util.Scanner;

public class Repractice1095 {

	public static void main(String[] args) {

		int [] memo = new int[24];//��� ĭ �Է� �� 
		//�� �߿��� ���� ���� �������� �ϱ� ����!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//��ȣ�θ� Ƚ�� �Է�
		
		// n�� �Է¹ޱ�!!(�迭, �ݺ��� �̿�!)
		int[] arr = new int[n];
		for(int x=0; x<n; x++) {
			int num = sc.nextInt();
			memo [num] = 1; // >>> �� �κ� Ʋ��!!
		}
		
		// ���� ���� ��ȣ �Է� �� ����ϱ�
		int min = arr[0]; // >>>>> ?? ���� �𸣰���!!
		for(int j=1; j<23; j++ ) {
			if(memo[j] == 1) {
				System.out.println(j);
				break;
			}
		}
	}

}
