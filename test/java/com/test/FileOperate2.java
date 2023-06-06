package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperate2 {
	
	
	
	public static void main(String[]args) throws IOException {
		//file operation
		File f=new File("C:\\FileOperation\\java1\\sample.txt");
		//to append data with existing data
		
		FileUtils.write(f,"divya",true);

}
}