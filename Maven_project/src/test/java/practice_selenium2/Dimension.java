package practice_selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.google.com");
         driver.manage().window().maximize();
         WebElement search=driver.findElement(By.id("APjFqb"));
         org.openqa.selenium.Dimension d1=search.getSize();
         System.out.println(d1.getHeight());
        System.out.println( d1.getWidth());
         
         
	}

}
