package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperate1 {
	
	
	
	public static void main(String[]args) throws IOException {
		//file operation
		File f=new File("C:\\FileOperation\\java1\\sample.txt");
		//to replace exixting value in file
		
		FileUtils.write(f, "hello",false);
		System.out.println("done");

}
}