package ListenerWIthScreenShot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Excel_write;

public class TestCaseListener extends TestNGpractice {
	
	
	@Test
	
	public void testcase1( String value) throws IOException
	{
        driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin1234");
		
		driver.findElement(By.name("Submit")).click();
		
		Assert.assertEquals(true, false);
		
		System.out.println("test case get failed"+value);
		
		Excel_write.writeData(8, 2);
	}
	
	

}
