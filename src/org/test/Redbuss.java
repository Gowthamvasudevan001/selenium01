package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Redbuss {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\deLL\\eclipse-workspace\\selenuium01\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/ ");
	
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("kumbakonam");
	
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("chennai");
	
}
}
