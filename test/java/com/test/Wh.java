package com.test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wh {
	
	
public static void main(String[] args) throws InterruptedException, IOException, AWTException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println("title-"+title);
String url = driver.getCurrentUrl();
System.out.println("url-"+url);

		 WebElement t = driver.findElement(By.id("twotabsearchtextbox"));
WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));

		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value','iphone13')",t);
		 js.executeScript("arguments[0].click()",searchBtn);
		 
		 String parentWindowId = driver.getWindowHandle();
		 System.out.println(parentWindowId);
            Thread.sleep(3000);

		 
		 
		 
		 driver.findElement(By.xpath("//*[text()='Apple iPhone 13 Mini (256GB) - Pink']")).click();
		 
		 Set<String> allWindowsId = driver.getWindowHandles();
		 System.out.println(allWindowsId);
		 
		 for (String allWindows:allWindowsId) {
			 if(!allWindows.equals(parentWindowId)) {
			 
			 driver.switchTo().window(allWindows);
			 
			 driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
		 
		 
		 } 
		 }
}
}