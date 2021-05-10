package April;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_2']")); //join smith
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("window.scrollBy(0,500)"); //scrolling down word page
//		
//		Thread.sleep(2000);
//		
//		js.executeScript("window.scrollBy(0,-300)");  // scrolling upward page
		
		js.executeScript("arguments[0].scrollIntoView();",checkbox);  //scrolling for particular element
		
		js.executeScript("arguments[0].click();",checkbox);	// clicking for particular element using java script executer
		
		
		
	}
}
