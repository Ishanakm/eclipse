package timeout_parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase1
{
@Test(timeOut=15000)
public void google()
{
		  ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.flipkart.com");
		    WebElement acnt_list=driver.findElement(By.xpath("//span[.='Login']"));
		    Actions a1=new Actions(driver);
		    a1.moveToElement(acnt_list).perform();
		    WebElement signup=driver.findElement(By.xpath("//span[.='Sign Up']"));
		    signup.click();
		    driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9900996574");
          driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
	}

}
