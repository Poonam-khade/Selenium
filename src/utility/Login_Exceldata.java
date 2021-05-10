package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Exceldata {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys(Excel_Reader1.readdata(0,0));
		
		driver.findElement(By.name("txtPassword")).sendKeys(Excel_Reader1.readdata(0, 1));
		
		driver.findElement(By.xpath("//*[@type = 'submit']")).click();
		
	}
}
