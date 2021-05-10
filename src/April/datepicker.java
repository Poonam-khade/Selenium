package April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sachin Sanap\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		
		int i=0;
		
		while(i==0)
		{
			   WebElement title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
			   
			  String monthyear = title.getText();
			  if(!(monthyear.equals("September 2020")))
			  {
				  driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			  }
			  else
			  {
				  break;
			  }
		}
		
		driver.findElement(By.xpath("//*[text()='1']")).click();
     
	}
}

