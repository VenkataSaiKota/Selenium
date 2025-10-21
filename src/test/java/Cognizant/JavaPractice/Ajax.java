package Cognizant.JavaPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Test;

public class Ajax {
 @Test
 public void ajax() {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://v1.training-support.net/selenium/ajax");
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 WebElement submit=driver.findElement(By.xpath("//button[@class='ui violet button']"));
	 submit.click();
	 boolean resElement=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
	 WebElement late=driver.findElement(By.tagName("h3"));
	 System.out.println(late.getText());
	 driver.switchTo().newWindow(WindowType.TAB);
 }
 
}
