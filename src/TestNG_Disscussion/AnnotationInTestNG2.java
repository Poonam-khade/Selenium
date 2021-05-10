package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestNG2 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite is executing class2");
	}

	@BeforeTest
    public void beforeTest()
    {
		Reporter.log("Before test class2", true);
    }

	@Test 
	public void testcase()
	{
		Reporter.log("First test case executed",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After test class2",true);
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite is executing class2");
	}
}
