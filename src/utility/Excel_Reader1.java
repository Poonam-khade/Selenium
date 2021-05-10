package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader1 {

	public static String readdata (int row,int column)  throws IOException {
		
		File source = new File("C:\\Users\\Sachin Sanap\\Desktop\\Sample_file.xlsx");
		
		FileInputStream input = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
			String value = sh1.getRow(row).getCell(column).getStringCellValue();
			
			System.out.println(value);
			
				return value;
	}
}
