package practice_selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("http://grotechminds.com");
         driver.manage().window().maximize();
         WebElement automateme=driver.findElement(By.xpath("(//a[.='Automate me'])[1]"));
         automateme.sendKeys(Keys.ENTER);
        driver.get("https://grotechminds.com/add-to-cart/");
       driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
       WebElement firstname=driver.findElement(By.id("firstName"));
       firstname.sendKeys("ishana");
       WebElement lastname=driver.findElement(By.id("lastName"));
       lastname.sendKeys("km");
       WebElement submit=driver.findElement(By.xpath("//button[@name='sumbit']"));
       submit.click();
       
	}

}
