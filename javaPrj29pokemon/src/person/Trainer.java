package person;

import java.util.HashMap;
import java.util.Map;

import mob.Pokemon;

public class Trainer {

	
	@Override
	public String toString() { 
		return "Trainer [name=" + name + ", level=" + level + "]";
	}

	// 생성자
	public Trainer(String name, int level) {
		
		this.name = name;
		this.level = level;
	} 
	
	//data
	private String name;
	private int level;
//	private Pokemon[] pocket; // 배열 이용 : 여러 개의 포켓몬들을 넣을 수 있음 ((단점 : 만들어 놓은 배열 크기가 정해져 있기 때문에 배열 이용시 불편,
	//모든 칸들을 확인해서 값을 찾아야 하기 때문에 불편)) 
	private final Map<String, Pokemon> pocket = new HashMap<>(); 
	//해쉬맵 객체 생성 : 포켓에 해쉬 맵이 만들어짐!, 키 밸류 형태로 데이터를 넣어 줄 수 있음
	//키값으로는 문자열(포켓몬 이름), 밸류값으로는 포켓몬 객체 넣기.
	// final 키워드 붙이면 재할당 못하도록!!, 포켓 변수에 다른게 들어갈 수 없게 만듦
	
	//method
	public Pokemon getPokemon(String name) {
//		Pokemon p = pocket.get(name); //포켓이라는 맵에서 피카츄 네임을 키값으로 접근해서 객체를 데려옴
//		return p; // 메소드 이용해서 피카츄를 리턴해줄 것! 따라서 리턴 타입도 포켓몬으로
		return pocket.get(name); // 위의 주석 두 줄과 같은 의미!
	}
	
	public void addPokemon(Pokemon p) {
		pocket.put(p.getName(), p); // 메소드 호출할 때 포켓몬 이름, 객체 넣어주게 됨!//
	}
	
	//getter setter
	public String getName() {
		return name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		if(level > this.level) {//전달받은 레벨이 지금 레벨보다 클 때만
			this.level = level; //그냥 this.level로 하면 전달받은 레벨이 현재 보다 낮은 레벨로 바뀔 수 있기 때문에 조건문 이용하였음!
		}else {
			System.out.println("레벨은 현재 레벨보다 낮아질 수 없습니다.");
		}
	}

	//호출하면 현재 내가 가진 포켓몬 숫자 알려주는 메서드!
	public int getPokemonCnt() {
		return pocket.size();
	}
	

	
	
}
