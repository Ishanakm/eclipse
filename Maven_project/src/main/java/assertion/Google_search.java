package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google_search 
{
@Test
public void search()
{

	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement search =driver.findElement(By.name("q"));
	search.sendKeys("india");
	search.sendKeys(Keys.ENTER);
	Assert.assertEquals(driver.getTitle(), "india - Google Search");
}
}
