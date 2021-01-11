package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\deLL\\eclipse-workspace\\selenuium01\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	
	
	WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	pass.sendKeys("gsh45slsb");
	
}
}
