package practice;

import java.util.Scanner;

public class Problem1095 {

	public static void main(String[] args) {
		// 가장 빠른 번호 출력!!
		/* 코드 포인트! 빠른 번호부터 확인해서,
		 * 불렸느지 안 불렸는지가 중요!(불린 횟수가 중요한 게 아니라!)
		 */
		
		//기록할 메모장 만들기
		//(출석번호는 23명 이지만 변수 만들 때 24개 만들어야함 ! 인덱스는 0부터 시작이니까)
		int[] memo = new int[24];
		
		Scanner sc = new Scanner(System. in);
		int n = sc.nextInt();
		
		
		//n을 입력 받기
		int [] arr = new int[n];
		
		// (( 윗 주석 아랫주석 다시 이해하기 )) 아랫주석 int num 다시 이해!
		
		//n개의 출석번호 입력 받기
		for(int x= 0; x<n; x++) {
			int num = sc.nextInt(); // 꼭 확인!!! 내가 친 코드랑 다름!!!
			memo[num] = 1; //메모장에 출석 불리면 '1'이 체크 된다는 뜻!!>>>> 중요!
		}
		// 제일 빠른 번호 입력 값 출력하기
		int min = arr[0];
		for(int j = 1; j<23 ; j++ ) {
			//만약 memo[j] == 1라면. j번 학생이 가장 빠른 번호임!
			if(memo[j] == 1) {
				System.out.println(j);
				break; //출석 부른 학생 번호가 입력된다면 뒷 번호는 입력 되면 안되니까!!
			}
		}
		
	} 

}
