package itestlistner_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner_class.class)
public class Testcase1 extends Listner_class
{
	@Test//(timeOut=3000)
	public void amazon_hoverover()
	{
	 driver=new ChromeDriver();
	    driver.get("https://amazon.in");
	    WebElement acnt_list=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	    Actions a1=new Actions(driver);
	    a1.moveToElement(acnt_list).perform();
	    driver.findElement(By.className("nav-action-inner")).click();
	   // Assert.assertTrue(false);
}

@Test(dependsOnMethods="amazon_hoverover")
public void test2()
{
	 driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("india");
}
}