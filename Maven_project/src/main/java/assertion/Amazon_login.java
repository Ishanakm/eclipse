package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Amazon_login
{
@Test
public void login()
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
    driver.findElement(By.className("nav-line-1-container")).click();
    driver.findElement(By.id("ap_email")).sendKeys("6362378221");
    driver.findElement(By.className("a-button-input")).click();
    driver.findElement(By.id("ap_password")).sendKeys("isha@123");
    driver.findElement(By.id("signInSubmit")).click();
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}


}
