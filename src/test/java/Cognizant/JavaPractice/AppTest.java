package Cognizant.JavaPractice;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.Keys;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
   @Test
    public void shouldAnswerWithTrue() {
    	WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Full name']"));
		name.sendKeys("venkat");
		name.sendKeys(Keys.CONTROL,"a");
		name.sendKeys(Keys.CONTROL,"c");
		WebElement mail=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		mail.sendKeys(Keys.CONTROL,"v");
		WebElement additional=driver.findElement(By.tagName("textarea"));
		additional.sendKeys("additional information");
		
    }
   // @Test
    public void KeysActions() {
    	WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Full name']"));
		name.sendKeys("venkat");
		WebElement mail=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		WebElement submit=driver.findElement(By.xpath("//button[@class='font-bold svelte-7bqce9']"));
		Actions action=new Actions(driver);
		action.keyDown(name,Keys.CONTROL)
		      .sendKeys("a")
		      .sendKeys("c")
		      .keyUp(Keys.CONTROL)
		      .perform();
		action.keyDown(mail,Keys.CONTROL)
		      .sendKeys("v")
		      .keyUp(Keys.CONTROL)
		      .click(submit)
		      .perform();
    	 driver.quit();
    }
}
