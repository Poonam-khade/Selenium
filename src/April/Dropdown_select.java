package April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=http%3A%2F%2Fin.search.yahoo.com%2F&_rdr");
		
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select s =new Select(day);
//		 s.selectByIndex(6);
//		 s.selectByValue("7");
		 s.selectByVisibleText("7");
         
	     WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		 Select m =new Select(month);
//		 m.selectByValue("12");
//		 m.selectByIndex(11);
		 m.selectByVisibleText("Dec");
		 
		 WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		 Select y =new Select(year);
//		  y.selectByVisibleText("1993");
//		  y.selectByIndex(27);
		 y.selectByValue("1993");
         
	}
}
