package TestNG_Disscussion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfMethod {
	
	@Test
	public void testcase1()
	{
	   Reporter.log("login page get open", true);
	   
	   Assert.assertEquals(true, true,"test case got failed");
	}
	
	@Test
	public void testcase2()
	{
		Reporter.log("Dashboard page opened", true);
	}
	
	@Test
	public void testcase3()
	{
	   Reporter.log("login page get open", true);
	   
	   Assert.assertEquals(true, true,"test case got failed");
	}
	

	@Test
	public void testcase4()
	{
	   Reporter.log("login page get open", true);
	   
	   Assert.assertEquals(true, true,"test case got failed");
	}
	
	
	

}
