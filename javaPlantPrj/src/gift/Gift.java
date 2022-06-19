package gift;

import java.util.Random;

public class Gift {

	public void giftment() {
		System.out.println();
		System.out.println("===== 100% 경품 추첨 이벤트를 시작합니다!!===== "
				+ "\n(1)~(5)번 중 숫자를 아래에 입력해주세요."
				+ "\n(** 경품은 랜덤으로 증정됩니다.)");
	}
	
	public void giftrandom() {
		Random rd = new Random(); // 객체 생성
		int p = rd.nextInt(5)+1;
		
		// 축하합니다 멘트를 for문이나 배열에 넣어서 간단하게 만들고 싶었는데 안 됨!!!
		if(p == 1) {
			System.out.println("축하합니다! \"LG 식물 재배기\"에 당첨되셨습니다^.^");
		}else if(p == 2) {
			System.out.println("축하합니다! \"LG 식물 재배기\"에 당첨되셨습니다^.^");
		}else if(p == 3) {
			System.out.println("축하합니다! \"삼성 스타일러\"에 당첨되셨습니다^.^");
		}else if(p == 4) {
			System.out.println("축하합니다! \"ㅇㅇ랜드 연간이용권\"에 당첨되셨습니다^.^");
		}else if(p == 5) {
			System.out.println("축하합니다! \"ㅇㅇ텃밭 20m x 20m 평생 이용권\"에 당첨되셨습니다^.^");
		}

		System.out.println();
		System.out.println("====== 나와 함께 할 식물 찾기를 종료합니다. 이용해주셔서 감사합니다. ======");
	}
}
