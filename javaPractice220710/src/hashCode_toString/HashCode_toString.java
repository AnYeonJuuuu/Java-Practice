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
	
	//hashCode �� equals ��� �������̵� �ϴ���.
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	//ī���� ���� ������Ʈ�� ���� �Ǵ��� �ƴ��� Ȯ��
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind)&& this.number == c.number;
	}
	//object Ŭ������ toString()�� �������̵� !! �߿�
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
