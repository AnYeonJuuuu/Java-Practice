package prctice;

import java.util.Scanner;

public class Backjoon2884 {

	public static void main(String[] args) {
		// �Էµ� �ð��� 45�� �� �ð��� ���ϴ� ����!!
		// << ȥ�� �� Ǯ� �ش� ���� ���� >>
		/*1. M�� �������� 45���� ������ ��-1, 
		     45���� ũ�� M�� -45 ���ֱ�
		  2. M�� 60���̱� ������ �Է°��� 45���� ���� ��,
		     60 -(45 - M) ����! << "�� �κ��� �������!" 
		
		*/ 
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		// H�� M�� ���� �ۿ��ϹǷ� if�� �ȿ� ���� ������ �ϱ�!!
		if( M >= 45) {
			
			M = M - 45; // �Է°����� -45 �� ���� m�� ����
				
		}
		else if (M < 45) {
			M = 60-(45-M); 
			
			if(H == 0) {
				H = 23; // 0�ÿ��� H--; �Ǹ� - ���� �����Ƿ�!!
			}else {
				H--;  }
			
			}
		System.out.println(H+ " " + M);
		
		

	}	
}
	
