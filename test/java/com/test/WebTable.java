package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	
public static void main(String[] args)  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("http://seleniumpractise.blogspot.com/2021/08/");
		 driver.manage().window().maximize();
		 
		 //to print headers
		 List<WebElement> allHeaders = driver.findElements(By.xpath("//*[@id='customers']//th"));
         
		 int size=allHeaders.size();
         System.out.println(size);
        
         //to print allHeaders text
         
         for(WebElement w:allHeaders)
         {
        	 String text = w.getText();
        	 System.out.println(text);
         }
         //to find a particular data in webtable
         List<WebElement> allDatas = driver.findElements(By.xpath("//*[@id='customers']//td"));
         
         for(WebElement w1:allDatas) {
        	 String text1 = w1.getText();
        	 System.out.println(text1);
        	
        	 if(text1.equals("Selenium")) {
        		
        	  System.out.println("Test case passed");
        		break;
        	}
        	 
         }

         //TO SELECT PARTiCULAR VALUE
         //checkbox by using xpath
         WebElement check = driver.findElement(By.xpath("//*[text()='Selenium']//preceding-sibling::td//input"));
         check.click();


}
}
