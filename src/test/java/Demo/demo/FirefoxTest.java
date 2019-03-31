package Demo.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	
			
		
		@Test
		public void FFTest() {
			System.setProperty("webdriver.gecko.driver","/Users/in-rahulpa/eclipse-workspace/demo/src/test/java/binaries/geckodriver");
			 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		}
	
}