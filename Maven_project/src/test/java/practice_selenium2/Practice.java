package practice_selenium2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Practice implements IRetryAnalyzer
{
int total_count=2;
int initial_count=0;
	@Override
	public boolean retry(ITestResult result) {
if(initial_count	<total_count)
{
	initial_count++;
	return true;
	}
    return false;
}
	
}
class child
{
	@Test(retryAnalyzer=practice_selenium2.Practice.class)
	public void retry()
	{
		 ChromeDriver driver=new ChromeDriver();
	       driver.navigate().to("http://www.amazon.in");
	       driver.manage().window().maximize();
	WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone 15 pro");
		Assert.assertTrue(false);
		
		
		
		
		
		
		
	}
}