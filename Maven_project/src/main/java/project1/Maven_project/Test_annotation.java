package project1.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class Test_annotation 
{
 ChromeDriver driver;
@Test(invocationCount=10)

	public void login()
	{
	 driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	}
	
@Test(priority=1)

   public void search()
   {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bat");
	
}
@Test(priority=2)
public void logout()
{
	driver.close();
}
}
