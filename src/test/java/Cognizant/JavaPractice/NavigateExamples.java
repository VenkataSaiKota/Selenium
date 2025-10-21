package Cognizant.JavaPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
//import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateExamples {
	@Test
	public void Examples() throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//URL myUrl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://www.flipkart.com");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.navigate().refresh();
		}

}
