package practice_selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) 
	{
		 ChromeDriver driver=new ChromeDriver();
	       driver.navigate().to("http://www.amazon.in");
	       driver.manage().window().maximize();
	WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
	boolean check1=search.isEnabled();
	if(check1==true) 
	{
	search.sendKeys("iphone 15 pro");
	search.sendKeys(Keys.ENTER);
	}
	WebElement filter =driver.findElement(By.xpath("//span[.='Get It by Tomorrow']"));
	boolean check=filter.isSelected();
	if (check==false)
	{
		filter.click();
	}
	WebElement cart=driver.findElement(By.xpath("//a[.='Mobiles']"));
	boolean check3=cart.isDisplayed();
	if(check3==true)
	{
		cart.click();
	}
	}

}
