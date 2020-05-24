package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','java')", txtEmail);
		
		Object o=js.executeScript("return arguments[0].getAttribute('value')", txtEmail);
		
		String s=(String)o;
		
		System.out.println(s);
		
		WebElement txtPsswd = driver.findElement(By.id("pass"));
		
		js.executeScript("arguments[0].setAttribute('value','Selenium')", txtPsswd);
		
		Object ob=js.executeScript("return arguments[0].getAttribute('value')", txtPsswd);
		
		String st=(String)ob;
		
		System.out.println(st);
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		js.executeScript("arguments[0].click()", btnLogin);
		

}
}