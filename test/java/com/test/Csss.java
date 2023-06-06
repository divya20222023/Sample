package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Csss {
	
	
	
public static void main(String[] args) throws InterruptedException, IOException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.facebook.com/");
		 //css-using id
		 driver.findElement(By.cssSelector("input#email")).sendKeys("hellojava");
		 //css-using multiple attributes
		 driver.findElement( By.cssSelector("input[id='pass'][name='pass']")).sendKeys("123456");
		 
	
	

}
}