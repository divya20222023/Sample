package com.test;

import java.io.IOException;

import org.openqa.selenium.By;

import com.base.Base;

public class Demo extends Base {
 
	


public static void main(String[]args)throws IOException{
	//browser launch
	browserLaunch("https://www.facebook.com/");
	
	//print the title
	title();
	
	
	//sending values to textbox
	driver.findElement(By.id("email")).sendKeys(stringData(1,0));
	driver.findElement(By.id("pass")).sendKeys(numericData(1,1));

//quit
	quitBrowser();

}


	
}

