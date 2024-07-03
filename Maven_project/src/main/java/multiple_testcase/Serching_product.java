package multiple_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Serching_product extends Launch_Quit
{
@Test
 public void search()
 {
	WebElement search=  driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("shoe");
    
 }
}
