package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript5 {
	
	public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Thread.sleep(3000);
			
			WebElement txtEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			
			js.executeScript("arguments[0].setAttribute('value','java')", txtEmail);
			
			Thread.sleep(3000);
			WebElement txtPsswd = driver.findElement(By.xpath("//input[@type='password']"));
			
			js.executeScript("arguments[0].setAttribute('value','selenium')", txtPsswd);
			
			Thread.sleep(3000);
			
			WebElement buttnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
			
			js.executeScript("arguments[0].click()",buttnSubmit);
			
			Object o=js.executeScript("return arguments[0].getAttribute('value')", txtEmail);
			
			String s=(String)o;
			
			System.out.println(s);
		
			Object ob=js.executeScript("return arguments[0].getAttribute('value')", txtPsswd);
			
			String st=(String)ob;
			
			System.out.println(st);
			
			
			
			
			
	}
}