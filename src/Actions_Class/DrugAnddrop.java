package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrugAnddrop {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			
			driver.switchTo().frame(iframe);
			
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act =new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().parentFrame();
		
		
		
	}

}
