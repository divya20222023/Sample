package com.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	
	
	
public static void main(String[] args) throws InterruptedException, IOException, AWTException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("divya2025");
		 driver.findElement(By.id("password")).sendKeys("OF3GJM");
		 driver.findElement(By.id("login")).click();
		 
		 WebElement loc = driver.findElement(By.id("location"));
		 Select s=new Select(loc);
		 s.selectByVisibleText("Melbourne");
		 
		 WebElement hot = driver.findElement(By.id("hotels"));
		 Select h=new Select(hot);
		 h.selectByVisibleText("Hotel Sunshine");
		 
		 WebElement room = driver.findElement(By.id("room_type"));
		 Select r=new Select(room);
		 r.selectByVisibleText("Standard");
		 
		 WebElement rom = driver.findElement(By.id("room_nos"));
		 Select n=new Select(rom);
		 n.selectByValue("2");
		 
		 WebElement datepick = driver.findElement(By.id("datepick_in"));
		 
		datepick.sendKeys("05/04/2023");
		 
		 WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("06/04/2023");
		 
		 WebElement adtroom = driver.findElement(By.id("adult_room"));
		 Select a=new Select(adtroom);
		 a.selectByVisibleText("2 - Two"); 
		 
		 WebElement chdroom = driver.findElement(By.id("child_room"));
		 Select c=new Select(chdroom);
		 c.selectByVisibleText("3 - Three"); 
		 
		 driver.findElement(By.id("Submit")).click();
		  driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("divya");
		driver.findElement(By.id("last_name")).sendKeys("k");
		driver.findElement(By.id("address")).sendKeys("214 Yelehanka");
		driver.findElement(By.id("cc_num")).sendKeys("3456 3456 2385 3425");
		
		WebElement cc = driver.findElement(By.id("cc_type"));
		 Select t=new Select(cc);
		 t.selectByVisibleText("VISA"); 
		 
		 WebElement month = driver.findElement(By.id("cc_exp_month"));
		 Select m=new Select(month);
		 m.selectByVisibleText("February");
		 
		 WebElement year = driver.findElement(By.id("cc_exp_year"));
		 Select y=new Select(year);
		 y.selectByVisibleText("2022");
		 
		 driver.findElement(By.id("cc_cvv")).sendKeys("214");
		 driver.findElement(By.id("book_now")).click();
		 
}
}