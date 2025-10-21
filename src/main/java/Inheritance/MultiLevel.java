package Inheritance;

class Vehicle{
	
	public void Type() {
		System.out.println("This is a vehicle class");
	}
	
}
class Car extends Vehicle{
	public void fuelType() 
	{
		System.out.println("Car runs on petrol/diesel");
	}
	
}
class ElectricCar extends Car{
	public void electricType() {
		System.out.println("Electric car runs on battery power");
	}
	
}
public class MultiLevel {

	public static void main(String[] args) {
		
		ElectricCar e=new ElectricCar();
		e.electricType();
		e.fuelType();
		e.Type();
		

	}

}
