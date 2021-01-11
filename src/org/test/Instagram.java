package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\deLL\\eclipse-workspace\\selenuium01\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	
	WebElement us = driver.findElement(By.name("username"));
	us.sendKeys("8825461756");
	
	WebElement pa = driver.findElement(By.name("password"));
	pa.sendKeys("123456789");
}
}
