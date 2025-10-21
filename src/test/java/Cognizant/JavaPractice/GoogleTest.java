package Cognizant.JavaPractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class GoogleTest {
	@Test
    public void openGoogle() throws InterruptedException 
	{
    	WebDriver driver =new ChromeDriver();
    	driver.get("https://training-support.net/webelements/drag-drop");
    	Actions action=new Actions(driver);
    	WebElement ball=driver.findElement(By.xpath("//img[@id='ball']"));
    	WebElement left=driver.findElement(By.id("dropzone1"));
    	WebElement right=driver.findElement(By.id("dropzone2"));
//    	action.dragAndDrop(ball,left).release().perform();
//    	Thread.sleep(2000);
//    	action.dragAndDrop(ball,right).release().perform();
    	 Action ac=action.clickAndHold(ball).moveToElement(left).build();
    	 ac.perform();
    	Thread.sleep(2000);
    	action.clickAndHold(ball).moveToElement(right).release().perform();
    	
    	//action.clickAndHold(ball);
//    	int x1=left.getLocation().getX();
//    	int y1=left.getLocation().getY();
//		int ballWidth = ball.getLocation().getX();
//		int ballHeight = ball.getLocation().getY();
//		
//		int widthOffSetX1 = x1 - ballWidth;
//		int heightOffSetY1 = y1 - ballHeight;
//		int x2=right.getLocation().getX();
//    	int y2=right.getLocation().getY();
//	
//		
//		int widthOffSetX2 = x2 - x1;
//		int heightOffSetY2 = y2- y1;
//		Actions actions = new Actions(driver);
//		
//		actions.clickAndHold(ball).moveByOffset(widthOffSetX1, heightOffSetY1).perform();
//		//Thread.sleep(2000);
//		actions.clickAndHold(ball).moveByOffset(widthOffSetX2, heightOffSetY2).release().perform();
		
    }
	
}
