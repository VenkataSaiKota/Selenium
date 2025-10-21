package Cognizant.JavaPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowHandle {
	@Test
	public void Examples() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("admin123");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		
		
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@target='_blank'])[5]"))).click();
		Set<String> idsSet=driver.getWindowHandles();
		ArrayList<String> idList=new ArrayList<>(idsSet);
		String parentString=idList.get(0);
		String childString=idList.get(1);
		Thread.sleep(3000);
		//driver.switchTo().window(childString);
		//driver.quit();
	
		for(String idString:idList) {
			String titleString=driver.switchTo().window(idString).getTitle();
			if(titleString.equals("Human Resources Management Software | HRMS | OrangeHRM")) {
				System.out.println(titleString);
				driver.close();
				break;
			}
			else {
				System.out.println(titleString);
			}
		}
		
		
		
		
		
	}

}
