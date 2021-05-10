package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCaseWith_Priority {

	@Test(priority=0)
	public void testCase1()
	{
		Reporter.log("first test case pass",true);
	}
	
	@Test(priority=2)
	public void testCase2()
	{
		Reporter.log("Second test case pass",true);
	}
	
	@Test(priority=3)
	public void testCase3()
	{
		Reporter.log("Third test case pass",true);
	}
	
	@Test(priority=1)
	public void testCase4()
	{
		Reporter.log("Fourth test case pass",true);
	}
}
