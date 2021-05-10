package April;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_window {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin Sanap\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> handleid = driver.getWindowHandles();
		
		int size = handleid.size();
	    
		String[] array= new String[size];
		int i=0;
		for(String id:handleid)
	    {
	    	array[i]=id;
	    	i++;
	    	
	    }
		driver.switchTo().window(array[3]);
		
	}

}
