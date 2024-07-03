package Data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_signin
{

	@Test
	public void signin() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Maven_project\\Excel sheet\\Excel data.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	  //String mobilenumber= w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();//cannot get int value from string so we use numbertotextconverter
	    String mobilenumber=NumberToTextConverter.toText( w1.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue());
		 
        String password= w1.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
	 ChromeDriver driver=new ChromeDriver();
    driver.get("https://amazon.in");
    Thread.sleep(10000);
    WebElement acnt_list=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
    Actions a1=new Actions(driver);
    a1.moveToElement(acnt_list).perform();
    driver.findElement(By.className("nav-action-inner")).click();
    WebElement mob_numbr=driver.findElement(By.id("ap_email"));
    mob_numbr.sendKeys(mobilenumber);
    WebElement continie=driver.findElement(By.id("continue"));
    continie.click();
    WebElement passwd=driver.findElement(By.xpath("//input[@id='ap_password']"));
    passwd.sendKeys(password);
    WebElement signin=driver.findElement(By.id("signInSubmit"));
    signin.click();
}
}
