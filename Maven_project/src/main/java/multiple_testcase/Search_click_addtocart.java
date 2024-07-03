package multiple_testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search_click_addtocart extends Launch_Quit
{

	@Test
	
	public void add_cart() 
	{
		 
	ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 WebElement search=  driver.findElement(By.id("twotabsearchtextbox"));
		    search.sendKeys("shoe");
		    search.sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		    Set<String> g1=driver.getWindowHandles();
		    System.out.println(g1);
		    Iterator<String>   s1=g1.iterator();
		 String s3=   s1.next();//first time next will give the parent id
		  String s4=  s1.next();//second time next will give the child id
		  //System.out.println(s4);
		  driver.switchTo().window(s4);//moved control to child window(s4)
		 driver.findElement(By.id("add-to-cart-button")).click();
		 driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
}
}