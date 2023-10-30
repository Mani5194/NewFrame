package AutomationProject.seleniumFrame;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 
{
	
	@Test(dataProvider="getData")
	public void demo(String user, String pass)
	{
		System.out.println(user);
		System.out.println(pass);
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new Object[3][2];
		
		data[0][0]= "Firstname";
		data[0][1]= "11111111";
		
		data[1][0]= "secondname";
		data[1][1]= "22222222";
		
		data[2][0]= "thirdname";
		data[2][1]= "333333333";
		
		return data;
		
	
			
	}
}
