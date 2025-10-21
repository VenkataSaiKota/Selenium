package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	WebElement usernamElement;
	@FindBy(id="password")
	WebElement passElement;
	@FindBy(xpath="//button[normalize()='Login']")
	WebElement submitElement;
	
	public void setUserName(String user) {
		usernamElement.sendKeys(user);
	}
	public void setpass(String pass) {
		passElement.sendKeys(pass);
	}
	public void click() {
	submitElement.click();
	}
	
	
}
