package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String browser ="chrome";
		
		if(browser.equals("chrome"))
		{
		 driver = new ChromeDriver();
		}
		
		if(browser.equals("fire"))
		{
		 driver = new FirefoxDriver();
		}
		
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=whatsapp+web");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=chromedriver+download");
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.close();
		
	}
}
