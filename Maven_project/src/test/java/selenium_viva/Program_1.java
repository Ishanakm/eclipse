package selenium_viva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program_1 
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void browser(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			 driver =new ChromeDriver();
			  driver.get("https://demoqa.com/login");
			  driver.manage().window().maximize();
		}
		if(browsername.equals("edge"))
		{
			 driver =new EdgeDriver();
			  driver.get("https://demoqa.com/login");
			  driver.manage().window().maximize();
		}
	}
	@Test
	public void name()
	{
		
  WebElement username=driver.findElement(By.id("userName"));
 boolean ansr= username.isEnabled();
  if(ansr==true)
  {
	  username.sendKeys("ishana");
  }
}
}