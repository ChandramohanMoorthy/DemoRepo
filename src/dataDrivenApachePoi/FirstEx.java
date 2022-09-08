package dataDrivenApachePoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class FirstEx {

	public static void main(String[] args) throws IOException 
	{
		
		String fileloc="C:\\Users\\my pc\\OneDrive\\Desktop\\Test.xlsx";
		
		System.out.println("File path is : "+fileloc);
		FileInputStream stream= new FileInputStream(fileloc);
		
				Workbook wb = new XSSFWorkbook(stream);
				Sheet sheet=(XSSFSheet) wb.getSheet("Sheet1");
			
			int rows=sheet.getLastRowNum();
			System.out.println("No of rows"+rows);
			int cols=sheet.getRow(1).getLastCellNum();
			System.out.println("No of columns"+cols);
			for(int r=0;r<=rows;r++) 
			{
				
				Row row=sheet.getRow(r);
				for(int c=0;c<=cols;c++)
				{
					
					Cell cell=row.getCell(c);
					
					
					switch(cell.getCellType())
					{
						case STRING:System.out.print(cell.getStringCellValue());break;
						case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
						case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
					
					}
				}
				System.out.print(" | ");
				
				
			}
		}

	}


