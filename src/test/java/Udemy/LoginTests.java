package Udemy;

import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority = 0,groups = {"s"})
	void loginByEmail() {
		System.out.println("THis is login by emaill");
	}
	@Test(priority = 1,groups = {"s"})
	void loginByfb() {
		System.out.println("THis is login by fb");
	}
	
	@Test(priority = 2,groups = {"s"})
	void loginByx() {
		System.out.println("THis is login by x");
	}

}
