package Cognizant.JavaPractice;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OnlineBookSearch {
	
	@Test
	public void methods() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bookswagon.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement inputBar=wait.until(ExpectedConditions.elementToBeClickable(By.id("inputbar")));
		inputBar.sendKeys("Selenium Webdriver");
		WebElement searchBar=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTopSearch")));
		searchBar.click();
		WebElement val=driver.findElement(By.xpath("//*[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/div/b"));
		int tot=Integer.parseInt(val.getText());
		if(tot>10)
		  System.out.println("Number of search results displayed are greater than 10");
		else
			System.out.println("Number of search results displayes are less than or equal to 10");
		WebElement sort=wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlSort")));
		Select select=new Select(sort);
		select.selectByValue("Product_ActualPrice asc");
	    Thread.sleep(5000);
        List<WebElement> titles = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#listSearchResult > div > div.product-summary > div.title > a")));

        List<WebElement> prices = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#listSearchResult > div > div.product-summary > div.price-attrib > div.price > div.sell")));
	
        int size=5;
		int i=0;
		while(i<size) {
		 System.out.println("Book Title : " +titles.get(i).getText());
		 System.out.println("Cost - "+prices.get(i).getText());
		 i++;
				
			       }
		driver.close();
		}
		
	

		
	}

