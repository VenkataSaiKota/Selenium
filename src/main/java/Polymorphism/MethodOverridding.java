package Polymorphism;

class Ride{
	
	public void ridebook() {
		System.out.println("This is the Ride class ");
	}
	
}
class BikeRide extends Ride{
	public void ridebook() {
		
		System.out.println("This is the BikeRide class ");
	}
	
}
class CarRide extends Ride{
	
	public void ridebook() {
		System.out.println("This is the CarRide class ");
	}
	
}
public class MethodOverridding {

	public static void main(String[] args) {
		Ride b=new BikeRide();
		b.ridebook();
		Ride c=new CarRide();
		c.ridebook();
		

	}

}
