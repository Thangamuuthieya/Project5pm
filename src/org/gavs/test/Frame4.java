package org.gavs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame4 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		Thread.sleep(5000);
		WebElement txtUsr = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		txtUsr.click();
		Thread.sleep(3000);
		txtUsr.sendKeys("14213525");
		
		WebElement txtPswd = driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']"));
		txtPswd.sendKeys("vikram");
		
		WebElement butnSub = driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']"));
		butnSub.click();
		
		
}
}