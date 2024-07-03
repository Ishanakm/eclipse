package grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase3

{

	 WebDriver driver;
		@Test(groups= {"system"})

		public  void GTM()
		{
			       ChromeDriver driver=new ChromeDriver();
					driver.navigate().to("https://www.google.com/");
					driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("fruits");
			}
	}


