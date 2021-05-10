package TestNG_Disscussion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkippedTestCase {

	@Test(priority=1)
	public void testcase1()
	{
	   Reporter.log("login page get open", true);
	   
	   Assert.assertEquals(true,true,"test case got failed");
	}
	
	@Test(dependsOnMethods="testcase1",priority=2)
	public void testcase2()
	{
		Reporter.log("Dashboard page opened", true);
		 Assert.assertEquals(true,true,"test case got failed");
	}
}
