package TestNG_Disscussion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingOfTestCase {

	@BeforeTest
	public void beforetest() 
	{
	 Reporter.log("BeforeTest",true);	
	}
	
	
	@Test(groups="Sanity")
	public void testcase1()
	{
	   Reporter.log("login page get open", true);
	   
	   Assert.assertEquals(true, true,"test case got failed");
	}
	
	@Test(groups="Regression")
	public void testcase2()
	{
		Reporter.log("Dashboard page opened", true);
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void testcase3()
	{
	   Reporter.log("login page get open", true);
	   
	   Assert.assertEquals(true, true,"test case got failed");
	}
	

	@Test(dependsOnGroups= {"Sanity"})
	public void testcase4()
	{
	   Reporter.log("login page get open", true);
	   
	   //Assert.assertEquals(true, true,"test case got failed");
	}
	@AfterTest
	public void aftertest() 
	{
	 Reporter.log("After Test",true);	
	}
}
