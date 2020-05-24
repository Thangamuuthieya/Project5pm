package org.gavs.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://tspsconetimereg.tspsc.gov.in/oneTimeRegistration.tspsc");
		
		WebElement Dist = driver.findElement(By.id("nativeDistrict"));
		
		Select s =new Select(Dist);
		
		s.selectByVisibleText("Warangal");
		
		WebElement Community = driver.findElement(By.id("community"));
		
		Select se=new Select(Community);
		
		se.selectByValue("2");
		
		WebElement Mandal = driver.findElement(By.id("nativeMandal"));
		
		Select sel=new Select(Mandal);
		
		sel.selectByIndex(2);
		
		List<WebElement> opts1 = sel.getAllSelectedOptions();
		
		for (WebElement x : opts1) {
			
			String text = x.getText();
			
			System.out.println(text);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
