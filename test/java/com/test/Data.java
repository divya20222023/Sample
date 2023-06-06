package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	
	
	
	public static void main(String[]args) throws IOException {
		
		
		
		File f=new File("C:\\Users\\srija\\eclipse-workspace\\Sample\\testdata\\Sample.xlsx");
		
	Workbook w=new XSSFWorkbook();
	 Sheet s=w.createSheet("javaworld");
	 Row r=s.createRow(3);
	 Cell c=r.createCell(1);
	 c.setCellValue("besantonline");
	 FileOutputStream output=new FileOutputStream(f);
	 w.write(output);
	 System.out.println("its done");
	
	}

}
