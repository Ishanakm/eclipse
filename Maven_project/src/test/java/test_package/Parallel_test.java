package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Parallel_test extends Browser
{

	@Test
	public void parallel()
	{
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();

	}
}
