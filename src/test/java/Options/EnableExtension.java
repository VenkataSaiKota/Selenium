package Options;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {
	@Test
	public void Examples() {


	ChromeOptions options = new ChromeOptions();
	File file= new File("C:\\Users\\2440823\\OneDrive - Cognizant\\Documents\\SelectorsHub.crx");
	options.addExtensions(file);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
}
}
