package TEST_annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameters_togather
{

	  @Test(invocationCount=2, priority=0)
	   public void amazon_login()
	   {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwir2xBhC_ARIsAMTXk86_8VoI8kN6HT7CYRrc1_NxcAaw07jBnnhIl9BtooiM99AgoPlyVAQaAgGqEALw_wcB%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9299626%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D8559981217548183039%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ap_email")).sendKeys("6362378221");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.name("password")).sendKeys("ishana234");
	  driver.findElement(By.id("signInSubmit")).click();
	   }
	  
	  @Test(priority=-1)
	   public void flipkart_login()
	   {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%2Faccount%2Flogin%253Fret%253D%252F");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("6362378227");
	  driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
	   }

}
