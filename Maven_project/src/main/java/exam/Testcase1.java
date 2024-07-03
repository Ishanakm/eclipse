package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 
{
@Test
public void instagram()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/emailsignup/");
	driver.manage().window().maximize();
	WebElement email=driver.findElement(By.xpath("(//input)[1]"));
	email.sendKeys("ishanayaz01@gmail.com");
	WebElement fullname=driver.findElement(By.xpath("(//input)[2]"));
	fullname.sendKeys("ishana Ayaz");
	WebElement username=driver.findElement(By.xpath("(//input)[3]"));
	username.sendKeys("ishanakm");
	WebElement password=driver.findElement(By.xpath("(//input)[4]"));
	password.sendKeys("Ishana@890");
	WebElement signup=driver.findElement(By.xpath("//button[.='Sign Up']"));
	signup.click();
	
}
}
