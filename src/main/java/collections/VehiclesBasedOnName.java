package collections;

import java.util.Comparator;

public class VehiclesBasedOnName implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		return o1.name.compareTo(o2.name);
	}

	
	
	

}
