package Cognizant.JavaPractice;

import java.time.Duration;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToWindow {
	@Test
		public void methods() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
			search.sendKeys("Shoes");
			search.sendKeys(Keys.ENTER);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div/a/div[1]/div"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a/div[1]"))).click();

			String par=driver.getWindowHandle();
			System.out.println(driver.getCurrentUrl());
			Set<String>ids=driver.getWindowHandles();
			for(String val:ids) {
				if(!val.equals(par))
				     driver.switchTo().window(val);
				     System.out.println(driver.getTitle());
				
				//String chi=driver.getWindowHandle();
			}
		
			
			
	}

}
