package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		///for username Control +F used for write a xpath
		
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
		
		// Password
		
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		// Login Button
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.xpath("//*[@name='Submit']")).click();
//		driver.findElement(By.xpath("//*[@class='button']"));
//		driver.findElement(By.xpath("//*[@value='LOGIN']"));
//		driver.findElement(By.xpath("//*[@id='btnLogin']"));
//		
//		
	}
	
	
}
