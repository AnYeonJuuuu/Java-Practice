package hashCode_toString;

import java.util.Objects;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//hashCode 와 equals 어떻게 오버라이딩 하는지.
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	//카드의 조상에 오브젝트가 포함 되는지 아닌지 확인
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind)&& this.number == c.number;
	}
	//object 클래스의 toString()을 오버라이딩 !! 중요
	public String toString() {
		return "kind : " + kind + ", number = " + number;
	}
}
public class HashCode_toString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		   
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
