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

public class All_Data {
	
	public static void Alldata() throws IOException {
		
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project1\\User Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String value = c.getStringCellValue();
					
					System.out.println(value);
					
				}
				
				else if (type.equals(CellType.NUMERIC)) {
					
					double Numericvalue = c.getNumericCellValue();
					
					int v = (int) Numericvalue;
					
					String value = Integer.toString(v);
					
					String value1 = String.valueOf(Numericvalue);
					
					System.out.println(value1);
					
				}
		}
			
		}
		wb.close();
		
	}
	
	public static void main(String[]args) throws IOException {
		 
		Alldata();
		
		
	}
	
	
	
	

}
