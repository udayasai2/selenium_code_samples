package girmiti.seleniummavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelDataConfig {
	HSSFWorkbook wb;
	HSSFSheet sheet1;
	
	public ReadExcelDataConfig(String excelpath) {
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new HSSFWorkbook(fis);			
		}  catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getData(int sheetnumber,int row,int column) {
		sheet1=wb.getSheetAt(sheetnumber);
		return sheet1.getRow(row).getCell(column).getStringCellValue();		
	}
}
