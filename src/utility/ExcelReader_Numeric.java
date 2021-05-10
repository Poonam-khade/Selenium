package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader_Numeric {
	
	public static String m1(int row, int column) throws IOException {
		
		File source = new File(System.getProperty("user.dir")+"//TestData//Sample_file.xlsx");
		
		FileInputStream input = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(input);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File source1 = new File(System.getProperty("user.dir")+"//TestData//Sample_file.xlsx");
		
		FileOutputStream fout = new FileOutputStream(source1);
		sh1.createRow(5).createCell(0).setCellValue("shiv");
		wb.write(fout);
		CellType type = sh1.getRow(row).getCell(column).getCellType();
		
		String value= "";
		
		if(type==CellType.NUMERIC)
		{
			double number = sh1.getRow(row).getCell(column).getNumericCellValue();
			
			int intnum = (int)number;
		    value = String.valueOf(intnum);
		    System.out.println(value);
		}
		else 
		{
			 value = sh1.getRow(row).getCell(column).getStringCellValue();
			 System.out.println(value);
		
		}
		
		return null;
		
	}

	public static void main(String[] args) throws IOException {
		

		m1(5, 0);
	}
}
