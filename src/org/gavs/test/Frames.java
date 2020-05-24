package org.gavs.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	
	List<WebElement> frames = driver.findElements(By.tagName("iframes"));
	
	int noOfFrames = frames.size();
	System.out.println(noOfFrames);
	
	
	Thread.sleep(5000);
	
	WebElement butnsubmit = driver.findElement(By.xpath("//input[@type='submit']"));
	butnsubmit.click();
	
	Alert a = driver.switchTo().alert();
	a.accept();
	
	
	

	
	

}
}
