package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicit_wait_text {

	    //     Program for mix implicit wait & Explicit wait
  // @Test
      public void m1() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
					
					driver.manage().window().maximize();
					
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					WebDriverWait wait =new WebDriverWait(driver, 8);
					
					driver.findElement(By.xpath("//*[@id='populate-text']")).click();
					
					wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
					
					driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	}
      
      
}
