package Udemy;

import org.testng.annotations.Test;

public class SignUpTests {
	@Test(priority = 0,groups = {"R"})
	void signByEmail() {
		System.out.println("THis is sign by emaill");
	}
	@Test(priority = 1,groups = {"R"})
	void signByfb() {
		System.out.println("THis is sign by fb");
	}
	
	@Test(priority = 2,groups = {"R"})
	void signByx() {
		System.out.println("THis is sign by x");
	}

}
