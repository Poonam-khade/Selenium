package PomPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class BasePage {
	
	 public Properties prop;
	public BasePage() throws IOException
	{
		prop= new Properties();
		FileInputStream input =new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		prop.load(input);
		
	}

}
