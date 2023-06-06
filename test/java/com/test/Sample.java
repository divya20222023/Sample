package com.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args)throws IOException{
	
		File f=new File("C:\\Users\\srija\\eclipse-workspace\\Sample\\testdata\\Sample.xlsx");
		
		
		FileInputStream input=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(input);
		Sheet s = w.getSheet("selenium");
		Row r = s.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c);
		
		
	
	}
	

}
