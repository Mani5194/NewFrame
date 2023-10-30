package AutomationProject.seleniumFrame;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 
{
	
	@BeforeTest
	@Test
	public void bikeLoginmobile()
	{
		System.out.println("bikeLoginmobile");
	}
	
	@AfterTest
	public void bikeLoginWeb()
	{
		System.out.println("bikeLoginWeb");
	}
	
	@BeforeSuite
	@Test
	
	public void bikeLoginAPI()
	{
		System.out.println("bikeLoginAPI");
	}
	
	@BeforeMethod
	public void beforeGeneralLogin()
	{
		System.out.println("beforegeneralLogin");
	}
	@AfterMethod
	public void afterGeneralLogin()
	{
		System.out.println("aftergeneralLogin");
	}
	
	
}
