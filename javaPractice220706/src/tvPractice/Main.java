package tvPractice;

public class Main {

	public static void main(String[] args) {
		
        Tv t = new Tv();
        t.power();
        t.channel = 9;
        t.channelDown();
        t.channelUp();
        System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}
