package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	
	driver.manage().window().maximize();                  
	
	WebElement selsign = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2'])[1]"));
	selsign.click();
	
	
	WebElement txtphne = driver.findElement(By.id("ap_email"));
	txtphne.sendKeys("9566115534");
		
	WebElement butncon = driver.findElement(By.id("continue"));
	butncon.click();
	
	WebElement txtpsswd = driver.findElement(By.id("ap_password"));
	txtpsswd.sendKeys("amazon123");
	
	WebElement butsignin = driver.findElement(By.id("signInSubmit"));
	butsignin.click();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	
	search.sendKeys("Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed)");
	
	Thread.sleep(5000);
	
	WebElement submitbtn = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	submitbtn.click();
	
	WebElement phnebtn = driver.findElement(By.xpath("//img[@alt='Apple iPhone XS Max, 64GB, Space Gray - For T-Mobile (Renewed)']"));
	phnebtn.click();
	
	WebElement imgbutn = driver.findElement(By.id("add-to-cart-button"));
	
	imgbutn.click();
	
	Thread.sleep(3000);
	
	WebElement chckbutn = driver.findElement(By.id("hlb-ptc-btn-native"));
	
	chckbutn.click();
	
	WebElement txtship = driver.findElement(By.xpath("//h1[text()='Select a shipping address']"));
	String text = txtship.getText();
	System.out.println(text);
	
	
	
	
	
}

}
