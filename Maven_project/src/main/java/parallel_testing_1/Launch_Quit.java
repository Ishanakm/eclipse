package parallel_testing_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Launch_Quit 
{
WebDriver driver;
@BeforeMethod
@Parameters("browsers")
public void launch(String browsername)
{
	if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	if(browsername.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
}
@AfterMethod
public void quit()
{
	driver.close();
}
}
