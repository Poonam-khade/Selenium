package Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_POPUP {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@class='rodal-close'])[1]")).click();
		
	}
}
