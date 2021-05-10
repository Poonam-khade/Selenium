package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverEffect {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		 WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(admin).perform();
		
		WebElement usermanage = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		
		act.moveToElement(usermanage).perform();
	
		WebElement user = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
		
		act.sendKeys(user, Keys.ENTER).perform();
		
	}

}
