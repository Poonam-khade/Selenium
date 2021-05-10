package TestNG_Disscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_testNG {
	static WebDriver driver;
	@Test
	public void testcase1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
       driver.findElement(By.id("txtUsername")).sendKeys("Adm");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin1");
		
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		
		String errormsg = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		
	    SoftAssert soft = new SoftAssert();
	
	    soft.assertEquals(errormsg, "Invalid credentialss","test case fail");
	    
	    System.out.println("after soft get executed");
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().refresh();
	    
	    driver.close();
	    
	    soft.assertAll();   //without declaring it show test case pass

	}

}
