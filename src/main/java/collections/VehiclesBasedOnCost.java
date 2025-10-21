package collections;

import java.util.Comparator;

public class VehiclesBasedOnCost implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.cost, o2.cost);
	}

}
