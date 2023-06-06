package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	
	
	
	
public static void main(String[] args) throws InterruptedException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://letcode.in/table");
		 driver.manage().window().maximize();
		 
		 //to print headers
		 
		 List<WebElement> allHeaders = driver.findElements(By.xpath("//*[@id='simpletable']//th"));
		 
		 for(WebElement w:allHeaders)
		 {
			 String text = w.getText();
			 System.out.println(text);
		 }
// to print  first column
		 
		 List<WebElement> allRows = driver.findElements(By.xpath("//*[@id='simpletable']//tbody//tr"));
        
		 for(WebElement w1:allRows)
{
	List<WebElement> column = w1.findElements(By.tagName("td"));
	WebElement firstColumn = column.get(0);
	System.out.println(firstColumn.getText());
}
//to select checkbox corresponding to the name		 
List<WebElement> allRows1  = driver.findElements(By.xpath("//*[@id='simpletable']//tbody//tr"));
          int size = allRows1.size();
            for(int i=0;i<size;i++) {
	
	List<WebElement> rows = allRows1.get(i).findElements(By.tagName("td"));
	WebElement lastName = rows.get(1);
	String text = lastName.getText();
	System.out.println(text);
	if(text.equals("Raj")) {
		Thread.sleep(5000);
		WebElement input = rows.get(3).findElement(By.tagName("input"));
	input.click();
	break;
	
	}
}



}

}	
	
	


