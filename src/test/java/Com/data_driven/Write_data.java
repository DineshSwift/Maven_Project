package Com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	
	public static void main(String[]args) throws IOException {
		
		File f = new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\Write_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook();
		
	//First way
//		Sheet createsheet = wb.createSheet("User_name");
//		
//		Row createRow = createsheet.createRow(0);
//		
//		Cell createCell = createRow.createCell(0);
//		
//		createCell.setCellValue("Email");
		
		
		wb.createSheet("User_Dataa").createRow(0).createCell(0).setCellValue("Email");
		
		wb.getSheet("User_Dataa").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("User_Dataa").createRow(1).createCell(0).setCellValue("DINESH");
		
		wb.getSheet("User_Dataa").getRow(1).createCell(1).setCellValue("45678ASD");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();

		System.out.println("Write Successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
