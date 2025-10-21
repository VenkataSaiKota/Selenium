package ScreenShot;

import java.io.File;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Speficlocation {
 @Test
 public void Examples() throws InterruptedException {
	 WebDriver driver=new EdgeDriver();
	 driver.get("https://www.amazon.com/");
	 driver.manage().window().maximize();
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	 WebElement specificElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("a5481171-ee76-4bd0-9c7a-821cf11df7f6")));
	 Thread.sleep(3000);
	 File srcFile=specificElement.getScreenshotAs(OutputType.FILE);
	 File tarFile=new File("C://Users//2440823//OneDrive - Cognizant//Pictures//Screenshots//sp.png");
	 srcFile.renameTo(tarFile);
 }
}
