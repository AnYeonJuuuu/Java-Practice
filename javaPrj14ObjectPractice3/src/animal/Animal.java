package animal;

public class Animal {
	
	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
		

	//getter setter
	private String name;
	private double weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + "]";
	}
	
	
	
}
