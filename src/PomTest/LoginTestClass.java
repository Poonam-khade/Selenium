package PomTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTestClass extends BaseTestClass{
	
	
	@Test
	public void loginPage()
	{
		lp.loginWithCredintial();
	}

	@Test
	public void title()
	{
		
		Reporter.log("title",true);
		lp.getTitleOfPage();
		
	}
}
