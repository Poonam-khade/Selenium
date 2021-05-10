package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCaseWith_Keyword {

	

	@Test(enabled=false)
	public void testCase()
	{
		Reporter.log("Test case pass", true);
	}
	
	@Test(invocationCount=5)
	public void testCase1()
	{
		Reporter.log("Test case pass", true);
	}
	
}
