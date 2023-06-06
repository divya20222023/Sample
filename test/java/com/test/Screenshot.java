package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException  {
			
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.facebook.com/");
	
		 TakesScreenshot ts=(TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\srija\\eclipse-workspace\\Sample\\testdata\\fbpage.jpeg");
FileUtils.copyFile(source,destination);
	}
}