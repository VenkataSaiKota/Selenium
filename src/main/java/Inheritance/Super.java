package Inheritance;

class Vehi{
	String name;
	public Vehi(String name){
		this.name=name;
	}

}
class Bike extends Vehi{
	int cost;
	public Bike(String name,int cost){
		super(name);
		this.cost=cost;
	}
	public void display() {
		System.out.println("Bike name is "+super.name +" cost is "+this.cost);
	}
	
	
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike("GT",400000);
		bike.display();
		

	}

}
