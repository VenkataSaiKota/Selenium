package MiniProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OnlineBookSearch {
	
	WebDriverWait wait;
	WebDriver driver;
	
	public WebDriver createDriver(String urlString) {
	    driver = new ChromeDriver();
		driver.get(urlString);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		return driver;
	}
	
	

	public void SearchAutomation(String bookName) 
	
	{
		
	  WebElement inputBar= wait.until( ExpectedConditions.elementToBeClickable(By.id("inputbar")));
	  inputBar.sendKeys(bookName);

	  WebElement searchBar = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTopSearch")));
	  searchBar.click();
	    
    }
	

	public void validateSearchResultsCount()
	
	{
	        
		WebElement val = wait.until(ExpectedConditions.presenceOfElementLocated( By.xpath("//*[@id='site-wrapper']/div[1]/div[2]/div[1]/div[1]/div/b")));
	    int tot = Integer.parseInt(val.getText());

	    if (tot > 10)
	        System.out.println("Number of search results displayed are greater than 10");
	    else
	         System.out.println("Number of search results displayed are less than or equal to 10");
	}
	

	public void sortByPriceAscending()
	{
	    WebElement sort = wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlSort")));
	    Select select = new Select(sort);
	    select.selectByValue("Product_ActualPrice asc");
	}

	 public void printTopResults(int size) throws InterruptedException
	 {
	  Thread.sleep(5000);

	  List<WebElement> titles = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy( By.xpath("//div[@class='title']/child::a")));

	  List<WebElement> prices = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='sell']")));

	   for (int i = 0; i < size && i < titles.size(); i++) {
	            System.out.println("Book Title : " + titles.get(i).getText());
	            System.out.println("Cost - " + prices.get(i).getText());
	        }
	    }

	    public void tearDown() {
	        driver.quit();
	    }

	    public static void main(String[] args) throws InterruptedException, IOException {
	    	Properties props=new Properties();
	    	FileInputStream fis = new FileInputStream("src/test/java/miniproject/online.properties");
			props.load(fis);
	        OnlineBookSearch sa = new OnlineBookSearch();
	        sa.createDriver("https://www.bookswagon.com/");
	        String nameString=props.getProperty("bookName");
	        sa.SearchAutomation(nameString);
	        sa.validateSearchResultsCount();
	        sa.sortByPriceAscending();
	        //sa.printTopResults(5);
	        sa.tearDown();
	    }
	}
