package Com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particularcolumndata {
	
	public static void particularcolumndata() throws IOException {
		
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project1\\User Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
		
		Row r = s.getRow(i);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String cellvalue = c.getStringCellValue();
			
			System.out.println(cellvalue);
		}
		else {	
			
			if(type.equals(CellType.NUMERIC)) {
				
				double Value = c.getNumericCellValue();
				
				int v= (int) Value;
				
				String s1 = Integer.toString(v);
				
				System.out.println(s1);
			
			}
			
		}}}	
	
		public static void main(String[]args) throws IOException {
			
			particularcolumndata();
		}
		
}	
		
		
		
		
		
		
		
		
		
		



