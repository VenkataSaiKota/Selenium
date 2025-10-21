package collectionFramework;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       
		        HashMap<Integer, String> employee = new HashMap<>();

		       
		        employee.put(18, "KOHLI");
		        employee.put(33, "HARDIK");
		        employee.put(45, "ROHIT");
		        employee.put(7, "DHONI");

		        System.out.println("Employee Map: " + employee);

		        System.out.println("Employee with ID 33: " + employee.get(33));

		
		        if (employee.containsKey(33)) {
		            System.out.println("Employee ID 33 exists.");
		        }

		     
		        if (employee.containsValue("KOHLI")) {
		            System.out.println("KOHLI is in the employee list.");
		        }

		     
		        employee.remove(7);
		        System.out.println("After removing ID 7: " + employee);

		       
		        System.out.println("Iterating through the HashMap:");
		        for (Object id : employee.keySet()) {
		            System.out.println("ID: " + id + ", Name: " + employee.get(id));
		        }

		        
		        System.out.println("Total number of employees: " + employee.size());
		    }
		


	}
