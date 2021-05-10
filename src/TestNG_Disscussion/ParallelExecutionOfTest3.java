package TestNG_Disscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecutionOfTest3 {
	
	@Test
	public void testcase5()
	{
		Reporter.log("TC5",true);
	}

	@Test
	public void testcase6()
	{
		Reporter.log("TC6",true);
	}

}
