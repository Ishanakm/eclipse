package parallel_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 extends Launch_quit

{
	WebDriver driver;
@Test

public void google()
{
	  driver.get("https://amazon.in");
		 List<WebElement> links=  driver.findElements(By.tagName("a")); 
		int count_oflinks=links.size();
		System.out.println(count_oflinks);
		for(int i=0;i<count_oflinks;i++)
		{
			WebElement singlelink=links.get(i);
			String message=singlelink.getAttribute("href");
			System.out.println(message);
		}
}}