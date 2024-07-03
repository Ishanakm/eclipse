package ab39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links
{
	public static void main(String[] args) throws IOException 
	{
		 ChromeDriver driver=new ChromeDriver();
		    driver.get("https://amazon.in");
		 List<WebElement> links=  driver.findElements(By.tagName("a")); 
		int count_oflinks=links.size();
		System.out.println(count_oflinks);
		
		for(int i=0;i<count_oflinks;i++)
		{
			WebElement singlelink=links.get(i);
			String url=singlelink.getAttribute("href");
			System.out.println(url);
			verify_the_links(url);
			
		}
		}
	public static void verify_the_links(String url) throws IOException
	{
		try
		{
		URL ul=new URL(url);
		HttpURLConnection h1=(HttpURLConnection) ul.openConnection();
		h1.connect();
		if(h1.getResponseCode()==200)
		{
			System.out.println("the link is valid   "+h1.getResponseCode()+"   "  + h1.getResponseMessage()+ url);
		
		}
		if(h1.getResponseCode()!=200)
		{
			System.out.println("the link is  not valid   "+h1.getResponseCode()+ "  "+ h1.getResponseMessage()+url);
		}
		}
	catch(NullPointerException a1)
		{
		
		}
	catch(MalformedURLException a2)
		{
		
		}
	}
}