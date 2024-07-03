package Data_driven_testing;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Testcase1 
{
@Test
public void DDT() throws EncryptedDocumentException, IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Maven_project\\Excel sheet\\Excel data.xlsx");
    Workbook w1=WorkbookFactory.create(f1);
    /*  Sheet s1= w1.getSheet("Sheet1");
    Row r1= s1.getRow(0);
    Cell c1=r1.getCell(0);
   String username=c1.getStringCellValue();
   System.out.println(username); */
   
   //////////////or/////
   
    String username= w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    		 System.out.println(username);
    		 
     String email= w1.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
    		 System.out.println(email);	 
}
}
