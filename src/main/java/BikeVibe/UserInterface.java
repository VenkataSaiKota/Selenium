package BikeVibe;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bike details");
		String det=sc.nextLine();
		try {
			Bike bike=Bike.verifyBikeDetails(det);
			System.out.println("Bike Details");
			System.out.println("Bike Model: "+bike.getBikeModel());
			System.out.println("Bike Type: "+bike.getBikeType());
			System.out.println("Bike Status: "+bike.getBikeStatus());
			System.out.println("Bike price: "+bike.getBikePrice());
		}
		catch(InvalidException e) {
			System.out.println(e.getMessage());
		}

	}

}
