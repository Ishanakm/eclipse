package project1.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_1_dimension 
{
 @DataProvider(name="Test")
 public Object[][] search()
 {
	 return new Object[][] {{"india"},{"karnataka"}};
	 
 }
 @Test(dataProvider="Test")
 public void testcase_1(String data)
 {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.findElement(By.name("q")).sendKeys(data);
 }
}
