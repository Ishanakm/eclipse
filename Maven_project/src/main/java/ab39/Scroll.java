package ab39;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll 
{
@Test
public void scrolling()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://amazon.in");
	for(int i=0;i>-1;i++)
	{
	JavascriptExecutor j1=driver;
	j1.executeScript("window.scrollBy(0,3000)");
	}
			
}

}  