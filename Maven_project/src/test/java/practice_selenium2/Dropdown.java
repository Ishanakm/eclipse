package practice_selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		  ChromeDriver driver=new ChromeDriver();
	       driver.navigate().to("http://www.amazon.in");
	       driver.manage().window().maximize();
	WebElement dropdown =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    Select s1=new Select(dropdown);
    s1.selectByIndex(4);
    s1.getOptions();
    List<WebElement> count=s1.getOptions();
    System.out.println(count.size());
 
	}

}
