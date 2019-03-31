package Demo.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FirefoxTest {
	
			
		
		@Test
		public void FFTest() {
		
		 FirefoxOptions firefoxOptions = new FirefoxOptions();
		 firefoxOptions.setHeadless(true);
		 System.setProperty("webdriver.gecko.driver",
		  "/Users/in-rahulpa/eclipse-workspace/demo/src/test/java/binaries/geckodriver"
		 );
		
		 WebDriver driver = new FirefoxDriver(firefoxOptions);
		
		 
			// System.setProperty("webdriver.chrome.driver", "/Users/in-rahulpa/eclipse-workspace/demo/src/test/java/binaries/chromedriver");
			// WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		System.out.println("TITLE===== "+driver.getTitle());

		driver.quit();

		}
	
}