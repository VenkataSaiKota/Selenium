package Udemy;

import org.testng.annotations.Test;

public class PaymentTests {
 @Test(priority = 0,groups = {"R","s"})
 void paymentInrs() {
	 System.out.println("this is rs");
 }
 @Test(priority = 1,groups={"R","s"})
 void paymentInDollars() {
	 System.out.println("this is Dollars");
 }
}
