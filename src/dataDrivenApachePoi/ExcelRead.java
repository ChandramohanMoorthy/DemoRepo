package dataDrivenApachePoi;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

		public static void readExcel() throws IOException
		{
			String path="C:\\Users\\my pc\\OneDrive\\Desktop\\Test.xlsx";
			
			Workbook wb=new XSSFWorkbook(path);
			
			Sheet sheet=wb.getSheetAt(0);
			
			Iterator<Row> rowit=sheet.iterator();
			while(rowit.hasNext())
			{
				Row row=rowit.next();
				
				Iterator<Cell> cellit=row.iterator();
				while(cellit.hasNext())
				{
					Cell cell=cellit.next();
					System.out.println(cell);
					
				}
				
			}
			
		}
	
	public static void main(String[] args) throws IOException
	{
		readExcel();
		
	}

}
