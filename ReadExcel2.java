package com.TestUtil;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("E:\\Selenium\\Data\\TestData.xlsx");
		
		FileInputStream ip = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		
		XSSFSheet sheet1 =  wb.getSheetAt(0);
		
		int rowCount = sheet1.getLastRowNum();
		
		System.out.println(rowCount);
		
		for (int i=0; i<=rowCount; i++) {
			
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from Row" +i + "is "+data0);
		}
		
		wb.close();		

	}

}
