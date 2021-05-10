package Program;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_Program {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	     driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");;
		
		 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");;
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
	
	 WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		
	Actions act = new Actions(driver);
	
	act.moveToElement(admin).perform();
	
	WebElement user = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	
	act.moveToElement(user).click(user).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
