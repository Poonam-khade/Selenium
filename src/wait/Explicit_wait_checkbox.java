package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_checkbox {
	
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
					
					driver.manage().window().maximize();
					
					WebDriverWait wait = new WebDriverWait(driver,60);
					
					driver.findElement(By.xpath("//*[@id='checkbox']")).click();
					
				
				wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id='ch']")));
				
				driver.findElement(By.xpath("//*[@id='checkbox']")).click();
	}

}
