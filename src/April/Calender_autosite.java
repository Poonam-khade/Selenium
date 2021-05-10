package April;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_autosite {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Sanap\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='datepicker2']")).click();
		
		 List<WebElement> month = driver.findElements(By.xpath("//*[@title='Change the month']//option"));
		
		for(WebElement m:month)
		{
			if(m.getText().equals("December"))
			{
				m.click();
			}
		}
		
		driver.findElement(By.xpath("//*[text()='7']")).click();
	}
}
