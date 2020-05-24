package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement down = driver.findElement(By.xpath("//b[text()='Best Selenium training center in OMR']"));
	
	js.executeScript("arguments[0].scrollIntoView(true)", down);
	
	js.executeScript("arguments[0].setAttribute('style','background:red')", down);	
	

}
}
