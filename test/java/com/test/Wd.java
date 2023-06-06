package com.test;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wd {
	
public static void main(String[] args) throws InterruptedException, AWTException{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
driver.manage().window().maximize();

String parentWindowId = driver.getWindowHandle();
System.out.println(parentWindowId);




Thread.sleep(3000);


 driver.findElement(By.id("newWindowBtn")).click();
 




Set<String> allWindowsId = driver.getWindowHandles();
System.out.println(allWindowsId);

for(String allWindows:allWindowsId) {
	
	if(!allWindows.equals(parentWindowId)) {
		driver.switchTo().window(allWindows);
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Hellojava");
		driver.close();
		
		
	}
}

driver.switchTo().window(parentWindowId);
driver.findElement(By.id("name")).sendKeys("Hello");

}
	
}
