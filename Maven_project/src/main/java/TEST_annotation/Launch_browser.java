package TEST_annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_browser 
{
@Test
public void login()
{
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
}
}
