package Actions_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=http%3A%2F%2Fin.search.yahoo.com%2F&_rdr");
		
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select s = new Select(day);
		s.selectByIndex(7);
		
		
		
	}
}
