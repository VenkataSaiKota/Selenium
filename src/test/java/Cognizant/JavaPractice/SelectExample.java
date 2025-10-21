package Cognizant.JavaPractice;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SelectExample {
//	@Test
	public void Example() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		driver.manage().window().maximize();
		//WebElement s=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[2]/select"));
		WebElement s1=driver.findElement((By.xpath("//option[@value='rust']/parent::select")));
         
		 Select select=new Select(s1);
		 select.selectByVisibleText("JavaScript");
		 select.selectByIndex(4);
		 select.selectByIndex(5);
		 select.selectByIndex(6);
		 select.selectByValue("nodejs");
		 select.deselectByIndex(5);
		 driver.close();
		 
		}
	
	@Test
	public void Example2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//WebElement s=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[2]/select"));
		WebElement s1=driver.findElement((By.id("APjFqb")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Stay signed out']/parent::span/parent::div/parent::div")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		s1.sendKeys("dgdfg");
//		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[1]")));
//		element.click();
		Actions actions=new Actions(driver);
		actions.keyDown(s1,Keys.ENTER);
//         
//		 Select select=new Select(s1);
//		 select.selectByVisibleText("JavaScript");
//		 select.selectByIndex(4);
//		 select.selectByIndex(5);
//		 select.selectByIndex(6);
//		 select.selectByValue("nodejs");
//		 select.deselectByIndex(5);
//		 driver.close();
		 
		}
	
	

}
