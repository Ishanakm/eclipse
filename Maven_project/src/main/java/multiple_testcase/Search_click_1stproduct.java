package multiple_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search_click_1stproduct extends Launch_Quit 
{
	@Test
	public void search() 
	{ 
		 WebElement search=  driver.findElement(By.id("twotabsearchtextbox"));
		    search.sendKeys("shoe");
		    
		    search.sendKeys(Keys.ENTER);
		    
		    driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		
	}
}
