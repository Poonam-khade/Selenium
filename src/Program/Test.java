package Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("jay");
	  
	  driver.findElement(By.xpath("//ul[@class='erkvQe']//li[4]")).click();	  
	 
		
	}

}








