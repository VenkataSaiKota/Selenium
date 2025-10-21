package DataProviderPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DataProviderDemo {
	 WebDriver driver;
@BeforeClass
 void setUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
 }

@Test
 void testLogin() {
	 
 }

@AfterClass
 void tearDown() {
	driver.quit(); 
 }
}
