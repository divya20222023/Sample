package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broimg {
	
public static void main(String[] args) throws IOException   {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://the-internet.herokuapp.com/broken_images");
		 driver.manage().window().maximize();
List<WebElement> links = driver.findElements(By.tagName("img"));
        
        int size = links.size();
        System.out.println(size);
        
        for(WebElement w:links) {
        
        	String allLinks = w.getAttribute("src");
        	System.out.println(allLinks);
        	
        	//create an instance for the URL
        	URL url=new URL(allLinks);
        	
        	//open the connection to the server
        	URLConnection urlConnection = url.openConnection();
        	
        	//to send the request to the server
        	HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
        	
        	//to connect to the server
        	httpURLConnection.connect();
        	
        	if(httpURLConnection.getResponseCode()==200) {
        		
        		System.out.println(allLinks+" - "+httpURLConnection.getResponseMessage());
        		

        	}
        	
        	else {
        		System.err.println(allLinks+" - "+httpURLConnection.getResponseCode()+" - "+httpURLConnection.getResponseMessage());
        	}
        	
        }
}
}


