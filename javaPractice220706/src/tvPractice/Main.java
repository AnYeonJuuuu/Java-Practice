package tvPractice;

public class Main {

	public static void main(String[] args) {
		
        Tv t = new Tv();
        t.power();
        t.channel = 9;
        t.channelDown();
        t.channelUp();
        System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
	}

}
