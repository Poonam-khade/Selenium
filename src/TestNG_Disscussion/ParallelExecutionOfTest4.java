package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfTest4 {
	
	@Test
	public void testcase1()
	{
		Reporter.log("TC7",true);
	}

	@Test
	public void testcase2()
	{
		Reporter.log("TC8",true);
	}

}
