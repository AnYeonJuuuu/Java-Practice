package selectPlant;

import java.util.Scanner;

public class SelectPlant {

	Scanner sc = new Scanner(System.in);
	
	public void recostart() {
		System.out.println();
		System.out.println("===== 식물 추천 이벤트를 시작합니다 =====");
		System.out.println("** (1)번 or (2)번중 더 마음에 드는 항목의 번호를 입력해주세요!!");
		System.out.println();
		System.out.println("(1) 식물 키우기의 하이라이트는 꽃!! 꽃이 좋아요!!^o^ \n(2) 식물은 푸릇푸릇 잎이 생명이라고 생각한다면!!");
		System.out.println("↓↓ 아래에 숫자 (1) 또는 (2)를 입력해주세요. ↓↓");
	}
	
	public void selrecomm(int se) {
		 // 꽃 유무
		if(se == 1) {
			System.out.println("(1) 나는 식물계의 \"마이더스 손\" 어떤 꽃이든지 자신있어요!! "
					+ "\n(2) 나는 식물계의 \"마이너스 손\" 초보자도 잘 키울 수 있는 꽃 추천해주세요!!");
			System.out.println("↓↓ 아래에 숫자 (1) 또는 (2)를 입력해주세요. ↓↓");
			
			int a = sc.nextInt(); // 식물 난이도
			if(a==1) {
				System.out.println("당신은 꽃 키우기의 달인 :: \"호접란\" \"심비디움\" 추천드립니다^_~");
			}
			else if(a==2){ 
				System.out.println("미래 꽃 키우기의 마이더스 손 :: \"스파티필름\" \"청일홍\" 추천드립니다^_~");}}
			
		else if(se == 2) {
			System.out.println("(1) 보는 것도 좋지만 키우면서 먹을 수도 있는 식물이 좋아요!"
					+ "\n(2) 식물 키우기 너무 어려워요 관리하기 쉬운 식물을 키워보고 싶어요!");
			System.out.println("↓↓ 아래에 숫자 (1) 또는 (2)를 입력해주세요. ↓↓");
			int b = sc.nextInt();
			if(b==1) {
				System.out.println("이제 우리 집은 작은 농장 :: \"토마토\" \"로즈마리\" 추천드립니다^_~");}
			else if (b==2){
				System.out.println("미래 식물 키우기의 고수 :: \"스투키\" \"몬스테라\" 추천드립니다^_~");}}
	}
	
	
	
	
}//c
