package Cognizant.JavaPractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	@Test
	public void Examples() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
//		WebElement parentElement=driver.findElement(By.xpath("//a[text()='Desktops']"));
//		WebElement childElement=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
//		Actions actions=new Actions(driver);
//		actions.moveToElement(parentElement).moveToElement(childElement).click().build().perform();
	}

}
