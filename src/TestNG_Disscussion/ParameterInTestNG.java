package TestNG_Disscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNG {
	static WebDriver driver;
	
	@Test
	@Parameters ("browser")
	public void testcase1(String name)
	{
		System.out.println(name);
		if(name.equalsIgnoreCase("chrome"))
		{
			

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		
		
		else if(name.equalsIgnoreCase("firefox"))
		{
			

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sachin Sanap\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		   
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}

}
}