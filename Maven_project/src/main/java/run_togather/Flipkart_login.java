package run_togather;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart_login 
{
	 @Test
	   public void flipkart_login()
	   {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%2Faccount%2Flogin%253Fret%253D%252F");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("6362378227");
	  driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
	   }

}
