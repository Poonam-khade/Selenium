package PomPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	 WebDriver driver;
	
	@FindBy (xpath="//*[@id='txtUsername']")
	 private WebElement username;
	
	@FindBy (xpath="//*[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//*[@id='btnLogin']")
	 private WebElement loginButton;
	
	public LoginPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginWithCredintial()
	{
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
	}

	public String getTitleOfPage()
	{
		
	
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
}
