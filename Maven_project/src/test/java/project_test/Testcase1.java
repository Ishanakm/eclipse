package project_test;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import project_source.registration_page;
@Listeners(Listner_class.class)
public class Testcase1 extends Listner_class
{
	@Test(retryAnalyzer=project_test.Retry_class.class)
 public void GTM()
 {
	 driver=new ChromeDriver();
	 driver.get("https://grotechminds.com/user-account/");
	 driver.manage().window().maximize();
	 registration_page a1=new registration_page(driver);
	 a1.signup_link();
	 a1.email();
	 a1.username();
	 a1.password();
	 a1.repeatpassword();
	 a1.signup();
	//Assert.assertTrue(false);
	//Assert.assertEquals(driver.getTitle(), "User Account");;
	 
 }
}
