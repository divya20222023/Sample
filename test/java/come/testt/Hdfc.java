package come.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hdfc {
	
	public static void main(String[]args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		 driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 driver.manage().window().maximize();
		
		 Thread.sleep(2000);
		 
		 WebElement w = driver.findElement(By.name("login_page"));
		 driver.switchTo().frame(w);
		 WebElement customer = driver.findElement(By.xpath("//input[@type='text']"));
			customer.sendKeys("helloworld");
	}
}