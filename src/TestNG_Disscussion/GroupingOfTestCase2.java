package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
	
	
	@Test(groups="Sanity")
	public void testcase7()
	{
		Reporter.log("Dashboard page opened", true);
	}
	
	
	@Test(groups="Regression")
	public void testcase5()
	{
		Reporter.log("Dashboard page opened", true);
	}

	@Test(dependsOnGroups= "Sanity")
	public void testcase6()
	{
		Reporter.log(" page get opened", true);
	}

}
