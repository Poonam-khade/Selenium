package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfTest1 {
	
	@Test
	public void testcase1()
	{
		Reporter.log("TC1",true);
	}

	@Test
	public void testcase2()
	{
		Reporter.log("TC2",true);
	}

}
