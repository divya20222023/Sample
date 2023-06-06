package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cssss {
	
	
public static void main(String[] args) throws InterruptedException, IOException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://adactinhotelapp.com/");
		 //css-using contains
		 driver.findElement(By.cssSelector ("input[id*='user']")).sendKeys("divya2025");
		 //css-using startswith($)
		 driver.findElement(By.cssSelector ("input[id$='word']")).sendKeys("OF3GJM");
		 
		 WebElement loginbtn = driver.findElement(By.cssSelector("input#login"));
		 loginbtn.click();
		
		 	

}
}