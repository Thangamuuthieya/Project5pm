package org.gavs.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		
		WebElement Passport=driver.findElement(By.id("dcdrLocation"));
		
		Select s=new Select(Passport);
		
		s.selectByIndex(2);
		 Thread.sleep(3000);
		
		s.selectByValue("3");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Cochin");
		
		List<WebElement> opts = s.getOptions();
		
		for (WebElement x : opts) {
			
			String text = x.getText();
			
			System.out.println(text);
			
		}
		
		System.out.print("\n");
		
		List<WebElement> allOpts = s.getAllSelectedOptions();
		
		for (WebElement y : allOpts) {
			
			String text1 = y.getText();
			
			System.out.println(text1);			
			
		}
		
		System.out.print("\n");
		
		WebElement firstSel = s.getFirstSelectedOption();
		String text2 = firstSel.getText();
		
		System.out.println(text2);

		
	}

}
