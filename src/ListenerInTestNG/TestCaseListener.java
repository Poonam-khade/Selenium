package ListenerInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners (ListenerInTestNG.TestNGListener.class)
public class TestCaseListener {
	
	
	@Test(priority=1)
	public void testcase1()
	{
		Reporter.log("TC1",true);
	}

	@Test(priority=2)
	public void testcase2()
	{
		Reporter.log("TC2",true);
	}
	@Test(priority=3)
	public void testcase3()
	{
		Reporter.log("TC3",true);
		Assert.assertEquals(false, true);
	}
	
	@Test(priority=4 ,dependsOnMethods="testcase3")
	public void testcase4()
	{
		Reporter.log("TC4",true);
	}
}
