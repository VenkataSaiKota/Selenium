package Cognizant.JavaPractice;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVR {
   @Test
	public void mirai() throws InterruptedException {
		// TODO Auto-generated method stub
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   driver.get("https://www.pvrcinemas.com");

	   WebElement location = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Hyderabad']")));
	   location.click();

	   
	   WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='p-inputtext p-component']")));
	   search.sendKeys("Mirai");

	   
	   WebElement movieClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='p-tabview-panels']")));
	   movieClick.click();


	   WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'dates-inactive') ")));
	   date.click();

	}

}
