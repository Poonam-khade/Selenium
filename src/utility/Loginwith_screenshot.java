package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginwith_screenshot {
	private static final String LoginOrange = null;
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	WebElement username = driver.findElement(By.id("txtUsername"));
	
	username.sendKeys("Admin");
		
    WebElement pass = driver.findElement(By.id("txtPassword"));
	
	pass.sendKeys("admin123");
	
	
	ScreenShot.capturescreen(driver,"login_orange");
	}

}
