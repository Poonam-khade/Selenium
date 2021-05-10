package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write {

	
	public static void writeData(int row ,int column) throws IOException
	{
File source = new File(System.getProperty("user.dir")+"//TestData//Sample_file.xlsx"); 
		
		FileInputStream input = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File source1 = new File(System.getProperty("user.dir")+"//TestData//Sample_file.xlsx");
		
		FileOutputStream fout = new FileOutputStream(source1);
		
	//	sh1.getRow(row).getCell(column).setCellValue("poonam");
		
		sh1.createRow(row).createCell(column).setCellValue("Sanap");
		
		wb.write(fout);	
		
	}
	public static void main(String[] args) throws IOException {
		
		writeData(9, 3);
	}
}
