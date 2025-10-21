package TestngXmlExample;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Login extends BaseClass {
	@BeforeTest
		public void getURL() {
			driver.get("https://training-support.net/webelements/login-form/");
		}

	@AfterTest
	public void disconnect() {
		System.out.println("Disconnect succesfully");
	}
	

}
