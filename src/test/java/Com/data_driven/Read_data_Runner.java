package Com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Com.DD_Baseclass.Base_Class_Excel;

public class Read_data_Runner extends Base_Class_Excel{
	
	public static void main(String[]args) throws FileNotFoundException {
		
		ParticularData("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project1\\Test cases for Adactin.xlsx",3,6);
		
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project1\\Test cases for Adactin.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		
		
		
		
		
		
		
	}

}
