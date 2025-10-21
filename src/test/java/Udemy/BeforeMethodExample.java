package Udemy;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class BeforeMethodExample {
	@BeforeMethod
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
	@AfterMethod
	void logout() {
		System.out.println("THis is logout");
	}
	

}
