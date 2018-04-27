package girmiti.seleniummavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class WriteToExcel {
	@Test
	public void writeToExcel() throws Exception {
		File src=new File("E:\\STBJ\\Notes\\ExcelData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(0).createCell(3).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();
	}
}
