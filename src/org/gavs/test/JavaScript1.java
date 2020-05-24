package org.gavs.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/");
		
		driver.manage().window().maximize();
		
//		Alert a=driver.switchTo().alert();
//		a.accept();
		
		Thread.sleep(10000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement down = driver.findElement(By.xpath("//a[text()='Katalon']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
		WebElement up = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
		System.out.println("Pass");
		
		
	
}
}
