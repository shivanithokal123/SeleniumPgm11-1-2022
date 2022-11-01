package Parameterization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {  
	public static void main(String args[]) throws IOException {
		//
		int [] serial =new int [10];//for coloumn 0 code for serial number
		for (int i=0;i<serial.length;i++)
		{
			serial[i]=i+1;
			
		}
		//for col 1
		String [] name = new String[10];
		name[0]="UM-1";
		name[1]="UM-2";
		name[2]="UM-3";
		name[3]="UM-4";
		name[4]="UM-5";
		name[5]="UM-6";
		name[6]="UM-7";
		name[7]="UM-8";
		name[8]="UM-9";
		name[9]="UM-10";
		
		String [] result = new String[10];
		result[0]="working";
		result[1]="Not working";
		result[2]="working";
		result[3]=" Not working";
		result[4]="working";
		result[5]="working";
		result[6]="working";
		result[7]="Not working";
		result[8]="working";
		result[9]="Not working";
		
		
		//Intract with Excel cell
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//Create Sheet
		XSSFSheet Sheet= wb.createSheet("UNB EMP DATA");
		
		//create Row
		XSSFRow row ;
		row = Sheet.createRow(0);
		
		//Create cell
		XSSFCell cell0 = row.createCell(0);
		XSSFCell cell1 = row.createCell(1);
		XSSFCell cell2 = row.createCell(2);
		
		
		//logic 
		for(int i=0;i<serial.length;i++)
			//for row
		{
			row = Sheet.createRow(i +1);
			//0+1= 1, 1+1=2 , 2+1=3
		
	         
		        for(int j =0 ; j<3 ; j++)
		       {
		        	//exicute  Seconf for loop all this secuption upto get false value the go to uper value and increment 
					
			         //for col
		                  	XSSFCell cell = row.createCell(j);//0 1 2 
			               if(cell.getColumnIndex()==0) {
			            	 cell.setCellValue(serial[i]);
			                  }
 		                      else if (cell.getColumnIndex()==1)
		                     {
			                    cell.setCellValue(name[i]);
			                   }
 		                     else if (cell.getColumnIndex()==2)
 		                      {
 			                   cell.setCellValue(result[i]);
 		                          }
		         }
	      }
	
	//write in excel Sheet
	String path="C:\\Users\\Shivani\\Documents\\UNB-Per\\Excel\\WriteDataFromSelenium.xlsx";
	FileOutputStream out = new FileOutputStream(path);
	 wb.write(out);
	 System.out.println("file is Genrated");
	 out.close();
}
}
