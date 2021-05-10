package Groww;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		
		Thread.sleep(2000);
	 
		driver.findElement(By.xpath("//div[@id='gmail_signin_button']")).click();
		
		//driver.findElement(By.xpath("//*[@type='email']")).click();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for(String id:child)
		{
			if(!(id.equals(parentid)))
			{
				driver.switchTo().window(id);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@type='email']")).sendKeys("khadepoonam07@gmail.com");
				driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Shivansh123");
			}
		}
		
		
		
		
	}
}
