package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfTest2 {
	
	@Test
	public void testcase3()
	{
		Reporter.log("TC3",true);
	}

	@Test
	public void testcase4()
	{
		Reporter.log("TC4",true);
	}

}
