package CognizantTestngPractice;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	WebDriverWait wait;
	@BeforeClass
	public void setUp() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		wait= new WebDriverWait(driver, Duration.ofSeconds(3));
		
	}
	@Test
	@Parameters({"user","pass"})
	public void signup(String user,String pass) {
		WebElement username=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"username\"]")));
		username.sendKeys(user);
		WebElement password=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"password\"]")));
		password.sendKeys(pass);
		WebElement Login=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()=' Login ']")));
		Login.click();
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods = {"signup"})
	public void Login() {
		System.out.println("Succcessful");
	}
	
	@Test(enabled=false)
	public void skip() {
		
		System.out.println("skipped");
	}
	

}
