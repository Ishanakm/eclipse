package ab39;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dimension 
{
@Test
public void google()
{
	
	 ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	WebElement search=	driver.findElement(By.cssSelector("textarea.gLFyf"));
	search	.sendKeys("india");
		Dimension d1=search.getSize();
	int height=	d1.getHeight();
	int width= 	d1.getWidth();
		




}
}
