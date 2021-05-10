package PomTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PomPage.LoginPage;

public class BaseTestClass {
	
	static WebDriver driver;
	public LoginPage lp;
	@BeforeSuite
	public void lounchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--start-maximized");
		
		//options.addArguments("--headless");
		//options.addArguments("--incognito");
		
		driver= new ChromeDriver(options);
		Properties prop= new Properties();
		FileInputStream input= new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		
		prop.load(input);
		
		driver.get(prop.getProperty("url"));
	}
	
	@BeforeClass
	public void objectCreation() throws IOException
	{
		lp=new LoginPage(driver);
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}

}
