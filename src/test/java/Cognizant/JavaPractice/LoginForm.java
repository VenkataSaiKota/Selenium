package Cognizant.JavaPractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {
	
	@Test
	public void submit() {
		WebDriver web=new ChromeDriver();
		web.get("https://training-support.net/webelements/login-form");
		web.manage().window().maximize();
		WebElement name=web.findElement(By.xpath("//input[@type='text']"));
		WebElement pass=web.findElement(By.xpath("//input[@type='password']"));
		WebElement submit=web.findElement(By.xpath("//button[@class='svelte-1pdjkmx']"));
		name.sendKeys("admin");
		pass.sendKeys("admin");
		
		if(submit.isEnabled()) {
			System.out.println("submit button is selected");
			submit.click();
		}
		

		
	}

}
