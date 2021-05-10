package April;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=http%3A%2F%2Fin.search.yahoo.com%2F&_rdr");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name ='firstname' ]")).sendKeys("Poonam");;
		
		driver.findElement(By.xpath("//*[@name ='lastname' ]")).sendKeys("Khade");;
		
		driver.findElement(By.xpath("//*[@name ='reg_email__' ]")).sendKeys("8657858527");
		
		driver.findElement(By.xpath("//*[@ value='1']")).click();
		
	    List<WebElement> day = driver.findElements(By.xpath("//*[@ id='day']//option"));
	    
	    for(WebElement dd:day)
	    {
	    	
	   if (dd.getText().equals("15"))
	   {
	    	dd.click();
		   System.out.println(dd.getText());
	   }
	    }
	   
	    List<WebElement> month = driver.findElements(By.xpath("//*[@id = 'month']//option"));
	    
	    for(WebElement m:month)
	    {
	    	
	   if (m.getText().equals("Dec"))
	   {
	    	m.click();
		   System.out.println(m.getText());
	   }
	    }
	    
	List<WebElement> year = driver.findElements(By.xpath("//*[@id = 'year']//option"));

	 for(WebElement y:year)
	    {
	    	
	   if (y.getText().equals("1993"))
	   {
	    	y.click();
		   System.out.println(y.getText());
	   }
	    }
//	 
//	 driver.findElement(By.xpath("//*[@id = 'password_step_input']")).sendKeys("Nitin@2021");
//	 
//	 driver.findElement(By.xpath("//*[@id = 'signup_button']")).click();
	}
}