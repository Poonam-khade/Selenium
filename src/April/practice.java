package April;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {
	
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	

	for(int i=1;i<=16;i++)
	{
		if(i%2==0)
		{
			driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		}
	}
	
}
}
