package parallel_testing_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase2 extends Launch_Quit
{
	@Test
	public void google()
	{
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.findElement(By.name("q")).sendKeys("isha");
	driver.navigate().refresh();
}
}