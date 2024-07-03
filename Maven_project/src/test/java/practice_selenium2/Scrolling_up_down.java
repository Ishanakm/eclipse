package practice_selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrolling_up_down {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
	       driver.navigate().to("http://www.amazon.in");
	       driver.manage().window().maximize();
	       WebElement facebook=driver.findElement(By.xpath("//a[.='Facebook']"));
	     Point p1=facebook.getLocation();
	     int x=p1.getX();
	     System.out.println(x);
	    int y= p1.getY();
	    System.out.println(y);
	    JavascriptExecutor j1=driver;
	    j1.executeScript("window.scrollBy("+x+" ,"+y+")");
	    Thread.sleep(4000);
	    j1.executeScript("window.scrollBy("+x+",100)");
	    	}

}
