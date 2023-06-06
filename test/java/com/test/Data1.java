package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data1 {
	
	
	
	
public static void main(String[]args) throws IOException {
		
		//to update values in excel
		
		File f=new File("C:\\Users\\srija\\eclipse-workspace\\Sample\\testdata\\Sample.xlsx");
		FileInputStream input =new FileInputStream(f);
		
	Workbook w=new XSSFWorkbook(input);
	 Sheet s=w.getSheet("javaworld");
	 Row r=s.getRow(3);
	 Cell c=r.getCell(1);
	 String s1=c.getStringCellValue();
	 if(s1.equals("besantonline")) {
		 
	 
	 
	 c.setCellValue("besantoffline");
	 }
	 FileOutputStream output=new FileOutputStream(f);
	 w.write(output);
	 System.out.println("its done");
	
	}

}
