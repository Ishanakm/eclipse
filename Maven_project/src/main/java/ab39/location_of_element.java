package ab39;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class location_of_element 
{
	
@Test
	public void launch()
	 {
	ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
		  WebElement e1=driver.findElement(By.className("navFooterDescItem"));
		  Point p1=e1.getLocation();
		  System.out.println(p1.getX());
		  System.out.println(p1.getY());
		  
}
}