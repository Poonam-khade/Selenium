package April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {
	
	
		public static void main(String[] args)  {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://opensource-demo.orangehrmlive.com/");
					
					driver.manage().window().maximize();
					
					driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
					
					driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
					
					driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
					
					driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]")).click();
					driver.findElement(By.xpath("(//*[text()='My Leave'])[2]")).click();
					
					driver.findElement(By.xpath("//*[@id='calFromDate']")).click();
					
					 WebElement month = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
					
					Select s = new Select(month); 
					s.selectByIndex(7);
					
					WebElement year = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
					
					Select y = new Select(year);
					y.selectByValue("1993");
					
					driver.findElement(By.xpath("//*[text()=15]")).click();
	}

}
