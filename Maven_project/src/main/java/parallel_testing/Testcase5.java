package parallel_testing;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase5 extends Launch_quit
{
	 WebDriver driver;

	@Test

	public void google() throws InterruptedException  {

		  driver.get("https://grotechminds.com/is-selected/");
		    WebElement select=driver.findElement(By.id("vehicle2"));
		    boolean answer=select.isSelected();
		    if(answer==false)
		    {
		    	Thread.sleep(4000);
		    	select.click();
		    }
}
}