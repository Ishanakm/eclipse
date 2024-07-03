package masai_amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon_login extends Retry_login //inheriting retry_login class
{
	WebDriver driver; //globally declaring the driver
	@BeforeMethod// Testng annotation which executes before @test
	public void launch()
	{
		driver =new ChromeDriver();// launching empty chrome browser
		driver.get("https://www.amazon.in/"); //redirecting to the amazon website
		driver.manage().window().maximize(); //maximizing the window	
	}
@Test(retryAnalyzer=masai_amazon.Retry_login.class)//passing retryanalyzer to retry failed testcase
public void login() throws IOException
{
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(4));//applying implicitly wait for the webelement to load
    WebElement account_and_list=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	account_and_list.click();
	WebElement mob_number=driver.findElement(By.id("ap_email_login"));//locating the element using id locator of By class using findelemet method of WebElement interface
	mob_number.sendKeys("6362378221");//sending values to the text field using sendkeys method of Webelement interface
	WebElement Continue=driver.findElement(By.id("continue"));
	Continue.click();//performing click operation using click method of WebElement interface
	WebElement Password=driver.findElement(By.id("ap_password"));
	Password.sendKeys("isha@123");
	WebElement signin=driver.findElement(By.id("signInSubmit"));
	signin.click();
	
	//using assert class to varify the condition
	Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

	//taking scrrenshot 
	TakesScreenshot ts=(TakesScreenshot) driver; //upcasting driver to takesscreenshot interface
     File source=ts.getScreenshotAs(OutputType.FILE);
     File dest=new File("C:\\Users\\User\\eclipse-workspace\\Maven_project\\screenshot\\login."+Math.random()+".png");
     FileHandler.copy(source, dest);//copieng source to destination using copy method of filehandler class
     }
@AfterMethod // Testng annotation which executes after @test
public void logout() throws IOException
{
	WebElement account_and_list1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a1=new Actions(driver);//actions class to perform hoverover using movetoelement method
	a1.moveToElement(account_and_list1).perform();
	WebElement signout =driver.findElement(By.xpath("//a[@id='nav-item-signout']"));
	//WebDriverWait w1=new WebDriverWait(driver,Duration .ofSeconds(3));
   // w1.until(ExpectedConditions.elementToBeSelected(signout));//handeling staleElementreferenceException using explicitly wait
    signout.click();
  //taking scrrenshot 
  	TakesScreenshot ts=(TakesScreenshot) driver;
       File source=ts.getScreenshotAs(OutputType.FILE);
       File dest=new File("C:\\Users\\User\\eclipse-workspace\\Maven_project\\screenshot\\logout."+Math.random()+".png");
       FileHandler.copy(source, dest);
}
}
