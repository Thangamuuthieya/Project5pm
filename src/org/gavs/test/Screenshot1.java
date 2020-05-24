package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Appium']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		WebElement scrollup = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		
		System.out.println("scrollup");
		
		
		
		
		
	}

}
