package IRCTC;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Irctc {
@Test
public void example() throws IOException, TesseractException, TimeoutException {

    EdgeOptions options = new EdgeOptions();
    options.addArguments("--disable-notifications");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement okElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type=\"submit\" and text()='OK']")));
	okElement.click();
	WebElement ok=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@id='disha-banner-close']")));
	WebElement three=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='h_menu_drop_button hidden-xs']//a")));
	three.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", ok);	
	WebElement Login=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='LOGIN']")));
	Login.click();
	WebElement userName=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder=\"User Name\"]")));
	userName.sendKeys("venkatsaipandu");
	WebElement pass=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder=\"Password\"]")));
	pass.sendKeys("Pandu@06");
	WebElement captchaElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='captcha-img']")));

	 File screenshot = captchaElement.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:/Users/2440823/OneDrive - Cognizant/Desktop/captcha.png");

	            screenshot.renameTo(destination);

	            // Step 3: OCR using Tesseract
	            ITesseract tesseract = new Tesseract();
	            tesseract.setDatapath("C:/Users/2440823/eclipse-workspace/JavaPractice/test-data"); // Replace with actual path
	            tesseract.setLanguage("eng");

	            String captchaText;
	            try {
	                captchaText = tesseract.doOCR(destination);
	                System.out.println("Extracted CAPTCHA Text: " + captchaText);
	            } catch (TesseractException e) {
	                System.out.println("OCR failed: " + e.getMessage());
	                return;
	            }

	            // Step 4: Enter CAPTCHA text
	            try {
	                WebElement captchaInput = driver.findElement(By.xpath("//input[@id='captcha']"));
	                captchaInput.sendKeys(captchaText.trim());
	            } catch (NoSuchElementException e) {
	                System.out.println("CAPTCHA input field not found: " + e.getMessage());
	            }

	              catch (Exception e) {
	            e.printStackTrace();
	            }
	        
	WebElement signin=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='SIGN IN']")));
	signin.click();
	
}
}
