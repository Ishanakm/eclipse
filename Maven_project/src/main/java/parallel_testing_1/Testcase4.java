package parallel_testing_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase4 extends  Launch_Quit
{
@Test
public void amazon3 ()
{
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
Select s1=new Select(dropdown);
List<WebElement> count=s1.getOptions();
int number=count.size();
System.out.println(number);
}
}
