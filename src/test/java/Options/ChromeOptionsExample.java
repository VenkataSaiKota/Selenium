package Options;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
@Test
public void Examples() {


ChromeOptions options = new ChromeOptions();
//options.addArguments("--headless=new");
//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
options.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Test passed");
	}
	else {
		System.out.println("Test failed");
	}
	
}
}
