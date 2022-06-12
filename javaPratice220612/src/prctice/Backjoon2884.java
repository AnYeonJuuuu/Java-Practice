package prctice;

import java.util.Scanner;

public class Backjoon2884 {

	public static void main(String[] args) {
		// 입력된 시간의 45분 전 시간을 구하는 문제!!
		// << 혼자 못 풀어서 해답 참고 했음 >>
		/*1. M을 기준으로 45보다 작으면 시-1, 
		     45보다 크면 M에 -45 해주기
		  2. M은 60분이기 때문에 입력값이 45보다 작을 땐,
		     60 -(45 - M) 대입! << "이 부분이 어려웠음!" 
		
		*/ 
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		// H와 M이 같이 작용하므로 if문 안에 같이 들어가도록 하기!!
		if( M >= 45) {
			
			M = M - 45; // 입력값에서 -45 한 값을 m에 대입
				
		}
		else if (M < 45) {
			M = 60-(45-M); 
			
			if(H == 0) {
				H = 23; // 0시에서 H--; 되면 - 값이 나오므로!!
			}else {
				H--;  }
			
			}
		System.out.println(H+ " " + M);
		
		

	}	
}
	
