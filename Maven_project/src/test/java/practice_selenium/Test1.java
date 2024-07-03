package practice_selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(Listner.class)	
public class Test1 extends Retry
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launch(String browsername)
	{
		if(browsername.equals("chrome"))
		{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
		if(browsername.equals("edge"))
		{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
		if(browsername.equals("firefox"))
		{
		  
		}
	}
@Test(retryAnalyzer=practice_selenium.Retry.class,timeOut=5000,priority=0,enabled=true)
public void amazon_hoverover()
{
	
	WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signin).perform();
	
}
@Test(retryAnalyzer=practice_selenium.Retry.class,enabled=false,priority=1)
public void search()
{
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("redtape women shoes");
	search.sendKeys(Keys.ENTER);
	WebElement select=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[3]"));
	select.click();
	Set<String> s=driver.getWindowHandles();
	Iterator<String> i1=s.iterator();
	String s1=i1.next();
	String s2=i1.next();
	driver.switchTo().window(s2);
	WebElement add=driver.findElement(By.id("add-to-cart-button"));
	add.click();
	WebElement buy=driver.findElement(By.name("proceedToRetailCheckout"));
	buy.click();
	Assert.assertTrue(true);
}
@Test(priority=-1,invocationCount=1,groups= {"smoke"},enabled=false)
public void login() throws InterruptedException
{

	WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	signin.click();
	WebElement mob=driver.findElement(By.id("ap_email"));
	mob.sendKeys("6362378221");
	WebElement continu=driver.findElement(By.id("continue"));
	continu.click();
	WebElement pass=driver.findElement(By.id("ap_password"));
	pass.sendKeys("isha@123");
	WebElement sign_in=driver.findElement(By.id("signInSubmit"));
	sign_in.click();
	//Thread.sleep(20000);
}
@Test(priority=2,enabled=false)//dependsOnMethods="login",)
public void logout() throws InterruptedException
{
	WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	signin.click();
	WebElement mob=driver.findElement(By.id("ap_email"));
	mob.sendKeys("6362378221");
	WebElement continu=driver.findElement(By.id("continue"));
	continu.click();
	WebElement pass=driver.findElement(By.id("ap_password"));
	pass.sendKeys("isha@123");
	WebElement sign_in=driver.findElement(By.id("signInSubmit"));
	sign_in.click();
	
	WebElement sgnin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
    Actions a1=new Actions(driver);
	a1.moveToElement(sgnin).perform();
	WebElement signout=driver.findElement(By.xpath("//span[.='Sign Out']"));
	signout.click();
	WebDriverWait w1=new WebDriverWait(driver,Duration .ofSeconds(10));
	w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
}

@AfterMethod
public void quit()
{
	driver.quit();
}
}
