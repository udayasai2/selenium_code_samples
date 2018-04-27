package girmiti.seleniummavenproject;

import org.testng.annotations.Test;

public class ReadExcelData1 {
	
	@Test
	public void readExcel() {
		ReadExcelDataConfig excel=new ReadExcelDataConfig("E:\\STBJ\\Notes\\ExcelData.xls");
		System.out.println(excel.getData(1, 0, 0));
	}
}
