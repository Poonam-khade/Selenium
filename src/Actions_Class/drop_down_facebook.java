package Actions_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drop_down_facebook {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=http%3A%2F%2Fin.search.yahoo.com%2F&_rdr");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		 WebElement day = driver.findElement(By.xpath("//*[@id='day']//option"));
		
		 day.click();
		Actions act = new Actions(driver);
		
	//day.sendKeys("22");
	//  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
