package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("signup-tab")).click();
		driver.findElement(By.id("name")).sendKeys("abcde");
		driver.findElement(By.id("emailid")).sendKeys("586@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("9567893082");
		
		Actions action =new Actions(driver);
		
	      action.sendKeys(Keys.TAB).perform();
	      action.sendKeys(Keys.TAB).perform();
	      action.sendKeys(Keys.TAB).perform();
	    

		     
		driver.findElement(By.id("agree")).click();

	      
		driver.findElement(By.id("emailbtn")).click();


		


		
		
	}
	
	

}
