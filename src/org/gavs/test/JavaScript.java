package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement down = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",down );
		
		System.out.println("greens over all reviws");

	}

}
