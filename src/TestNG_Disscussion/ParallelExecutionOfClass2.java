package TestNG_Disscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfClass2 {
   static WebDriver driver;
	@Test
	public void testcase3()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN714G0&p=postman+tool+download");
		
	}
	
	
	
	
	
	
}
