package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto {
	
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\srija\\eclipse-workspace\\Besant\\driver.exe" );

	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("chennai");
	
	Thread.sleep(3000);
	List<WebElement> autoSuggestion = driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
            int size = autoSuggestion.size();
            System.out.println(size);
            autoSuggestion.get(size-1).click();
}
}