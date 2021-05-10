package TestNG_Disscussion;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2InTestNG {

	
	@Test
	@Parameters ({"Browser","builversion"})
	public void testcase1(String name,String Version)
	{
		if(name.equalsIgnoreCase("chrome"))
		{
		System.out.println(name);
		System.out.println(Version);
		}
		
		else if(name.equalsIgnoreCase("Firefox"))
		{
		System.out.println(name);
		System.out.println(Version);
		}
	}
}
