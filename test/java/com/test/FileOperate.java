package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperate {
	
	
	
	public static void main(String[]args) throws IOException {
		//file operation
		File f=new File("C:\\FileOperation\\java1\\sample.txt");
		
		FileUtils.write(f, "HI");
		System.out.println("done");
		
}
}