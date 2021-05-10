package TestNG_Disscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfClass1 {
   static WebDriver driver;
	@Test
	public void testcase1()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void testcase2()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	}
	
	
	
	
}
