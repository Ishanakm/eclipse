package practice_selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktext_of_links {

	public static void main(String[] args) 
	{
       FirefoxDriver driver=new FirefoxDriver();
       driver.navigate().to("http://www.amazon.in");
       driver.manage().window().maximize();
       List<WebElement> links =driver.findElements(By.tagName("a"));
       int count=links.size();
       System.out.println(count);
       for(int i=0;i< count;i++)
       {
       WebElement single_link= links.get(i);
       String linktext=single_link.getText();
       System.out.println(linktext);
       
      
	}

}
}