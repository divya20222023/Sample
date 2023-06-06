package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class FileOperate3 {
	
	
	public static void main(String[]args) throws IOException {
		//file operation
		File f=new File("C:\\FileOperation\\java1\\sample.txt");
		//to read the data from the file
		List<String> read=FileUtils.readLines(f);
		
		for(String s:read) {
			System.out.println(s);
		}

}
}