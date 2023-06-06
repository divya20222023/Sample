package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	
	static WebDriver driver;
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	
	public static void maxi() {
		driver.manage().window().maximize();
		
		
		
		
		
		
	}
	

}
