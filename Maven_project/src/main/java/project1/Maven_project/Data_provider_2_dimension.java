package project1.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_2_dimension
{
	@DataProvider(name="login")
	public Object[][] method1()
	{
	Object data[][]=new Object[3][4];
	data[0][0]="isha";	
	data[0][1]="isha@gmail.com";
	data[0][2]="ish@345";
	data[0][3]="ish@345";
	data[1][0]="riya";
	data[1][1]="riya87@gmail.com";	
	data[1][2]="riya234@1";
	data[1][3]="riya234@1";
	data[2][0]="zaisha";	
	data[2][1]="zaisha@gmail.com";
	data[2][2]="maryam123";
	data[2][3]="maryam123";
	return data;
	
	}
	@Test (dataProvider="login")
	public void login_to_amazon(String name, String un, String pwd, String pwda)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys(name);
		driver.findElement(By.id("ap_email")).sendKeys(un);
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("ap_password_check")).sendKeys(pwda);
		driver.findElement(By.id("a-autoid-0")).click();
	}
	

}
