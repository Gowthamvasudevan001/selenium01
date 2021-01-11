package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adact {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\deLL\\eclipse-workspace\\selenuium01\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://adactinhotelapp.com/");
	
	WebElement uss = driver.findElement(By.id("username"));
	uss.sendKeys("ghsdjdbd");
	
	WebElement paaa = driver.findElement(By.id("password"));
	paaa.sendKeys("215ldjdd");
}
}
