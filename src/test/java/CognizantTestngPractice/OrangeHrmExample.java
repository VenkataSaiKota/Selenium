package CognizantTestngPractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CognizantTestngPractice.ListenerExample.class)
public class OrangeHrmExample {
	WebDriver driver;
	WebDriverWait wait;
	SoftAssert as;
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        as=new SoftAssert();
	}
	
	@Test(priority = 0)
	public void signup() {
		WebElement username=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"username\"]")));
		username.sendKeys("Admin");
		WebElement password=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"password\"]")));
		password.sendKeys("admin123");
		WebElement Login=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()=' Login ']")));
		Login.click();
		as.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/inde");
	    as.assertAll();
	}
	

	
	
	
	@Test(dependsOnMethods = {"signup"})
	public void Login() {
		System.out.println("Login succesfully");
		
	}
	@Test
	public void FailedLoginException() {
		as.assertTrue(true);
	}
	
	@Test(enabled =false)
	public void skipp() {
		as.assertFalse(false);
	}
	@AfterClass()
	public void Final() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("page closed successfully");
		driver.quit();
	}
	

}
