package Cognizant.JavaPractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToIframe {
	@Test
	public void methods() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://training-support.net/webelements/iframes");
		WebElement frElement1=driver.findElement(By.xpath("//iframe[@title='Frame1']"));
		driver.switchTo().frame(frElement1);
		WebElement frame1=driver.findElement(By.xpath("//button[@class='bg-purple-200 mx-4 svelte-12f6vku']"));
		frame1.click();
		driver.switchTo().defaultContent();
		WebElement frElement2=driver.findElement(By.xpath("//iframe[@title='Frame2']"));
		driver.switchTo().frame(frElement2);
		WebElement frame2=driver.findElement(By.xpath("//button[@class='bg-emerald-200 mx-4 svelte-12f6vku']"));
		frame2.click();
		driver.switchTo().parentFrame();
		}

}
