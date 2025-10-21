package collections;

public class Vehicle {
	String name;
	int cost;
	String speed;
	
	public Vehicle(String name, int cost, String speed) {
		this.name = name;
		this.cost = cost;
		this.speed = speed;
	}
	
	
	@Override
	public String toString() {
		return "name=" + name + ", cost=" + cost + ", speed=" + speed ;
	}
	

}
