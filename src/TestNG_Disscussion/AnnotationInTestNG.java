package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestNG {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite is executing class1");
	}

	@BeforeTest
    public void beforeTest()
    {
		Reporter.log("Before test class1", true);
    }
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class is executing");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before Method", true);
	}
	
	@Test
	public void testcase()
	{
		Reporter.log("First case is executed",true);
	}

	@Test
	public void testcase1()
	{
		Reporter.log("second case is executed",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method executed");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class is executing");
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After test class1",true);
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite is executing class1");
	}
}
