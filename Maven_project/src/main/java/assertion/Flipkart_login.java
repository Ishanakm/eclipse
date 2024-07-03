package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart_login 
{
@Test
public void login()
{
	ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com");
	 driver.findElement(By.linkText("Login")).click();
	 driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("6362378221");
	 driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
}
}
