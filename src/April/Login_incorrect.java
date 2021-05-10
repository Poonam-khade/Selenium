package April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_incorrect {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Poonam");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		WebElement text = driver.findElement(By.xpath("//*[text() = 'Invalid credentials']"));
		
		String t = text.getText();
		
	//	System.out.println(t);
	}

}
