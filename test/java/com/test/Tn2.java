package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tn2 {
	
	@Test
	private void tc1() {
		
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	
	
	}
	
	
	
	

}
