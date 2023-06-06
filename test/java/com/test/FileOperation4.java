package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperation4 {
	
	
	public static void main(String[]args) throws IOException {
		//file operation
		File f=new File("C:\\FileOperation\\java1\\sample.txt");
		
		//to copy the data from one file to another file
		File f1=new File("C:\\FileOperation\\java1\\demo.txt");
		FileUtils.copyFile(f, f1);
		
		List<String> read = FileUtils.readLines(f1);
        for(String s:read) {
        	System.out.println(s);
        }
}
}