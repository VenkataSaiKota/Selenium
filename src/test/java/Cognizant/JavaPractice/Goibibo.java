package Cognizant.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.*;

public class Goibibo {
	@Test
	public void method() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=bing&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Goibibo-Flight&utm_term=!SEM!DF!B!Brand!RSA&cmp=SEM|D|DF|B|Bing-CPC-Brand|DF-Brand-EM|Goibibo-Flight|RSA&msclkid=c552f916a6f8128652bd91c0a8f5430a");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement closePopup = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@role='presentation']")));
		closePopup.click();
		
		WebElement from = driver.findElement(By.xpath("(//span[text()='From']/parent::div)[1]"));
		from.click();
		
		
		WebElement fromInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='From']/following-sibling::input[@type='text']")));
		fromInput.sendKeys("Hyderabad");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".autoCompleteTitle")));

       List<WebElement> suggestion1 = driver.findElements(By.cssSelector(".autoCompleteTitle"));
        for (WebElement sugg1 : suggestion1) {
       System.out.println(sugg1.getText());
      

   	     }
        suggestion1.get(0).click();
        System.out.println("To");
       WebElement to=driver.findElement(By.xpath("(//span[text()='To']/parent::div)[2]"));
       to.click();
//   
       WebElement toInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='To']/following-sibling::input[@type='text']")));
      // toInput.click();
	   toInput.sendKeys("Vijayawada");
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".autoCompleteTitle")));
    
       List<WebElement> suggestion2 = driver.findElements(By.cssSelector(".autoCompleteTitle"));
       for (WebElement sugg2 : suggestion2) {
            System.out.println(sugg2.getText());
           }
       suggestion2.get(0).click();
    

    
System.out.println("search");
WebElement search=driver.findElement(By.cssSelector(".sc-12foipm-72"));
search.click();

wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".makeFlex")));
List<WebElement> flights = driver.findElements(By.cssSelector(".makeFlex"));
for (WebElement flight : flights) {
   System.out.println("Flight Details:\n" + flight.getText());
   System.out.println("--------------------------------------------------");
}

}
        }


