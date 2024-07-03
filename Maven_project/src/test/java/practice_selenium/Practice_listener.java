package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)
public class Practice_listener extends Listner
{
	

@Test
public void amazon()
{
	driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
Actions a1=new Actions(driver);
a1.moveToElement(signin).perform();
}
}