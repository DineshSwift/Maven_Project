package Com.DD_Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base_Class_Excel {
	
	public static String value;
	
	public static String ParticularData(String path,int row_index,int cell_index) throws FileNotFoundException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheetat = wb.getSheetAt(0);
		
		Row row = sheetat.getRow(row_index);
		
		Cell cell = row.getCell(cell_index);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
		value = cell.getStringCellValue();
		
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int val = (int) numericCellValue;
			
			value = String.valueOf(val);
			
		}
		
		return value;
	}

}
