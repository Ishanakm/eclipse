package parallel_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 extends Launch_quit

{

	 WebDriver driver;
	@Test

	public  void GTM() throws InterruptedException
	{
		// ChromeDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.google.com/");
				driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("india");
		}
}
