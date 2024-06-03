package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTopicsCovered {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qa.jbktest.com/online-exam#Testing");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Manual Testing(ISTQB)']")).click();
		driver.findElement(By.id("countbtn")).click();
		driver.findElement(By.id("loginmobile")).sendKeys("9567893082");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.xpath("(//*[text()='View Details '])[5]")).click();
		driver.findElement(By.className("pull-right")).click();
}
}
