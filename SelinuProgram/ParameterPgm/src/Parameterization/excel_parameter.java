package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel_parameter {
	public static void main(String args[]) throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\Shivani\\Documents\\UNB-Per\\Excel\\OT1.xlsx";
		FileInputStream f = new FileInputStream(path);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Documents\\UNB-Per\\Selinum jar file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		//WorkbookFactory.create(file) we get acess 
		//for Numeric data access from Excel sheet start from 0 row and 0 col
		int val1 = (int) WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(val1);
		    
		FileInputStream f1 = new FileInputStream(path);

		   //for String data access from Excel sheet
           String val2= WorkbookFactory.create(f1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
           System.out.println(val2);
	    
 		   FileInputStream f2 = new FileInputStream(path);
 		
		       CellType val3 = WorkbookFactory.create(f2).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
		       //System.out.println(val3);
              //Using id we get excel data and fetch to id input 
             driver.findElement(By.xpath("//input[@id='email']")).sendKeys(val2);
 		
 		        FileInputStream f3 = new FileInputStream(path);
 		
               //last row or last col
                int val4 = WorkbookFactory.create(f3).getSheet("Sheet1").getLastRowNum();
 	            System.out.println(val4);
 	            
	}
}
