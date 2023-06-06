package com.basee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;
	public static void browserLaunch() {
			
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(options);
		 driver.get("https://adactinhotelapp.com");
	}	 
	public static String stringData(int row,int cell)throws IOException{
File f=new File("C:\\Users\\srija\\eclipse-workspace\\Sample\\testdata\\Sample.xlsx");
		FileInputStream input=new FileInputStream(f);
	Workbook w =new XSSFWorkbook(input);
		Sheet s = w.getSheet("selenium");
		Row r = s.getRow(row);
		Cell c=r.getCell(cell);
		 String value = c.getStringCellValue();
		return value;
	}
	public static String numericData(int row,int cell)throws IOException{
		File f=new File("C:\\Users\\srija\\eclipse-workspace\\Sample\\testdata\\Sample.xlsx");
				FileInputStream input=new FileInputStream(f);
			Workbook w=new XSSFWorkbook(input);
				Sheet s = w.getSheet("selenium");
				Row r = s.getRow(row);
				Cell c=r.getCell(cell);
				 double d=c.getNumericCellValue();
				long l=(long)d;
				String value = String.valueOf(l);
				return value;
			}
	public static String stringData1(int row,int cell)throws IOException{
		File f=new File("C:\\Users\\srija\\eclipse-workspace\\Sample\\testdata\\Sample.xlsx");
				FileInputStream input=new FileInputStream(f);
			Workbook w =new XSSFWorkbook(input);
				Sheet s = w.getSheet("junit");
				Row r = s.getRow(row);
				Cell c=r.getCell(cell);
				 String value = c.getStringCellValue();
				return value;
			}
	






}
	







	