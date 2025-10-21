package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle("BenzCar",100000,"90/hr") ;
		Vehicle v2=new Vehicle("REClassicBike",50000,"80/hr");
		Vehicle v3=new Vehicle("GTBike",40000,"120/hr") ;
		
		
		List<Vehicle>vehicle=Arrays.asList(v1,v2,v3);
//		Collections.sort(vehicle,new VehiclesBasedOnName());
//		Collections.sort(vehicle,new VehiclesBasedOnCost());
		Collections.sort(vehicle,(s1,s2)->Integer.compare(s1.cost,s2.cost));
		System.out.println(vehicle);
		
		
		

	}

}
