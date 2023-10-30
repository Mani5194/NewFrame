package AutomationProject.seleniumFrame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Paytm 
{
	
	public static void main(String[] args) {
		WebDriver driver =  new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/");
		List<WebElement> h1 =driver.findElements(By.xpath("//div[@ class='row col-sm-12 h_head1']"));
		
		for(int i=0;i<h1.size();i++) 
		{
			String header1 =h1.get(i).getText();
			System.out.println(header1);
		}
	}

}
