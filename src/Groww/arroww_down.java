package Groww;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class arroww_down {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groww.in/");
		
		driver.manage().window().maximize();
		
		 WebElement searchbox = driver.findElement(By.xpath("//*[@id='mainSearch1010']"));
		 
		 searchbox.sendKeys("sbi");
		 
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 
		 act.sendKeys(searchbox, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 
		
	}

}
