package practice_selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("http://grotechminds.com");
         driver.manage().window().maximize();
         WebElement automateme=driver.findElement(By.xpath("(//a[.='Automate me'])[1]"));
         automateme.sendKeys(Keys.ENTER);
        driver.get("https://grotechminds.com/registration/");
        WebElement file=driver.findElement(By.xpath("//input[@id='file']"));
        file.sendKeys("C:\\Users\\User\\eclipse-workspace\\Maven_project\\src\\test\\java\\practice_selenium2\\Gtm_practice.java");
	}

}
