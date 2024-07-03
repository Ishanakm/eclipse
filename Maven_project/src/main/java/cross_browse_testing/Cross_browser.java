package cross_browse_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Cross_browser
{
 static WebDriver driver;
  @BeforeMethod
  @Parameters("browser")
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
	  if(browsername.equals("Firefox")) 
	  {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
	  }
  }
@AfterMethod
public void quit()
{
	
	driver.quit();
}
  
  
  
}


