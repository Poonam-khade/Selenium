package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
		 WebElement slider = driver.findElement(By.xpath("//*[text()='Slider']"));
		 
		 slider.click();
		 
		 
		 Actions act = new Actions(driver);
		 
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		 WebElement click = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		 
		 
		 act.clickAndHold(click).moveByOffset(100, 0).build().perform();
			
			
	}
}
