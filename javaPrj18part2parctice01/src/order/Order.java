package order;

public class Order {
	
	

	public Order(boolean isTakeOut, int dough, int topping, int side, int drink, int price, int time) {
		this.isTakeOut = isTakeOut;
		this.dough = dough;
		this.topping = topping;
		this.side = side;
		this.drink = drink;
		this.price = price;
		this.time = time;
	}
	//data
	private boolean isTakeOut;
	private int dough;
	private int topping;
	private int side;
	private int drink;
	
	
	//getter setter
	private int price;
	private int time;
	
	public boolean isTakeOut() {
		return isTakeOut;
	}
	public void setTakeOut(boolean isTakeOut) {
		this.isTakeOut = isTakeOut;
	}
	public int getDough() {
		return dough;
	}
	public void setDough(int dough) {
		this.dough = dough;
	}
	public int getTopping() {
		return topping;
	}
	public void setTopping(int topping) {
		this.topping = topping;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getDrink() {
		return drink;
	}
	public void setDrink(int drink) {
		this.drink = drink;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	//toString
	@Override
	public String toString() {
		return "Order [isTakeOut=" + isTakeOut + ", dough=" + dough + ", topping=" + topping + ", side=" + side
				+ ", drink=" + drink + ", price=" + price + ", time=" + time + "]";
	}
	
	
	
	//method
	
}