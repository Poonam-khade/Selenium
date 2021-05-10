package ListenerWIthScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGpractice {

	static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void afterSuite()
	{
		driver.quit();
	}
}
