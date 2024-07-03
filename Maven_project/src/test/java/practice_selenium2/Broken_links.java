package practice_selenium2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broken_links 
{

	public static void main(String[] args) throws IOException {
		  ChromeDriver driver=new ChromeDriver();
	       driver.navigate().to("http://www.amazon.in");
	       driver.manage().window().maximize();
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int count=links.size();
	for(int i=0;i<count;i++)
	{
		WebElement single_link=links.get(i);
		String url=single_link.getAttribute("href");
		System.out.println(url);
		broken_link( url);

	}
}
	public static void broken_link(String url) throws IOException
	{
		try
		{
		URL ul=new URL(url);
		HttpURLConnection h1=(HttpURLConnection) ul.openConnection();
		h1.connect();
		if(h1.getResponseCode()==200)
		{
			System.out.println("link is valid --"+h1.getResponseCode()+"  "+h1.getResponseMessage()+"  "+url);
			
		}
		if(h1.getResponseCode()!=200)
		{
			System.out.println("link is not valid --"+h1.getResponseCode()+"  "+h1.getResponseMessage()+"  "+url);
			
		}
		}
		catch(NullPointerException n)
		{
		}
		catch(MalformedURLException m)
		{
		}
	}
}