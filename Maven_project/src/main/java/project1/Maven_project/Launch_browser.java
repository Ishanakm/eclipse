package project1.Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Launch_browser {
@Test
	public static void main(String[] args)
	{
   WebDriver driver=new EdgeDriver();
   driver.get("https://www.facebook.com/");
   driver.findElement(By.id("email")).sendKeys("ishana@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("123@asd");
	driver.findElement(By.name("login")).click();
	}

}
