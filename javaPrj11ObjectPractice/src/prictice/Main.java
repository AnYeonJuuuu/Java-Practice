package prictice;

public class Main {

	public static void main(String[] args) {

		Food f1 = new Food();
		
		
		//값 넣기
		f1.setCal(600);
		f1.setIsDouble('Y');
		f1.setMenu("제육볶음");
		f1.setPrice(9000);
		
		//출력 : 메서드를 Food에 만들어서 값 호출하여
		f1.printInfo();
		
	    System.out.println(f1.toString());
		
	}

}
