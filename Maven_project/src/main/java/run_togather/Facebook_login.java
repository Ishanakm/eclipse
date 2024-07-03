package run_togather;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_login 
{
	@Test
	   public void facebook_login()
	   {
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("6362378221");
			driver.findElement(By.id("pass")).sendKeys("riy@345");
			driver.findElement(By.name("login")).click();
	  
	}

}
