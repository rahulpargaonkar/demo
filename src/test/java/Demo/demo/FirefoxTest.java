package Demo.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FirefoxTest {
	
			
		
		@Test
		public void FFTest() {
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			FirefoxOptions firefoxOptions = new FirefoxOptions(capabilities);
			firefoxOptions.addArguments("--width=1920");
			firefoxOptions.addArguments("--height=1080");
			System.setProperty("webdriver.gecko.driver","/Users/in-rahulpa/eclipse-workspace/demo/src/test/java/binaries/geckodriver");
			 
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("http://www.google.com");
		}
	
}