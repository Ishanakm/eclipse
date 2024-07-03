package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_signin 
{
	@Test
	public void signin() throws InterruptedException
	{
	 ChromeDriver driver=new ChromeDriver();
    driver.get("https://amazon.in");
    Thread.sleep(10000);
    WebElement acnt_list=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
    Actions a1=new Actions(driver);
    a1.moveToElement(acnt_list).perform();
    driver.findElement(By.className("nav-action-inner")).click();
    WebElement mob_numbr=driver.findElement(By.id("ap_email"));
    mob_numbr.sendKeys("6362378221");
    WebElement continie=driver.findElement(By.id("continue"));
    continie.click();
    WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
    password.sendKeys("isha@123");
    WebElement signin=driver.findElement(By.id("signInSubmit"));
    signin.click();
}
}