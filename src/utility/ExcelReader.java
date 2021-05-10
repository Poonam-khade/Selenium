package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static void main(String[] args) throws IOException {
		
		// get path
	File  source = new File(System.getProperty("user.dir")+"//TestData//Sample_file.xlsx");
	//load file
	FileInputStream input = new FileInputStream(source);
	
	
	//load workbook for excel sheet
	XSSFWorkbook wb = new XSSFWorkbook(input);
	
	//load sheet
	XSSFSheet sh1 = wb.getSheetAt(0);
	
	//String value = sh1.getRow(5).getCell(1).getStringCellValue();
	
//	String value1=sh1.getRow(2).getCell(0).getStringCellValue();
	
	//System.out.println(value1);
	
	CellType type = sh1.getRow(3).getCell(0).getCellType();
	
	if(type.equals("100"))
	{
		String value12 = String.valueOf(sh1.getRow(3).getCell(0).getNumericCellValue());
		
		System.out.println(value12);
	}
	
	}

}
