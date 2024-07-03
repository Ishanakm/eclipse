package ab39;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Switchcase
{
	WebDriver driver;
	@Test
	 public void testcase1()
	  {
     switch(3)
     {
     case 1:
     {
    	 System.out.println("ggogle chrome launch");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  break;
		  }
     case 2:
     {
    	 System.out.println("firefox browser launch ");
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
			  break;
		  }
     case 3:
     {
    	 System.out.println("edge browser launch ");
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  break;
		  }
}
	  }
}