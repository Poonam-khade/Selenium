package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkippedTestCase2 {

	@Test(dependsOnMethods="TestNG_Disscussion.SkippedTestCase.testcase2",priority=3)
	public void testcase3() 
	{
		Reporter.log("test case get pass",true);
	}
	@Test
	public void testcase4() 
	{
		Reporter.log("test case get pass",true);
	}
	
	
}



