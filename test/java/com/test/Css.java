package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://adactinhotelapp.com/");
		 //css-using className
		 driver.findElement(By.cssSelector("input.login_input")).sendKeys("divya2025");
		 //css-using attribute
		 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("OF3GJM");
		 //css-using id
		 WebElement loginBtn = driver.findElement(By.cssSelector("input#login"));
		 loginBtn.click();
		

	

}
}