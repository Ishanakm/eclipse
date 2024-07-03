package cross_browse_testing;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testcase1 extends Cross_browser
{
@Test

	public static void GTM()
	{
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("india");
}
}