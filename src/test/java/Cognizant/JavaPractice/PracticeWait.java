package Cognizant.JavaPractice;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PracticeWait {
	@Test 
	public void methods() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/alerts");
		 driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement btn=driver.findElement(By.id("simple"));
		 btn.click();
		//boolean is=
			Alert al=wait.until(ExpectedConditions.alertIsPresent());
			al.accept();
				
			}
		//if(is) {
			//System.out.println(driver.findElement(By.xpath(("//h2[@id='word']"))).getText());
		//}
	}

