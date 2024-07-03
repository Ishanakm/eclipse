package parameters_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Choosing_browser
{
	 WebDriver driver;
		@Test
        @Parameters("browser")
		public  void google(String nameofbrowser)
		{
			if(nameofbrowser.equals("Chrome"))
			{
				driver=new ChromeDriver();
			}
			if(nameofbrowser.equals("Edge"))
			{
				driver=new EdgeDriver();
			}
			if(nameofbrowser.equals("Firefox"))
			{
				driver=new FirefoxDriver();
			}
			//ChromeDriver driver=new ChromeDriver();
					driver.navigate().to("https://www.google.com/");
					driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("india");
			}
	}


