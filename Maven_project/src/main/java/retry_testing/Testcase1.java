package retry_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1
{
@Test(retryAnalyzer=retry_testing.retry_class.class)
public void login()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://amazon.in");
	WebElement acnt_list=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	Actions a1=new Actions(driver);
	a1.moveToElement(acnt_list).perform();
	driver.findElement(By.className("nav-action-inner")).click();
	Assert.assertTrue(true);
}
}
