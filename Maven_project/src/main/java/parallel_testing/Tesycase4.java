package parallel_testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tesycase4 extends Launch_quit
{
	WebDriver driver;

	@Test
	public void amazon()
	{
		  //ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.amazon.in");
		 WebElement search=  driver.findElement(By.id("twotabsearchtextbox"));
		    search.sendKeys("shoe");
		    search.sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		    Set<String> g1=driver.getWindowHandles();
		    System.out.println(g1);
}
}