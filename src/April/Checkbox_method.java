package April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_method {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
	WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_10']"));
	
	//checkbox.click();
	 boolean issel = checkbox.isSelected();
	 
	 System.out.println(issel);
	 
	boolean enable = checkbox.isEnabled();
	System.out.println(enable);
	
    boolean display = checkbox.isDisplayed();
    System.out.println(display);
		
		
	}
}
