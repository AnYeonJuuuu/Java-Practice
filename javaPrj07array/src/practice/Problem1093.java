package practice;

import java.util.Scanner;

public class Problem1093 {

	public static void main(String[] args) {
		
		//우리반 23 (1~23) 명 출석 부르기
		// 각 학생 불린 횟수 출력
		
		Scanner sc = new Scanner(System.in);
		
		//변수 23개 만들기 = 배열 만들기
		//왜 24칸 만들었는가? 인덱스는 0부터 시작하므로 
		//0~24칸 까지 만들어서 0번 인덱스는 사용하지 않기 위해 24칸 짜리로 만듦.
		int[] studentArr = new int[24]; 
		
		//출석 번호 받기
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int num = sc.nextInt();
			studentArr[num] += 1; //의 num번 인덱스에 +1을 해준다는 뜻 
		}
		
		 //1~23 까지 돌아가는 변수 만들기
				for(int i = 1; i<=23; i++) {
					System.out.print(studentArr[i]+" ");
				}
	 

		
		
		
		
		
	}

}
