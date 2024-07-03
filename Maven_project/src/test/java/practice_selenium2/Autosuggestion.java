package practice_selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver=new ChromeDriver();
	       driver.navigate().to("http://www.amazon.in");
	       driver.manage().window().maximize();
	WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone 15 pro");
	Thread.sleep(3000);
	List<WebElement> select=driver.findElements(By.xpath("(//div[@class='autocomplete-results-container']/div/div/div)"));
	int count=select.size();
	System.out.println(count);
	Thread.sleep(3000);
	select.get(4).click();
	
	}

}
