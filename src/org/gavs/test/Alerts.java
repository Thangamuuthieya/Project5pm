package org.gavs.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	Thread.sleep(5000);
	
	WebElement buttnOK = driver.findElement(By.xpath("//a[@href='#OKTab']"));
	buttnOK.click();
	
	//button[@class='btn btn-danger']
	Thread.sleep(3000);
	WebElement buttnClick = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	buttnClick.click();
	
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	
	a.accept();
	
	Thread.sleep(2000);
	WebElement buttnCancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	buttnCancel.click();
	
	Thread.sleep(3000);
	WebElement buttnClck = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	buttnClck.click();
	
	Thread.sleep(2000);
	Alert al=driver.switchTo().alert();
	
	al.dismiss();
	
	Thread.sleep(2000);
	WebElement buttnText = driver.findElement(By.xpath("//a[@href='#Textbox']"));
	buttnText.click();
	
	Thread.sleep(2000);
	WebElement buttnClk = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	buttnClk.click();
	
	Thread.sleep(2000);
	Alert alt= driver.switchTo().alert();
	
	alt.sendKeys("users");
	
	String text = alt.getText();
	
	System.out.println(text);

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
