package parallel_testing_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase3 extends Launch_Quit
{
@Test
public void  amazon1()
{
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	WebElement click = driver.findElement(By.linkText("Mobiles"));
	click.sendKeys(Keys.ENTER);
}
}
