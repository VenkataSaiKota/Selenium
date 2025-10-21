package Cognizant.JavaPractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
	@Test 
	public void methods() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start maximized");
		WebDriver driver=new ChromeDriver(options);
		
	}

}
