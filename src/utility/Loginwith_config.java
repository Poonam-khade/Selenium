package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginwith_config {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Properties prop = new Properties();
		
		FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		
		prop.load(input);
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUsername")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.name("txtPassword")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.name("Submit")).click();
		
	}
}
