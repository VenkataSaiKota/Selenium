package Cognizant.JavaPractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
	@Test
	public void Example() throws InterruptedException {
		
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://training-support.net/webelements/alerts");
//	 WebElement simple=driver.findElement(By.id("simple"));
//	 simple.click();
//	 Alert al=driver.switchTo().alert();
//	 Thread.sleep(3000);
//	 al.accept();
		
	 WebElement confirm=driver.findElement(By.id("confirmation"));
	 confirm.click();
	 Alert al=driver.switchTo().alert();
	 Thread.sleep(3000);
	 al.accept();
	}
	

}
