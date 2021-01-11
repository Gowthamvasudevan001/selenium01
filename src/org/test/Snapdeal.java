package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\deLL\\eclipse-workspace\\selenuium01\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.snapdeal.com/login");
	
	WebElement enter = driver.findElement(By.id("userName"));
	enter.sendKeys("8825461756");
	
}
}
