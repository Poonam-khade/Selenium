package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvalidProgram {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class ");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before class ");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("before class ");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("before class ");
	}

}
