package org.gavs.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sprint.com/");
		
		Thread.sleep(10000);
		
		WebElement butnsignin = driver.findElement(By.xpath("//div[@class='sprint-brand-header-new--col ml-20']"));
		butnsignin.click();
		
		Thread.sleep(10000);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int noOfFrames = frames.size();
		System.out.println(noOfFrames);
		
//		driver.switchTo().frame("inqChatStage");
		
		WebElement username = driver.findElement(By.id("loginHeaderUsername"));
		username.sendKeys("Selenium");
		
		WebElement psswd = driver.findElement(By.id("loginHeaderPassword"));
		psswd.sendKeys("java");
		
		WebElement butnsubmit = driver.findElement(By.id("loginHeaderButton"));
		butnsubmit.click();
		

}
}
