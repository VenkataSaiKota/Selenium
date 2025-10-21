package Cognizant.JavaPractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	@Test
	public void methods() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement display=driver.findElement(By.xpath("//a[text()='Gmail']"));
		if(display.isDisplayed()) {
			System.out.println("displa");
		}

	}

}
