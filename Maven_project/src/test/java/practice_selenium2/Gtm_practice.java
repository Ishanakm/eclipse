package practice_selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Gtm_practice {

	public static void main(String[] args) 
	{
        ChromeDriver driver=new ChromeDriver();
         driver.navigate().to("http://grotechminds.com");
          driver.manage().window().maximize();
          WebElement automateme=driver.findElement(By.xpath("(//a[.='Automate me'])[1]"));
          automateme.sendKeys(Keys.ENTER);
        driver.navigate().to("https://grotechminds.com/alert/");
          WebElement alert=driver.findElement(By.xpath("(//div[@class='elementor-element elementor-element-df464c9 elementor-widget elementor-widget-html'])"));
          alert.click();
	driver.switchTo().alert().accept();
	  WebElement recived=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-ad9960e elementor-widget elementor-widget-html']"));
	  recived.click();
	driver.switchTo().alert().dismiss();
	}

}
