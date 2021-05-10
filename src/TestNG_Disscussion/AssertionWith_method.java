package TestNG_Disscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionWith_method {

	static WebDriver driver;
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Adm");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin1");
		
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		
		String errormsg = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		
		Assert.assertEquals(errormsg, "Invalid credentials","test case fail");
		
	}
	
	@Test
	public void testcase2()
	{
		  Assert.assertTrue(true, "test case got failed");    //test case pass
		 // Assert.assertFalse(true);                           //test case fail
		  //Assert.assertNotEquals(10.46, 13.78, "test case got failed");   //test case pass
		 
    	}
}






