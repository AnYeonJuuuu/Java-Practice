package practice;

import java.util.Scanner;

public class Repractice1094 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//��ȣ�θ� Ƚ�� �Է�
		
		//n���� ��ȣ ������� �Է�(�ݺ���, �迭 �̿�!)
		int [] ran = new int[n]; // �迭 ���� ����!!
				
		for(int x=0; x<n; x++) {
			int num = sc.nextInt(); // ���ڸ� �Է� �޴´�!!
			ran[x] = num;
		}
		
		//�Ųٷ� ����ϱ�!!
		 for(int j=n-1; j>=0; j--) {
			 System.out.print(ran[j]+" ");
		 }
		
	}

}
