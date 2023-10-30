package AutomationProject.seleniumFrame;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day2 
{
	
	@Test(dependsOnMethods= {"carLoginweb"})
	public void carLoginmobile()
	{
		System.out.println("carLoginmobile");
	}
	
	@Test
	public void carLoginweb()
	{
		System.out.println("carLoginweb");
	}
	
	@AfterSuite
	@Test
	public void carLoginAPI()
	{
		System.out.println("carLoginAPI");
	}
	
}
