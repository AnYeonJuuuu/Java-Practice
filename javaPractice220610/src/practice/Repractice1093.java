package practice;

import java.util.Scanner;

public class Repractice1093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// �迭�� �Է�! 1~23�ε����� �ʿ��ϹǷ� 
		// 24�� ���� �־ �ε����� �л���ȣ�� �����ش�!
		int [] arr = new int[24];
		
		for(int x=0; x<n; x++) {
			int num = sc.nextInt();//2��° �� ����(�⼮��ȣ)�� �Է� �޴´ٴ� �ǹ�!!
			arr[num] += 1;
		}
		
		// ��ȣ�� ����ϱ�
		// ���� �ԷµǴ� ���̴ϱ� 
		for(int j=1; j<23; j++) {
			System.out.println(arr[j]+" ");
		}
		
	}

}
