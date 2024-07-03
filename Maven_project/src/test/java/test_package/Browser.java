package test_package;

import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Browser
{
	WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void parallel(String browsername)
{
	if(browsername.equals("chrome"))
	{
		 driver=new ChromeDriver();
		
	}
	if(browsername.equals("edge"))
	{
		 driver=new EdgeDriver();
		
	}
	if(browsername.equals("firefox"))
	{
		 driver=new FirefoxDriver();
		
	}
}

}
