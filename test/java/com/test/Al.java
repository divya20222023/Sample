package com.test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Al {
	
	
	
public static void main(String[] args) throws InterruptedException, IOException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/alerts");
		
		
		
		driver.findElement(By.xpath("//*[text()='Click me']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Alert b=driver.switchTo().alert();
		Thread.sleep(3000);
		b.dismiss();
		
				





}


	

	
}


	

