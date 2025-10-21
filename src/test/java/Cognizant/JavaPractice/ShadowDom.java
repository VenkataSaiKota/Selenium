package Cognizant.JavaPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDom {
	@Test
	public void shadow() {
		 WebDriver driver=new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		
//	    WebElement parent=driver.findElement(By.cssSelector("shop-app"));
//	    SearchContext parentShadow=parent.getShadowRoot();
//	    WebElement child=parentShadow.findElement(By.cssSelector("iron-pages > shop-home "));
//	    SearchContext childShadow=child.getShadowRoot();
//	    WebElement target=childShadow.findElement(By.cssSelector("div:nth-of-type(1) > shop-button"));
//	    WebElement tar=target.findElement(By.cssSelector("a"));
//	    tar.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = (WebElement) js.executeScript("return document.querySelector('shop-app')"
				+ ".shadowRoot.querySelector('iron-pages > shop-home')"
				+ ".shadowRoot.querySelector('div:nth-of-type(1) > shop-button > a')");
		targetElement.click();
	}

}
