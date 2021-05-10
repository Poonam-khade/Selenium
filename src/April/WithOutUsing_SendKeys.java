package April;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutUsing_SendKeys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		username.click();
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='Admin';", username);
		js.executeScript("arguments[0].value='admin123';", password);
		
		username.clear();
	}
}
