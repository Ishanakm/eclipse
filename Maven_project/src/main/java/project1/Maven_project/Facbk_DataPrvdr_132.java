package project1.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facbk_DataPrvdr_132 {

	@DataProvider(name="login")
	public Object[][] method1()
	{
	Object data[][]=new Object[5][2];
	data[0][0]="7685949877";
	data[0][1]="345hyg";
	data[1][0]="1234586743";
	data[1][1]="yt@234";
	data[2][0]="4399887766";
	data[2][1]="566yy2";
	data[3][0]="9909876754";
	data[3][1]="asdc@1";
	data[4][0]="9964509987";
	data[4][1]="hjki00";
	return data; 
	}
	
	@Test (dataProvider="login")
	public void login_to_amazon(String un, String pwd)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
}