package Data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DDT_practice 
{
@Test
public void test() throws EncryptedDocumentException, IOException, InterruptedException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Maven_project\\Excel sheet\\Excel data.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	String name=w1.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	
	
	
	 ChromeDriver driver=new ChromeDriver();
   driver.get("https://amazon.in");
   Thread.sleep(10000);
   WebElement acnt_list=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
   Actions a1=new Actions(driver);
   a1.moveToElement(acnt_list).perform();
   driver.findElement(By.className("nav-action-inner")).click();
   WebElement mob_numbr=driver.findElement(By.id("ap_email"));
   mob_numbr.sendKeys(name);
	
	
}
}
