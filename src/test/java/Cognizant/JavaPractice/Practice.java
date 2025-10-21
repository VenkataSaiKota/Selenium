package Cognizant.JavaPractice;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {
	@Test
	public void methods() {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--start-maximize");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
//		name.sendKeys("Admin");
//		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
//		pass.sendKeys("admin123");
//		WebElement submit=driver.findElement(By.tagName("button"));
//		submit.click();
	}

}
