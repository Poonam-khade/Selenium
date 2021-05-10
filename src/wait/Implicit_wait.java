package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("khadepoonam07@gmail.com");
		
		driver.findElement(By.xpath("(//*[@class='absolute-center btn51ParentDimension'])[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='login_password1']")).sendKeys("Shivansh123");
		
		driver.findElement(By.xpath("(//*[@class='absolute-center'])[2]")).click();
		
	}

}
