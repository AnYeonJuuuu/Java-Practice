package main;

import java.util.Map;

import mob.Pikachu;
import person.Trainer;

public class Main { 

	public static void main(String[] args) {

		System.out.println("===== 포켓몬 =====");
		
		Trainer t = new Trainer("지우", 1);
		
		System.out.println(t.toString());// 수업시간엔 안 했지만 toString 이용해서 출력해줌
		
		//포켓몬 생성
		Pikachu p = new Pikachu("피카츄", 7, 3, 100);// 지우에게 변수 p 추가해주어야함
		System.out.println(p);// 이대로 출력하면 이상한 값이 나옴
		
		
		// 포켓몬주머니에 넣기
//		Map pocket/*트레이너의 포켓에 가져온 것*/ = t.getPocket();
//		pocket.put(p.getName(), p);
		t.addPokemon(p);
		
//		t.getPocket().size();// >> 포켓몬 잘 추가 되었는지 확인 !!! 출력문에 넣어야하는 문장!
		System.out.println(t.getPokemonCnt());
		 
	}

}
