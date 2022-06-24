package order;

public class Order {
	
	
	
	public Order(boolean isTakeOut, int base, int maintopping, int topping, int sourse, int price, int time) {
		super();
		this.isTakeOut = isTakeOut;
		this.base = base;
		this.maintopping = maintopping;
		this.topping = topping;
		this.sourse = sourse;
		this.price = price;
		this.time = time;
	}

	boolean isTakeOut; 
	int base ;
	int maintopping; 
	int topping ;
	int sourse; 
	int price;
	int time;
	
	public void menuMent() {
		System.out.println("메뉴를 선택해주세요");
	}

	public boolean isTakeOut() {
		return isTakeOut;
	}

	public void setTakeOut(boolean isTakeOut) {
		this.isTakeOut = isTakeOut;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getMaintopping() {
		return maintopping;
	}

	public void setMaintopping(int maintopping) {
		this.maintopping = maintopping;
	}

	public int getTopping() {
		return topping;
	}

	public void setTopping(int topping) {
		this.topping = topping;
	}

	public int getSourse() {
		return sourse;
	}

	public void setSourse(int sourse) {
		this.sourse = sourse;
	}

	public int getPrice() {
		return price;
	}

	public void addPrice(int price) {
		this.price += price;
	}

	public int getTime() {
		return time;
	}

	public void addTime(int time) {
		this.time += time;
	}

	@Override
	public String toString() {
		return "===== 싱싱 샐러드 주문확인서 =====" 
				+ "\n [ 포장여부 = " + isTakeOut + " ]"
				+ "\n [ base = " + base
				+ " , maintopping = " + maintopping + ""
				+ ", topping = "+ topping + ", sourse = " + sourse + "]"
				+"\n [ 총 금액 = " + price + "원 , 소요시간 = " + time + "분 입니다. ]";
	}
	
	
	
}
