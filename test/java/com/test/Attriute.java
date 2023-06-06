package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attriute {
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.facebook.com/");
		 WebElement user = driver.findElement(By.id("email"));
		 WebElement pass = driver.findElement(By.id("pass"));

	WebElement loginBtn = driver.findElement(By.xpath("//*[@name='login']"));
		 
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].setAttribute('value','HelloJava')",user);
	js.executeScript("arguments[0].setAttribute('value','123456')",pass);
	js.executeScript("arguments[0].click()",loginBtn );
	
	
	
	
	}
}