package TestNG_Disscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	public void testcase1()
	{
		
		Assert.fail();
	}
	
	@Test
	public void testcase2()
	{
		Assert.assertEquals(true, true,"test case fail");
	}
}
