package org.gavs.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		WebElement butnLogin = driver.findElement(By.xpath("(//a[contains (text(),'CONTINUE')])[1]"));
		butnLogin.click();
		
		WebElement butnsubmit = driver.findElement(By.id("Button2"));
		butnsubmit.click();
		
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		
		
		
		
		

}
}
