package TestNG_Disscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignWith_OrangeHrm {
   static WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
     @Test
	public void testcase()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Adm");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin1");
		
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		
		Assert.assertEquals("Invalid credentials", "Invalid credentials");
	}
}
