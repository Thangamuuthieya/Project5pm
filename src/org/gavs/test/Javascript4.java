package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript4 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement txtUsrname = driver.findElement(By.id("username"));
		
		js.executeScript("arguments[0].setAttribute('value','java')", txtUsrname);
		
		WebElement txtPsswd = driver.findElement(By.id("password"));
		
		js.executeScript("arguments[0].setAttribute('value','Selenium')", txtPsswd);
		
		Object o=js.executeScript("return arguments[0].getAttribute('value')", txtUsrname);
		
		String s=(String)o;
		
		System.out.println(s);
		
		Object ob=js.executeScript("return arguments[0].getAttribute('value')", txtPsswd);
		
		String st=(String)ob;
		
		System.out.println(st);
		
		WebElement butnLogin = driver.findElement(By.id("login"));
		
		js.executeScript("arguments[0].click()",butnLogin);

}
}

