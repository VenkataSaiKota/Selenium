package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {



	    public static void main(String[] args) {
	        // Create an ArrayList of Strings
	        ArrayList<String> car_names = new ArrayList<>();

	      
	        car_names.add("BMW");
	        car_names.add("THOR");
	        car_names.add("TOYOTO");
	        car_names.add("BENZ");

	       
	        System.out.println("cars List: " +car_names);

	     
	        System.out.println("First car: " + car_names.get(0));

	     
	        car_names.set(2, "BALINO");
	        System.out.println("Updated cars List: " +car_names);

	        
	        car_names.remove("BALINO");
	        System.out.println("After removing BALINO: " + car_names);

	        
	        if (car_names.contains("BMW")) {
	            System.out.println("BMW is in the list.");
	        }

	    
	        System.out.println("Iterating through the list:");
	        
	        for (String f : car_names) {
	            System.out.println(f);
	        }

	      
	        System.out.println("Total number of CARS: " + car_names.size());
	    }
	}

