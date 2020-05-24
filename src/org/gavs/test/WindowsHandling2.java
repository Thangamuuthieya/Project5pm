package org.gavs.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		WebElement txtsearch = driver.findElement(By.id("headerSearch"));
		txtsearch.sendKeys("celling fan");
		Thread.sleep(3000);
		WebElement buttnsearch = driver.findElement(By.id("headerSearchButton"));
		buttnsearch.click();
		
		//img[@title='Kensgrove 72 in. LED Indoor/Outdoor Espresso Bronze Ceiling Fan with Remote Control']
		
		Thread.sleep(5000);
		

		WebElement selFan = driver.findElement(By.xpath("//img[@title='Kensgrove 72 in. LED Indoor/Outdoor Espresso Bronze Ceiling Fan with Remote Control']"));
		selFan.click();
		
		//span[text()='Add to Cart']
		String parID = driver.getWindowHandle();
		System.out.println(parID);
		
		Set<String> allId = driver.getWindowHandles();
		for (String x : allId) {
			if(!(x.equals(parID))) {
				
				System.out.println(x);
				
				
				
			}
			
			driver.switchTo().window(x);
			
			
			
			
		}
		
		Thread.sleep(5000);

		WebElement buttnAdd = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		buttnAdd.click();
		
		//div[@class='u__husky']
		
	//	Taxes are calculated during checkout.
		
		
		Thread.sleep(6000);
		
		WebElement txtTotal = driver.findElement(By.xpath("//p[text()='Taxes are calculated during checkout.']"));
		String text = txtTotal.getText();
		System.out.println(text);
		
		
}


}
