package parallel_testing_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase1 extends Launch_Quit
{
@Test
public void amazon()
{
driver.get("https://amazon.in");
WebElement acnt_list=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
Actions a1=new Actions(driver);
a1.moveToElement(acnt_list).perform();
driver.findElement(By.className("nav-action-inner")).click();

}
}