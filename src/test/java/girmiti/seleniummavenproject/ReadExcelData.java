package girmiti.seleniummavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	@Test
	public void readDataFromExcel() throws Exception {
	File src=new File("E:\\STBJ\\Notes\\ExcelData.xls");
	FileInputStream fis=new FileInputStream(src);
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	HSSFSheet sheet1=wb.getSheetAt(0);
	int rowcount=sheet1.getLastRowNum();
	System.out.println("total row count is : "+rowcount);
	for(int i=0;i<=rowcount;i++) {
	String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println("data from excel is : "+data0);
	}
	/*String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("data from excel is :"+data0);
	System.out.println("data from excel is :"+data1);*/
	wb.close();
	}
}
