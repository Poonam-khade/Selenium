package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_contains {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		// Using contains method
		
		driver.findElement(By.xpath("//*[contains(@id,'txtU')]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("(//*[contains(@name,'txt')])[2]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[contains(@class,'button')]")).click();
		
		
		// Xpath with Logical operator
//		driver.findElement(By.xpath("//*[@name='txtUsername' and @ id='txtUsername']"));
//		
//		driver.findElement(By.xpath("(//*[@name='txtPassword' or @ id='txtUsername'])[2]"));
//		
		
		
	}
}
