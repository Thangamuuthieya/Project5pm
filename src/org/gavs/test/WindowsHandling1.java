package org.gavs.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		Thread.sleep(3000);
		
		WebElement selLap = driver.findElement(By.xpath("//img[@src='https://n3.sdlcdn.com/imgs/j/b/7/large/HP-15-Core-i5-8th-SDL978808278-1-73008.jpeg']"));
		selLap.click();
		
		Thread.sleep(3000);
		
	    String parID = driver.getWindowHandle();
	    System.out.println(parID);
	    
	    Set<String> allID=driver.getWindowHandles();
	    
	    for (String x : allID) {
	    	if(!(x.equals(parID))){
	    		System.out.println(x);    	   		
	    		    		
	    	}
	    	
	    	   driver.switchTo().window(x);	
		}

	
		WebElement buttnATC = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		buttnATC.click(); 
		
		Thread.sleep(5000);
		
		WebElement txtpay = driver.findElement(By.xpath("//span[text()='Rs. 45,000']"));
		String text = txtpay.getText();
		System.out.println(text);
		
	}

}
