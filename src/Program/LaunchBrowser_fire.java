package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser_fire {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachin Sanap\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
	}

}
