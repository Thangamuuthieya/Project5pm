package org.gavs.test;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	
	List<WebElement> frames = driver.findElements(By.tagName("frameset"));
	int noOfFrames = frames.size();
	System.out.println(noOfFrames);
	
	Thread.sleep(5000);
	
	driver.switchTo().frame(0);
	
	WebElement  link = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
	link.click();
	
	Thread.sleep(3000);

	Alert a =driver.switchTo().alert();
	a.accept();

	
	
	}
	
	
}
