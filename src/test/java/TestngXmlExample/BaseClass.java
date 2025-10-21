package TestngXmlExample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	static WebDriver driver;
    WebDriverWait wait;
    
	@BeforeClass
	public void setUp(ITestContext conext) {
		
	 driver = new ChromeDriver();   
	 driver.get("https://training-support.net/webelements/login-form/");
	 conext.setAttribute("drivername", driver);
	    
	}
	@AfterClass
	public void end() throws InterruptedException
	{   Thread.sleep(3000);
		driver.quit();
	}

}
