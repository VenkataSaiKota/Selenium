package Udemy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassExample {
	@BeforeClass
	void login() {
		System.out.println("This is login..");
		
	}
	@Test(priority = 0)
	void search() {
		System.out.println("THis is search");
		
	}
	@Test(priority = 1)
	void advancedSearch() {
		System.out.println("This is a  advances search");
	}
	@AfterClass
	void logout() {
		System.out.println("THis is logout");
	}
}
