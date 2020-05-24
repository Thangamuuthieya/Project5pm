package org.gavs.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {
	
	public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/index.html");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement down = driver.findElement(By.xpath("//span[text()='Greens Technology Tambaram']"));
	
	js.executeScript("arguments[0].scrollIntoView(true)", down);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\thangamuuthieya.r\\Downloads\\screenshot");
	
	FileUtils.copyFileToDirectory(src, dest);
	

}
}
