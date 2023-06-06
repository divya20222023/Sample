package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
public static void main(String[] args) throws InterruptedException, IOException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(3000);
		 WebElement down = driver.findElement(By.xpath("//*[contains(text(),'Back to top')]"));
		 WebElement up = driver.findElement(By.xpath("//h2[contains(text(),'Today’s Deals')]"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false)",down);
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].scrollIntoView(true)",up);
		 
		 
}
}